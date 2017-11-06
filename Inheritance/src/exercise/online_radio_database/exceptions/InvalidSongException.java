package exercise.online_radio_database.exceptions;

public abstract class InvalidSongException extends Exception {

    public String getMessage() {
        return "Exception message";
    }
}
