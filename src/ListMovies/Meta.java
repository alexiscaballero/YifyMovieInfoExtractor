
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
    "server_time",
    "server_timezone",
    "api_version",
    "execution_time"
})
public class Meta {

    @JsonProperty("server_time")
    private Long serverTime;
    @JsonProperty("server_timezone")
    private String serverTimezone;
    @JsonProperty("api_version")
    private Long apiVersion;
    @JsonProperty("execution_time")
    private String executionTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param apiVersion
     * @param executionTime
     * @param serverTimezone
     * @param serverTime
     */
    public Meta(Long serverTime, String serverTimezone, Long apiVersion, String executionTime) {
        this.serverTime = serverTime;
        this.serverTimezone = serverTimezone;
        this.apiVersion = apiVersion;
        this.executionTime = executionTime;
    }

    /**
     * 
     * @return
     *     The serverTime
     */
    @JsonProperty("server_time")
    public Long getServerTime() {
        return serverTime;
    }

    /**
     * 
     * @param serverTime
     *     The server_time
     */
    @JsonProperty("server_time")
    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public Meta withServerTime(Long serverTime) {
        this.serverTime = serverTime;
        return this;
    }

    /**
     * 
     * @return
     *     The serverTimezone
     */
    @JsonProperty("server_timezone")
    public String getServerTimezone() {
        return serverTimezone;
    }

    /**
     * 
     * @param serverTimezone
     *     The server_timezone
     */
    @JsonProperty("server_timezone")
    public void setServerTimezone(String serverTimezone) {
        this.serverTimezone = serverTimezone;
    }

    public Meta withServerTimezone(String serverTimezone) {
        this.serverTimezone = serverTimezone;
        return this;
    }

    /**
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("api_version")
    public Long getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * @param apiVersion
     *     The api_version
     */
    @JsonProperty("api_version")
    public void setApiVersion(Long apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Meta withApiVersion(Long apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 
     * @return
     *     The executionTime
     */
    @JsonProperty("execution_time")
    public String getExecutionTime() {
        return executionTime;
    }

    /**
     * 
     * @param executionTime
     *     The execution_time
     */
    @JsonProperty("execution_time")
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public Meta withExecutionTime(String executionTime) {
        this.executionTime = executionTime;
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

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
