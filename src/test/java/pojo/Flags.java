
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "nearest-station" })
public class Flags {

    private List<String> sources = null;
    @JsonIgnore
    private Double neareststation;
    private String units;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public Double getNearestStation() {
        return neareststation;
    }

    public void setNearestStation(Double neareststation) {
        this.neareststation = neareststation;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
