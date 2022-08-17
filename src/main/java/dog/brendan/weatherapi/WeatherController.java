package dog.brendan.weatherapi;

import dog.brendan.weatherapi.api.grid.GridResponse;
import dog.brendan.weatherapi.api.Period;
import dog.brendan.weatherapi.api.proxy.ProxyResponse;
import dog.brendan.weatherapi.api.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast")
    public List<Period> getForecast(@RequestParam double lat, @RequestParam Double lon) {
        String url = weatherService.getPointsResponse(lat, lon).getProperties().getForecast();
        GridResponse gridResponse = weatherService.getGridResponse(url);
        return gridResponse.getProperties().getPeriods();
    }

    @GetMapping("/forecast/plus")
    public ProxyResponse getForecastPlus(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.getProxyResponse(lat, lon);
    }

}
