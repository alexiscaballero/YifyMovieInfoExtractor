package ytorrents;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import javax.xml.bind.JAXBException;

import ytorrents.unmarshall.MovieDTO;
import ytorrents.unmarshall.Unmarshall;

public class YifyTorrents {

	private static YifyTorrents instance;

    public static YifyTorrents getInstancia() {
        if (instance == null) {
            instance = new YifyTorrents();
        }
        return instance;
    }
    
    public List<MovieDTO> search(String tittle) throws MalformedURLException, URISyntaxException, JAXBException, IOException {
    	List<MovieDTO> list = new ArrayList<MovieDTO>();
    	list = Unmarshall.getMovies("http://yify-torrents.com/api/list.xml?order=desc&limit=50&keywords="+tittle);
    	return list;
    }
    /*
    public List<UpcomingMovieDTO> upcomingMovies() throws MalformedURLException, JAXBException, URISyntaxException {
    	List<UpcomingMovieDTO> list = new ArrayList<UpcomingMovieDTO>();
    	list = Unmarshall.getUpcomingMovies();
    	return list;
    }
    */
    public List<MovieDTO> listAllMovies(int limit, String quality, String rating, String genre, String sort) throws MalformedURLException, URISyntaxException, JAXBException, IOException {
    	List<MovieDTO> list = new ArrayList<MovieDTO>();
    	list = Unmarshall.getMovies("https://yts.ag/api/v2/list_movies.json?sort="+sort+"&limit="+limit+"&rating="+rating+"&genre="+genre+"&quality="+quality);
    	return list;
    }
    
    public MovieDTO getMovie(String id) throws MalformedURLException, JAXBException, IOException {
    	return Unmarshall.getMovie(id);
    }
}
