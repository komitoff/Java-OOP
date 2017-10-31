package exercise.shopping_spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    public List<Product> getBagOfProducts() {
        return bagOfProducts;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public void buyProduct (Product product) {
        if (this.getMoney() < product.getCost()) {
            System.out.println(String.format("%s can't afford %s", this.getName(), product.getName()));
            return;
        }
        System.out.println(String.format("%s bought %s", this.getName(), product.getName()));
        this.setMoney(this.getMoney() - product.getCost());
        this.bagOfProducts.add(product);
    }
}
