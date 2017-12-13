package cresla.repositories;

import cresla.interfaces.Identifiable;
import cresla.interfaces.Reactor;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReactorRepository implements Repository<Reactor> {

    private Map<Integer, Reactor> reactors;
    private Map<Integer, Identifiable> identifiables;

    public ReactorRepository() {
        this.reactors = new LinkedHashMap<>();
        this.identifiables = new LinkedHashMap<>();
    }

    @Override
    public Reactor findOneById(int id) {
        return this.reactors.get(id);
    }

    @Override
    public void add(Reactor element) {
        this.reactors.put(element.getId(), element);
    }

    @Override
    public Map<Integer, Reactor> getReactors() {
        return this.reactors;
    }

    @Override
    public Map<Integer, Identifiable> getIdentifiables() {
        return this.identifiables;
    }
}
