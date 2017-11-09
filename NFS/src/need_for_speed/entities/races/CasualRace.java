package need_for_speed.entities.races;

public class CasualRace extends Race {

    public CasualRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getRoute(), this.getLength());
    }
}
