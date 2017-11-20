package ex.ex6.extended;


import ex.ex6.extended.api.Entity;

class Robot implements Entity {
    private String name;
    private String id;

    public Robot(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;
    }
}