package need_for_speed.factories;

import need_for_speed.entities.races.CasualRace;
import need_for_speed.entities.races.DragRace;
import need_for_speed.entities.races.DriftRace;
import need_for_speed.entities.races.Race;

public class RaceFactory {

    private RaceFactory() {}

    public static RaceFactory getInstance() {
        return new RaceFactory();
    }

    public Race createRace(String type, int length, String route, int prizePool) {
        switch (type) {
            case "Casual":
                return new CasualRace(length, route, prizePool);
            case "Drag":
                return new DragRace(length, route, prizePool);
            case "Drift":
                return new DriftRace(length, route, prizePool);
            default:
                return null;
        }
    }
}
