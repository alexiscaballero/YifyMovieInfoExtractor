
package ListMovies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "url",
    "imdb_code",
    "title",
    "title_english",
    "title_long",
    "slug",
    "year",
    "rating",
    "runtime",
    "genres",
    "summary",
    "description_full",
    "synopsis",
    "yt_trailer_code",
    "language",
    "mpa_rating",
    "background_image",
    "background_image_original",
    "small_cover_image",
    "medium_cover_image",
    "large_cover_image",
    "state",
    "torrents",
    "date_uploaded",
    "date_uploaded_unix"
})
public class Movie {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("imdb_code")
    private String imdbCode;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_english")
    private String titleEnglish;
    @JsonProperty("title_long")
    private String titleLong;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("runtime")
    private Long runtime;
    @JsonProperty("genres")
    private List<String> genres = new ArrayList<String>();
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description_full")
    private String descriptionFull;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("yt_trailer_code")
    private String ytTrailerCode;
    @JsonProperty("language")
    private String language;
    @JsonProperty("mpa_rating")
    private String mpaRating;
    @JsonProperty("background_image")
    private String backgroundImage;
    @JsonProperty("background_image_original")
    private String backgroundImageOriginal;
    @JsonProperty("small_cover_image")
    private String smallCoverImage;
    @JsonProperty("medium_cover_image")
    private String mediumCoverImage;
    @JsonProperty("large_cover_image")
    private String largeCoverImage;
    @JsonProperty("state")
    private String state;
    @JsonProperty("torrents")
    private List<Torrent> torrents = new ArrayList<Torrent>();
    @JsonProperty("date_uploaded")
    private String dateUploaded;
    @JsonProperty("date_uploaded_unix")
    private Long dateUploadedUnix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Movie() {
    }

