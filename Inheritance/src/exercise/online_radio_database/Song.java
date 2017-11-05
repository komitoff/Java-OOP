package exercise.online_radio_database;

import exercise.online_radio_database.exceptions.*;

import java.net.Inet4Address;

public class Song {
    private String artist;
    private String name;
    private String length;
    private int minutes;
    private int seconds;

    public String getArtist() {
        return artist;
    }

    private void setArtist(String artist) throws InvalidArtistNameException {
        if (artist.length() < 3 || artist.length() > 20) {
            throw new InvalidArtistNameException();
        }
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws InvalidSongNameException {
        if (name.length() < 3 || name.length() > 30) {
            throw new InvalidSongNameException();
        }
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    private void setLength(String length) throws InvalidSongLengthException, NumberFormatException {
        String[] tokens = length.split(":");
        int minutes = Integer.valueOf(tokens[0]);
        int seconds = Integer.valueOf(tokens[1]);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
        this.length = length;

    }

    public int getMinutes() {
        return minutes;
    }

    private void setMinutes(int minutes) throws InvalidSongMinutesException {
        if (minutes < 0 || minutes > 14) {
            throw new InvalidSongMinutesException();
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private void setSeconds(int seconds) throws InvalidSongSecondsException {
        if (seconds <= 0 || seconds > 59) {
            throw new InvalidSongSecondsException();
        }
        this.seconds = seconds;
    }

    public Song(String artist, String name, String length) throws
            InvalidArtistNameException, InvalidSongNameException, InvalidSongLengthException {
        this.setArtist(artist);
        this.setName(name);
        this.setLength(length);
    }
}
