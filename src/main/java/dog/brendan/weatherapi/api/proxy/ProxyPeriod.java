package dog.brendan.weatherapi.api.proxy;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dog.brendan.weatherapi.api.Period;

@JsonPropertyOrder({ "number", "name", "startTime", "endTime", "isDaytime", "temperature", "temperatureUnit",
        "temperatureTrend", "windSpeed", "windDirection", "icon", "shortForecast", "detailedForecast",
        "temperatureCelsius" })
public class ProxyPeriod extends Period {

    private int temperatureCelsius;

    public ProxyPeriod(Period period) {
        this.number = period.getNumber();
        this.name = period.getName();
        this.startTime = period.getStartTime();
        this.endTime = period.getEndTime();
        this.isDaytime = period.isDaytime();
        this.temperature = period.getTemperature();
        this.temperatureUnit = period.getTemperatureUnit();
        this.temperatureTrend = period.temperatureTrend;
        this.windSpeed = period.getWindSpeed();
        this.windDirection = period.getWindDirection();
        this.icon = period.getIcon();
        this.shortForecast = period.getShortForecast();
        this.detailedForecast = period.getDetailedForecast();
        this.temperatureCelsius = ((temperature - 32) * 5 / 9);
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }
}
