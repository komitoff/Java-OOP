package exercise.online_radio_database.exceptions;

public class InvalidSongLengthException extends InvalidSongException {

    public InvalidSongLengthException() {}

    @Override
    public String getMessage() {
        return "Invalid song length.";
    }
}
