package dog.brendan.weatherapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Period {

    @JsonProperty("number")
    public int number;

    @JsonProperty("name")
    public String name;

    @JsonProperty("startTime")
    public String startTime;

    @JsonProperty("endTime")
    public String endTime;

    @JsonProperty("isDaytime")
    public boolean isDaytime;

    @JsonProperty("temperature")
    public int temperature;

    @JsonProperty("temperatureUnit")
    public String temperatureUnit;

    @JsonProperty("temperatureTrend")
    public Object temperatureTrend; //???

    @JsonProperty("windSpeed")
    public String windSpeed;

    @JsonProperty("windDirection")
    public String windDirection;

    @JsonProperty("icon")
    public String icon;

    @JsonProperty("shortForecast")
    public String shortForecast;

    @JsonProperty("detailedForecast")
    public String detailedForecast;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public boolean isDaytime() {
        return isDaytime;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getIcon() {
        return icon;
    }

    public String getShortForecast() {
        return shortForecast;
    }

    public String getDetailedForecast() {
        return detailedForecast;
    }
}
