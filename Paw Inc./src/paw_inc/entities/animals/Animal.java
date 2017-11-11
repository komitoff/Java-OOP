package paw_inc.entities.animals;

public abstract class Animal {
    private String name;
    private int age;
    private boolean cleansingStatus;

    public boolean getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setCleansingStatus(false);
    }


}
