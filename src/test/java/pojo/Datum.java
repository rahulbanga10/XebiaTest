
package pojo;

import java.util.HashMap;
import java.util.Map;

public class Datum {

    private Integer time;
    private Integer precipIntensity;
    private Integer precipProbability;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Integer getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
