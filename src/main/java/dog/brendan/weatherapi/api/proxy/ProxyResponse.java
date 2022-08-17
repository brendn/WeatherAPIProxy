package dog.brendan.weatherapi.api.proxy;

import dog.brendan.weatherapi.api.Stats;

import java.util.List;

public class ProxyResponse {

    private List<ProxyPeriod> periods;

    private Stats stats;

    public ProxyResponse(List<ProxyPeriod> periods, Stats stats) {
        this.periods = periods;
        this.stats = stats;
    }

    public List<ProxyPeriod> getPeriods() {
        return periods;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setPeriods(List<ProxyPeriod> periods) {
        this.periods = periods;
    }
}
