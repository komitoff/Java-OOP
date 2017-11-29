package weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        Collections.sort(entries, WeeklyEntry.BY_WEEKDAY);
        return this.entries;
    }

    public void addEntry(String day, String note) {
        WeeklyEntry we = new WeeklyEntry(day, note);
        entries.add(we);
    }
}
