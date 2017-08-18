
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
    "movie_count",
    "limit",
    "page_number",
    "movies"
})
public class Data {

    @JsonProperty("movie_count")
    private Long movieCount;
    @JsonProperty("limit")
    private Long limit;
    @JsonProperty("page_number")
    private Long pageNumber;
    @JsonProperty("movies")
    private List<Movie> movies = new ArrayList<Movie>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param limit
     * @param movies
     * @param pageNumber
     * @param movieCount
     */
    public Data(Long movieCount, Long limit, Long pageNumber, List<Movie> movies) {
        this.movieCount = movieCount;
        this.limit = limit;
        this.pageNumber = pageNumber;
        this.movies = movies;
    }

    /**
     * 
     * @return
     *     The movieCount
     */
    @JsonProperty("movie_count")
    public Long getMovieCount() {
        return movieCount;
    }

    /**
     * 
     * @param movieCount
     *     The movie_count
     */
    @JsonProperty("movie_count")
    public void setMovieCount(Long movieCount) {
        this.movieCount = movieCount;
    }

    public Data withMovieCount(Long movieCount) {
        this.movieCount = movieCount;
        return this;
    }

    /**
     * 
     * @return
     *     The limit
     */
    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    @JsonProperty("limit")
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Data withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 
     * @return
     *     The pageNumber
     */
    @JsonProperty("page_number")
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * 
     * @param pageNumber
     *     The page_number
     */
    @JsonProperty("page_number")
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Data withPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The movies
     */
    @JsonProperty("movies")
    public List<Movie> getMovies() {
        return movies;
    }

    /**
     * 
     * @param movies
     *     The movies
     */
    @JsonProperty("movies")
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Data withMovies(List<Movie> movies) {
        this.movies = movies;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
