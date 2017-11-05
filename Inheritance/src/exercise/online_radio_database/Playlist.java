package exercise.online_radio_database;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private final int SECONDS_IN_MINUTE = 60;
    private final int SECONDS_IN_HOUR = 3600;

    private List<Song> songs;
    private int totalLengthInSeconds;
    private String totalLength;

    public String getTotalLength() {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = this.getTotalLengthInSeconds();
        if (totalSeconds >= SECONDS_IN_HOUR) {
            hours = totalSeconds / SECONDS_IN_HOUR;
            totalSeconds -= (hours * SECONDS_IN_HOUR);
        }

        if (totalSeconds > 59) {
            minutes = totalSeconds / SECONDS_IN_MINUTE;
            totalSeconds -= (minutes * SECONDS_IN_MINUTE);
        }

        return String.format("Playlist length: %dh %dm %ds",
                hours, minutes, totalSeconds);
    }

    private int getTotalLengthInSeconds() {
        return totalLengthInSeconds;
    }

    public void setTotalLengthInSeconds(int totalLengthInSeconds) {
        this.totalLengthInSeconds = totalLengthInSeconds;
    }

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void add(Song song) {
        this.songs.add(song);
        this.totalLengthInSeconds += (song.getMinutes() * 60) + song.getSeconds();
    }

    public int getSongsCount() {
        return this.songs.size();
    }
}
