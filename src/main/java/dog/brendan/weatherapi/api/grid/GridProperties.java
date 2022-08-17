package dog.brendan.weatherapi.api.grid;

import dog.brendan.weatherapi.api.Period;

import java.util.List;

public class GridProperties {

    private List<Period> periods;

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }
}
