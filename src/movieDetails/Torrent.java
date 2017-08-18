package movieDetails;

import java.util.HashMap;
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
    "url",
    "hash",
    "quality",
    "seeds",
    "peers",
    "size",
    "size_bytes",
    "date_uploaded",
    "date_uploaded_unix"
})
public class Torrent {

    @JsonProperty("url")
    private String url;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("quality")
    private String quality;
    @JsonProperty("seeds")
    private Integer seeds;
    @JsonProperty("peers")
    private Integer peers;
    @JsonProperty("size")
    private String size;
    @JsonProperty("size_bytes")
    private Long sizeBytes;
    @JsonProperty("date_uploaded")
    private String dateUploaded;
    @JsonProperty("date_uploaded_unix")
    private Integer dateUploadedUnix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Torrent() {
    }

    /**
     *
     * @param sizeBytes
     * @param hash
     * @param peers
     * @param quality
     * @param seeds
     * @param dateUploaded
     * @param dateUploadedUnix
     * @param url
     * @param size
     */
    public Torrent(String url, String hash, String quality, Integer seeds, Integer peers, String size, Long sizeBytes, String dateUploaded, Integer dateUploadedUnix) {
        this.url = url;
        this.hash = hash;
        this.quality = quality;
        this.seeds = seeds;
        this.peers = peers;
        this.size = size;
        this.sizeBytes = sizeBytes;
        this.dateUploaded = dateUploaded;
        this.dateUploadedUnix = dateUploadedUnix;
    }

    /**
     *
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Torrent withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     *
     * @return The hash
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     *
     * @param hash The hash
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    public Torrent withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     *
     * @return The quality
     */
    @JsonProperty("quality")
    public String getQuality() {
        return quality;
    }

    /**
     *
     * @param quality The quality
     */
    @JsonProperty("quality")
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Torrent withQuality(String quality) {
        this.quality = quality;
        return this;
    }

    /**
     *
     * @return The seeds
     */
    @JsonProperty("seeds")
    public Integer getSeeds() {
        return seeds;
    }

    /**
     *
     * @param seeds The seeds
     */
    @JsonProperty("seeds")
    public void setSeeds(Integer seeds) {
        this.seeds = seeds;
    }

    public Torrent withSeeds(Integer seeds) {
        this.seeds = seeds;
        return this;
    }

    /**
     *
     * @return The peers
     */
    @JsonProperty("peers")
    public Integer getPeers() {
        return peers;
    }

    /**
     *
     * @param peers The peers
     */
    @JsonProperty("peers")
    public void setPeers(Integer peers) {
        this.peers = peers;
    }

    public Torrent withPeers(Integer peers) {
        this.peers = peers;
        return this;
    }

    /**
     *
     * @return The size
     */
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size The size
     */
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    public Torrent withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     *
     * @return The sizeBytes
     */
    @JsonProperty("size_bytes")
    public Long getSizeBytes() {
        return sizeBytes;
    }

    /**
     *
     * @param sizeBytes The size_bytes
     */
    @JsonProperty("size_bytes")
    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public Torrent withSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    /**
     *
     * @return The dateUploaded
     */
    @JsonProperty("date_uploaded")
    public String getDateUploaded() {
        return dateUploaded;
    }

    /**
     *
     * @param dateUploaded The date_uploaded
     */
    @JsonProperty("date_uploaded")
    public void setDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public Torrent withDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
        return this;
    }

    /**
     *
     * @return The dateUploadedUnix
     */
    @JsonProperty("date_uploaded_unix")
    public Integer getDateUploadedUnix() {
        return dateUploadedUnix;
    }

    /**
     *
     * @param dateUploadedUnix The date_uploaded_unix
     */
    @JsonProperty("date_uploaded_unix")
    public void setDateUploadedUnix(Integer dateUploadedUnix) {
        this.dateUploadedUnix = dateUploadedUnix;
    }

    public Torrent withDateUploadedUnix(Integer dateUploadedUnix) {
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

    public Torrent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
