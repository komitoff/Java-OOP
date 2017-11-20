package ex.ex10.mood3;

public abstract class GameObject implements IGameObject {
    private String userName;
    private String password;
    private int level;
    private double points;

    GameObject(String userName, String password, int level, double points) {
        this.userName = userName;
        this.setPassword(password);
        this.level = level;
        this.points = points;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public double getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n",
                this.userName, this.password, this.getClass().getSimpleName());
    }
}