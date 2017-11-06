package wild_farm.foods;

public abstract class Food {
    private int quantity;

    protected Food(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can't be negative");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.setQuantity(quantity);
    }
}