    /**
     * 
     * @param summary
     * @param genres
     * @param state
     * @param runtime
     * @param titleLong
     * @param backgroundImageOriginal
     * @param id
     * @param title
     * @param titleEnglish
     * @param mediumCoverImage
     * @param synopsis
     * @param year
     * @param dateUploadedUnix
     * @param imdbCode
     * @param smallCoverImage
     * @param largeCoverImage
     * @param mpaRating
     * @param backgroundImage
     * @param url
     * @param descriptionFull
     * @param torrents
     * @param slug
     * @param rating
     * @param language
     * @param dateUploaded
     * @param ytTrailerCode
     */
    public Movie(Long id, String url, String imdbCode, String title, String titleEnglish, String titleLong, String slug, Long year, Double rating, Long runtime, List<String> genres, String summary, String descriptionFull, String synopsis, String ytTrailerCode, String language, String mpaRating, String backgroundImage, String backgroundImageOriginal, String smallCoverImage, String mediumCoverImage, String largeCoverImage, String state, List<Torrent> torrents, String dateUploaded, Long dateUploadedUnix) {
        this.id = id;
        this.url = url;
        this.imdbCode = imdbCode;
        this.title = title;
        this.titleEnglish = titleEnglish;
        this.titleLong = titleLong;
        this.slug = slug;
        this.year = year;
        this.rating = rating;
        this.runtime = runtime;
        this.genres = genres;
        this.summary = summary;
        this.descriptionFull = descriptionFull;
        this.synopsis = synopsis;
        this.ytTrailerCode = ytTrailerCode;
        this.language = language;
        this.mpaRating = mpaRating;
        this.backgroundImage = backgroundImage;
        this.backgroundImageOriginal = backgroundImageOriginal;
        this.smallCoverImage = smallCoverImage;
        this.mediumCoverImage = mediumCoverImage;
        this.largeCoverImage = largeCoverImage;
        this.state = state;
        this.torrents = torrents;
        this.dateUploaded = dateUploaded;
        this.dateUploadedUnix = dateUploadedUnix;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Movie withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Movie withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     * @return
     *     The imdbCode
     */
    @JsonProperty("imdb_code")
    public String getImdbCode() {
        return imdbCode;
    }

    /**
     * 
     * @param imdbCode
     *     The imdb_code
     */
    @JsonProperty("imdb_code")
    public void setImdbCode(String imdbCode) {
        this.imdbCode = imdbCode;
    }

    public Movie withImdbCode(String imdbCode) {
        this.imdbCode = imdbCode;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Movie withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The titleEnglish
     */
    @JsonProperty("title_english")
    public String getTitleEnglish() {
        return titleEnglish;
    }

    /**
     * 
     * @param titleEnglish
     *     The title_english
     */
    @JsonProperty("title_english")
    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public Movie withTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
        return this;
    }

    /**
     * 
     * @return
     *     The titleLong
     */
    @JsonProperty("title_long")
    public String getTitleLong() {
        return titleLong;
    }

    /**
     * 
     * @param titleLong
     *     The title_long
     */
    @JsonProperty("title_long")
    public void setTitleLong(String titleLong) {
        this.titleLong = titleLong;
    }

    public Movie withTitleLong(String titleLong) {
        this.titleLong = titleLong;
        return this;
    }

    /**
     * 
     * @return
     *     The slug
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Movie withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 
     * @return
     *     The year
     */
    @JsonProperty("year")
    public Long getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    @JsonProperty("year")
    public void setYear(Long year) {
        this.year = year;
    }

    public Movie withYear(Long year) {
        this.year = year;
        return this;
    }

    /**
     * 
     * @return
     *     The rating
     */
    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Movie withRating(Double rating) {
        this.rating = rating;
        return this;
    }

    /**
     * 
     * @return
     *     The runtime
     */
    @JsonProperty("runtime")
    public Long getRuntime() {
        return runtime;
    }

    /**
     * 
     * @param runtime
     *     The runtime
     */
    @JsonProperty("runtime")
    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public Movie withRuntime(Long runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 
     * @return
     *     The genres
     */
    @JsonProperty("genres")
    public List<String> getGenres() {
        return genres;
    }

    /**
     * 
     * @param genres
     *     The genres
     */
    @JsonProperty("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Movie withGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    /**
     * 
     * @return
     *     The summary
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Movie withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 
     * @return
     *     The descriptionFull
     */
    @JsonProperty("description_full")
    public String getDescriptionFull() {
        return descriptionFull;
    }

    /**
     * 
     * @param descriptionFull
     *     The description_full
     */
    @JsonProperty("description_full")
    public void setDescriptionFull(String descriptionFull) {
        this.descriptionFull = descriptionFull;
    }

    public Movie withDescriptionFull(String descriptionFull) {
        this.descriptionFull = descriptionFull;
        return this;
    }

    /**
     * 
     * @return
     *     The synopsis
     */
    @JsonProperty("synopsis")
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * 
     * @param synopsis
     *     The synopsis
     */
    @JsonProperty("synopsis")
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Movie withSynopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }

    /**
     * 
     * @return
     *     The ytTrailerCode
     */
    @JsonProperty("yt_trailer_code")
    public String getYtTrailerCode() {
        return ytTrailerCode;
    }

    /**
     * 
     * @param ytTrailerCode
     *     The yt_trailer_code
     */
    @JsonProperty("yt_trailer_code")
    public void setYtTrailerCode(String ytTrailerCode) {
        this.ytTrailerCode = ytTrailerCode;
    }

    public Movie withYtTrailerCode(String ytTrailerCode) {
        this.ytTrailerCode = ytTrailerCode;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public Movie withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 
     * @return
     *     The mpaRating
     */
    @JsonProperty("mpa_rating")
    public String getMpaRating() {
        return mpaRating;
    }

    /**
     * 
     * @param mpaRating
     *     The mpa_rating
     */
    @JsonProperty("mpa_rating")
    public void setMpaRating(String mpaRating) {
        this.mpaRating = mpaRating;
    }

    public Movie withMpaRating(String mpaRating) {
        this.mpaRating = mpaRating;
        return this;
    }

    /**
     * 
     * @return
     *     The backgroundImage
     */
    @JsonProperty("background_image")
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * 
     * @param backgroundImage
     *     The background_image
     */
    @JsonProperty("background_image")
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public Movie withBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    /**
     * 
     * @return
     *     The backgroundImageOriginal
     */
    @JsonProperty("background_image_original")
    public String getBackgroundImageOriginal() {
        return backgroundImageOriginal;
    }

    /**
     * 
     * @param backgroundImageOriginal
     *     The background_image_original
     */
    @JsonProperty("background_image_original")
    public void setBackgroundImageOriginal(String backgroundImageOriginal) {
        this.backgroundImageOriginal = backgroundImageOriginal;
    }

    public Movie withBackgroundImageOriginal(String backgroundImageOriginal) {
        this.backgroundImageOriginal = backgroundImageOriginal;
        return this;
    }

    /**
     * 
     * @return
     *     The smallCoverImage
     */
    @JsonProperty("small_cover_image")
    public String getSmallCoverImage() {
        return smallCoverImage;
    }

    /**
     * 
     * @param smallCoverImage
     *     The small_cover_image
     */
    @JsonProperty("small_cover_image")
    public void setSmallCoverImage(String smallCoverImage) {
        this.smallCoverImage = smallCoverImage;
    }

    public Movie withSmallCoverImage(String smallCoverImage) {
        this.smallCoverImage = smallCoverImage;
        return this;
    }

    /**
     * 
     * @return
     *     The mediumCoverImage
     */
    @JsonProperty("medium_cover_image")
    public String getMediumCoverImage() {
        return mediumCoverImage;
    }

    /**
     * 
     * @param mediumCoverImage
     *     The medium_cover_image
     */
    @JsonProperty("medium_cover_image")
    public void setMediumCoverImage(String mediumCoverImage) {
        this.mediumCoverImage = mediumCoverImage;
    }

    public Movie withMediumCoverImage(String mediumCoverImage) {
        this.mediumCoverImage = mediumCoverImage;
        return this;
    }

    /**
     * 
     * @return
     *     The largeCoverImage
     */
    @JsonProperty("large_cover_image")
    public String getLargeCoverImage() {
        return largeCoverImage;
    }

    /**
     * 
     * @param largeCoverImage
     *     The large_cover_image
     */
    @JsonProperty("large_cover_image")
    public void setLargeCoverImage(String largeCoverImage) {
        this.largeCoverImage = largeCoverImage;
    }

    public Movie withLargeCoverImage(String largeCoverImage) {
        this.largeCoverImage = largeCoverImage;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Movie withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * @return
     *     The torrents
     */
    @JsonProperty("torrents")
    public List<Torrent> getTorrents() {
        return torrents;
    }

    /**
     * 
     * @param torrents
     *     The torrents
     */
    @JsonProperty("torrents")
    public void setTorrents(List<Torrent> torrents) {
        this.torrents = torrents;
    }

    public Movie withTorrents(List<Torrent> torrents) {
        this.torrents = torrents;
        return this;
    }

    /**
     * 
     * @return
     *     The dateUploaded
     */
    @JsonProperty("date_uploaded")
    public String getDateUploaded() {
        return dateUploaded;
    }

    /**
     * 
     * @param dateUploaded
     *     The date_uploaded
     */
    @JsonProperty("date_uploaded")
    public void setDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public Movie withDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
        return this;
    }

    /**
     * 
     * @return
     *     The dateUploadedUnix
     */
    @JsonProperty("date_uploaded_unix")
    public Long getDateUploadedUnix() {
        return dateUploadedUnix;
    }

    /**
     * 
     * @param dateUploadedUnix
     *     The date_uploaded_unix
     */
    @JsonProperty("date_uploaded_unix")
    public void setDateUploadedUnix(Long dateUploadedUnix) {
        this.dateUploadedUnix = dateUploadedUnix;
    }

    public Movie withDateUploadedUnix(Long dateUploadedUnix) {
        this.dateUploadedUnix = dateUploadedUnix;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Movie withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
