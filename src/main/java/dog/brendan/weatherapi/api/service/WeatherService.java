package dog.brendan.weatherapi.api.service;

import dog.brendan.weatherapi.api.Period;
import dog.brendan.weatherapi.api.Stats;
import dog.brendan.weatherapi.api.grid.GridResponse;
import dog.brendan.weatherapi.api.point.PointsResponse;
import dog.brendan.weatherapi.api.proxy.ProxyPeriod;
import dog.brendan.weatherapi.api.proxy.ProxyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    private RestTemplate rest = new RestTemplate();

    private static final String BASE_URL = "https://api.weather.gov/points/{0},{1}";

    public PointsResponse getPointsResponse(double lat, double lon) {
        return rest.getForObject(BASE_URL, PointsResponse.class, lat, lon);
    }

    public GridResponse getGridResponse(String url) {
        return rest.getForObject(url, GridResponse.class);
    }

    public ProxyResponse getProxyResponse(double lat, double lon) {
        String url = getPointsResponse(lat, lon).getProperties().getForecast();
        List<Period> periods = getGridResponse(url).getProperties().getPeriods();
        List<ProxyPeriod> out = new ArrayList<>();

        periods.forEach(period -> out.add(new ProxyPeriod(period)));

        return new ProxyResponse(out, new Stats(out));
    }

}
