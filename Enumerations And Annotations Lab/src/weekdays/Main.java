package weekdays;

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("mONDAY", "Sport");
        wc.addEntry("fRiDaY", "sleep");

        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry : schedule) {
            System.out.println(weeklyEntry);
        }
    }
}
