package exercise.animal_farm;

import java.text.DecimalFormat;

public class Chicken {
    private int age;
    private String name;

    int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private double caclulateProductPerDay() {
        if (this.getAge() < 6) {
            return 2;
        }
        else if (this.getAge() < 12) {
            return 1;
        }
        return 0.75;
    }

    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.0f eggs per day.",
                this.getName(), this.getAge(), this.caclulateProductPerDay());
    }
}
