package need_for_speed.entities.races;

import need_for_speed.entities.cars.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class Race {
    private int length;
    private String route;
    private int prizePool;
    private List<Car> participants;

    public int getLength() {
        return length;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    protected void setRoute(String route) {
        this.route = route;
    }

    public int getPrizePool() {
        return prizePool;
    }

    protected void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    protected Race(int length, String route, int prizePool) {
        this.setLength(length);
        this.setRoute(route);
        this.setPrizePool(prizePool);
        this.participants = new ArrayList<>();
    }

    public String toString() {
        return String.format("%s - %s", route, length);
    }
}
