package app.waste_disposal.repositories;

public interface Repository<E, C> {

    void addEnergy(E energy);

    void addCapital(C capital);

    E getEnergy();

    C getCapital();
}
