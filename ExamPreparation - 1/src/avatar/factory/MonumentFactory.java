package avatar.factory;


import avatar.entity.monuments.Monument;

public class MonumentFactory {

    private MonumentFactory () {}

    public MonumentFactory getInstance() {
        return new MonumentFactory();
    }

    public Monument createMonument(String type) {
        //TODO: implement this method
        return null;
    }
}
