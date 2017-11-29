package coffee_machine;

public class Coffee {
    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.size, this.type);
    }

    public CoffeeSize getSize() {
        return size;
    }
}
