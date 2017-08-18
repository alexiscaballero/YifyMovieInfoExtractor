package ytorrents.unmarshall;

import ListMovies.ListXML;
import ListMovies.Movie;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import OMDBMovie.OMDBMovie;
import RegexTest.RegexMatches;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.xml.bind.JAXBException;
import movieDetails.MovieDetails;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.jsoup.Jsoup;

public class Unmarshall {

    public static List<MovieDTO> getMovies(String jsonURL) throws URISyntaxException, MalformedURLException, JAXBException, IOException {
        List<MovieDTO> list = new ArrayList<MovieDTO>();
        ObjectMapper mapper = new ObjectMapper();
        String linkText = Jsoup.connect(jsonURL).userAgent("Mozilla").ignoreContentType(true).get().body().text();
        ListXML listt = mapper.readValue(linkText, ListXML.class);
        for (Movie item : listt.getData().getMovies()) {
            MovieDTO movie = new MovieDTO();
            movie.setId(item.getId().intValue());
            movie.setTittle(item.getTitle());
            movie.setYear(item.getYear().intValue());
            movie.setImdbCode(item.getImdbCode());
            movie.setImdbLink(item.getUrl());
            movie.setLanguage(item.getLanguage());
            movie.setGenres(item.getGenres());
            movie.setTorrent(item.getTorrents().toString());
            movie.setRuntime(item.getRuntime().intValue());
            movie.setRating(item.getRating());
            list.add(movie);
        }

        return list;
    }

    public static MovieDTO getMovie(String id) throws JAXBException, MalformedURLException, IOException {
        MovieDTO movie = new MovieDTO();
        ObjectMapper mapper = new ObjectMapper();
        String link = "https://yts.ag/api/v2/movie_details.json?movie_id=" + id;
        String linkText = Jsoup.connect(link).userAgent("Mozilla").ignoreContentType(true).get().body().text();
        MovieDetails jsonMovieDetails = mapper.readValue(linkText, MovieDetails.class);
        movieDetails.Movie film = jsonMovieDetails.getData().getMovie();
        movie.setTittle(film.getTitle());
        movie.setYear(film.getYear());
        movie.setGenres(film.getGenres());
        movie.setLongDescription(movie.getLongDescription());
        movie.setLanguage(film.getLanguage());
        movie.setRating(film.getRating());
        movie.setRuntime(film.getRuntime());
        movie.setId(film.getId());
        movie.setImdbCode(film.getImdbCode());
        movie.setDownloadCount(film.getDownloadCount());
        movie.setTorrent(film.getTorrents().toString());
        movie.setLikeCount(film.getLikeCount());
        movie.setImdbCode(film.getImdbCode());
        movie.setCover(film.getMediumCoverImage());
        movie.setUrl(film.getUrl());
        movie.setYoutubeTrailer(film.getYtTrailerCode());
        OMDBMovie extra = getExtraData(film.getImdbCode());
        movie.setDirector(extra.getDirector());
        movie.setActores(Arrays.asList(extra.getActors().split("\\s*,\\s*")));
        if (extra.getReleased().equalsIgnoreCase("N/A")) {
            movie.setTiempoEnSubir(999999);
        } else {
            DateTime dateTime1 = new DateTime(getDateYifyMovie(film.getDateUploaded()));
            DateTime dateTime2 = getDateOMDBMovie(formatear(extra.getReleased()));
            movie.setTiempoEnSubir(Days.daysBetween(dateTime1, dateTime2).getDays());
        }
        movie.setOscars(getOscars(extra.getAwards()));
        movie.setNominaciones(getNominaciones(extra.getAwards()));
        movie.setOtrosPremios(getOtrosPremios(extra.getAwards()));
        return movie;
    }

    public static OMDBMovie getExtraData(String imdbID) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String link = "http://www.omdbapi.com/?i=" + imdbID;
        String linkText = Jsoup.connect(link).userAgent("Mozilla").ignoreContentType(true).get().body().text();
        OMDBMovie jsonOMDBMovie = mapper.readValue(linkText, OMDBMovie.class);
        return jsonOMDBMovie;
    }

    public static Date getDateYifyMovie(String fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = formatter.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static DateTime getDateOMDBMovie(String fecha) {
        System.out.println(fecha.replace(" ", ""));
        org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("ddMMyyyy");
        DateTime dt = formatter.parseDateTime(fecha.replace(" ", ""));
        return dt;
    }

    public static int getOscars(String premiaciones) {
        int premios = 0;
        if (premiaciones.equalsIgnoreCase("N/A")) {
            premios = 0;
        } else {
            premios = RegexMatches.calcularCantidadPremios(premiaciones).get(0);
        }
        return premios;
    }

    public static int getNominaciones(String premiaciones) {
        int premios = 0;
        if (premiaciones.equalsIgnoreCase("N/A")) {
            premios = 0;
        } else {
            RegexMatches.calcularCantidadPremios(premiaciones).get(1);
        }
        return premios;
    }

    public static int getOtrosPremios(String premiaciones) {
        int premios = 0;
        if (premiaciones.equalsIgnoreCase("N/A")) {
            premios = 0;
        } else {
            RegexMatches.calcularCantidadPremios(premiaciones).get(2);
        }
        return premios;
    }

    private static String formatear(String released) {
        String date = released.replace("Jan", "05");
        date = date.replace("Feb", "05");
        date = date.replace("Mar", "05");
        date = date.replace("Apr", "05");
        date = date.replace("May", "05");
        date = date.replace("Jun", "05");
        date = date.replace("Jul", "05");
        date = date.replace("Aug", "05");
        date = date.replace("Sep", "05");
        date = date.replace("Oct", "05");
        date = date.replace("Nov", "05");
        date = date.replace("Dec", "05");
        return date;
    }
}
