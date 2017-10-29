package exercise.cat_lady.cats;

public abstract class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Cat(String name) {
        this.name = name;
    }
}
