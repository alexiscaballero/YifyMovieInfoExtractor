package ytorrents.unmarshall;

import java.util.List;

public class MovieDTO extends UpcomingMovieDTO {

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getYoutubeTrailer() {
        return youtubeTrailer;
    }

    public void setYoutubeTrailer(String youtubeTrailer) {
        this.youtubeTrailer = youtubeTrailer;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public int getDownloadCount() {
        return downloadCount;
    }
    
    public int getLikeCount() {
        return likeCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getTorrent() {
        return torrent;
    }

    public void setTorrent(String torrent) {
        this.torrent = torrent;
    }

    public int getTorrentSeeds() {
        return torrentSeeds;
    }

    public void setTorrentSeeds(int torrentSeeds) {
        this.torrentSeeds = torrentSeeds;
    }

    public int getTorrentPeers() {
        return torrentPeers;
    }

    public void setTorrentPeers(int torrentPeers) {
        this.torrentPeers = torrentPeers;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
    
    private int id = 0;
    private String url = "";
    private String quality;
    private String resolution = "";
    private String language = "";
    private double rating;
    private int runtime = 0;
    private String youtubeTrailer = "";
    private List<String> genres;
    private String shortDescription = "";
    private String longDescription = "";
    private int downloadCount;
    private String torrent;
    private int torrentSeeds;
    private int torrentPeers;
    private String size;
    private int likeCount = 0;
    private String director = "";
    private List<String> actores;

    public int getOscars() {
        return oscars;
    }

    public void setOscars(int oscars) {
        this.oscars = oscars;
    }

    public int getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(int nominaciones) {
        this.nominaciones = nominaciones;
    }

    public int getOtrosPremios() {
        return otrosPremios;
    }

    public void setOtrosPremios(int otrosPremios) {
        this.otrosPremios = otrosPremios;
    }

    public int getTiempoEnSubir() {
        return tiempoEnSubir;
    }

    public void setTiempoEnSubir(int tiempoEnSubir) {
        this.tiempoEnSubir = tiempoEnSubir;
    }
    private int oscars = 0;
    private int nominaciones = 0;
    private int otrosPremios = 0;
    private int tiempoEnSubir = 0;

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
