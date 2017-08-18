
package ListMovies;

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
    "status",
    "status_message",
    "data",
    "@meta"
})
public class ListXML {

    @JsonProperty("status")
    private String status;
    @JsonProperty("status_message")
    private String statusMessage;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("@meta")
    private ListMovies.Meta Meta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListXML() {
    }

    /**
     * 
     * @param status
     * @param data
     * @param Meta
     * @param statusMessage
     */
    public ListXML(String status, String statusMessage, Data data, ListMovies.Meta Meta) {
        this.status = status;
        this.statusMessage = statusMessage;
        this.data = data;
        this.Meta = Meta;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public ListXML withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The statusMessage
     */
    @JsonProperty("status_message")
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * 
     * @param statusMessage
     *     The status_message
     */
    @JsonProperty("status_message")
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public ListXML withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public ListXML withData(Data data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * @return
     *     The Meta
     */
    @JsonProperty("@meta")
    public ListMovies.Meta getMeta() {
        return Meta;
    }

    /**
     * 
     * @param Meta
     *     The @meta
     */
    @JsonProperty("@meta")
    public void setMeta(ListMovies.Meta Meta) {
        this.Meta = Meta;
    }

    public ListXML withMeta(ListMovies.Meta Meta) {
        this.Meta = Meta;
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

    public ListXML withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
