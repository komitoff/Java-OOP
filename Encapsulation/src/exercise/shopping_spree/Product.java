package exercise.shopping_spree;

public class Product {
    private String name;
    private double cost;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }


}
