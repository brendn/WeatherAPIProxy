package dog.brendan.weatherapi.api;

import dog.brendan.weatherapi.api.proxy.ProxyPeriod;

import java.util.Comparator;
import java.util.List;

public class Stats {

    private int averageTemperature;
    private ProxyPeriod hottestPeriod;
    private ProxyPeriod coldestPeriod;

    public Stats(List<ProxyPeriod> periods) {
        averageTemperature = calcAverage(periods);
        coldestPeriod = periods.stream().min(Comparator.comparingInt(ProxyPeriod::getTemperature)).get();
        hottestPeriod = periods.stream().max(Comparator.comparingInt(ProxyPeriod::getTemperature)).get();
    }

    private int calcAverage(List<ProxyPeriod> periods) {
        int out = 0;
        for (Period p : periods) {
            out += p.getTemperature();
        }
        out /= periods.size();
        return out;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public ProxyPeriod getHottestPeriod() {
        return hottestPeriod;
    }

    public ProxyPeriod getColdestPeriod() {
        return coldestPeriod;
    }
}
