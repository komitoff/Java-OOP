package ex.ex6.extended;

import ex.ex6.extended.api.Buyer;

class Human implements Buyer {
    private static final int FOOD_VALUE = 10;
    static int FOOD = 0;

    private int age;
    private String name;
    private String id;
    private String birthDay;

    Human(String name, String id, String birthDay, int age) {
        this.name = name;
        this.id = id;
        this.birthDay = birthDay;
        this.age = age;
    }

    @Override
    public void buyFood() {
        Human.FOOD += FOOD_VALUE;
    }
}
