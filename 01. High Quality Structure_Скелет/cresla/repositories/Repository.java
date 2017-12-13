package cresla.repositories;

import cresla.interfaces.Identifiable;
import cresla.interfaces.Reactor;

import java.util.Map;

public interface Repository<T> {

    T findOneById(int id);

    void add (T element);

    Map<Integer, Reactor> getReactors();

    Map<Integer, Identifiable> getIdentifiables();
}
