package cresla.entities;

import cresla.interfaces.Identifiable;

public class IdGenerator implements Identifiable {

    private volatile int id;

    public IdGenerator() {
        this.id = 0;
    }

    @Override
    public int getId() {
        return 0;
    }
}
