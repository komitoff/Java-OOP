package exercise.online_radio_database.exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {

    public InvalidSongMinutesException() {}

    @Override
    public String getMessage() {
        return "Song minutes should be between 0 and 14.";
    }
}
