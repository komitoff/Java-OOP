package exercise.online_radio_database.exceptions;

public class InvalidSongNameException extends InvalidSongException {

    public InvalidSongNameException() {}

    @Override
    public String getMessage() {
        return "Song name should be between 3 and 30 symbols.";
    }
}
