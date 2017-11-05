package exercise.online_radio_database.exceptions;

public class InvalidArtistNameException extends InvalidSongException {

    public InvalidArtistNameException() {}

    @Override
    public String getMessage() {
        return "Artist name should be between 3 and 20 symbols.";
    }
}
