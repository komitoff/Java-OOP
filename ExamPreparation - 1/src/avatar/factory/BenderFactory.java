package avatar.factory;

import avatar.entity.benders.Bender;

public class BenderFactory {

    private BenderFactory() {}

    public BenderFactory getInstance() {
        return new BenderFactory();
    }

    public Bender createBender() {
        //TODO: implement this method
        return null;
    }
}
