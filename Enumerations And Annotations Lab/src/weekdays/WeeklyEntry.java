package weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public static Comparator<WeeklyEntry> BY_WEEKDAY = getCompByDay();
    private Weekday weekday;
    private String note;

    public WeeklyEntry(String weekday, String note) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.note = note;
    }

    @Override
    public String toString() {
        return this.weekday + " - " + this.note;
    }

    private static Comparator<WeeklyEntry> getCompByDay() {
        return (x, y) -> x.weekday.compareTo(y.weekday);
    }
}
