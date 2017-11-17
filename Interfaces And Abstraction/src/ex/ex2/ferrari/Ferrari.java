package ex.ex2.ferrari;

public class Ferrari implements Car {

    public static final String MODEL = "488-Spider";

    private String driver;

    public Ferrari(String driver) {
        this.driver = driver;
    }

    @Override
    public String userBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                MODEL, userBrakes(), pushTheGasPedal(), driver);
    }
}
