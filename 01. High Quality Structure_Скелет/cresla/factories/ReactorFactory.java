package cresla.factories;

import cresla.entities.reactors.CryoReactor;
import cresla.entities.reactors.HeatReactor;
import cresla.interfaces.Container;
import cresla.interfaces.Reactor;

public class ReactorFactory {

    private ReactorFactory() {}

    public Reactor createReactor(String type, int id, Container container, int secondaryParam) {
        if (type.equals("CryoReactor")) {
            return new CryoReactor(id, container, secondaryParam);
        }

        if (type.equals("HeatReactor")) {
            return new HeatReactor(id, container, secondaryParam);
        }

        return null;
    }

    public ReactorFactory getInstance() {
        return new ReactorFactory();
    }
}
