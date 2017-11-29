package coffee_machine;

public enum  CoffeeSize {

    SMALL(50, 50), NORMAL(100, 75), DOUBLE(200, 100);

    private int size;
    private int price;

    CoffeeSize(int size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }

    public int getPrice() {
        return price;
    }
}
