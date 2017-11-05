package exercise.online_radio_database.exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {

    public InvalidSongSecondsException() {}

    @Override
    public String getMessage() {
        return "Song seconds should be between 0 and 59.";
    }
}
