package ex.ex10.mood3;

public class Archangel extends GameObject {

    Archangel(String userName, String password, double points, int level) {
        super(userName, password, level, points);
    }

    @Override
    void setPassword(String password) {
        String reversed = new StringBuilder(super.getUserName()).reverse().toString();
        int length = super.getUserName().length() * 21;
        super.setPassword(reversed + length);
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("%.0f", super.getPoints() * super.getLevel()));
    }
}