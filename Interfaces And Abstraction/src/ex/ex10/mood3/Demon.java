package ex.ex10.mood3;

public class Demon extends GameObject {

    Demon(String userName, String password, double points, int level) {
        super(userName, password, level, points);
    }

    @Override
    void setPassword(String password) {
        super.setPassword(String.valueOf(super.getUserName().length() * 217));
    }

    @Override
    public String toString() {
        return super.toString().concat(super.getPoints() * super.getLevel() + "");
    }

}