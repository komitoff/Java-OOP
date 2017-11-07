package avatar.entity.monuments;

public abstract class Monument {
    private String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Monument(String name) {
        this.setName(name);
    }
}
