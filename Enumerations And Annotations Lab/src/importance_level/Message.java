package importance_level;

public class Message {

    private String message;
    private Importance importance;

    public Message(String importance, String message) {
        this.message = message;
        this.importance = Enum.valueOf(Importance.class, importance.toUpperCase());
    }

    public Importance getImportance() {
        return importance;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.importance + ": " + this.message;
    }
}
