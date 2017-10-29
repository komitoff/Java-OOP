package exercise.google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String company;
    private String car;
    private List<String> pokemons;
    private List<String> parents;
    private List<String> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public List<String> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<String> pokemons) {
        this.pokemons = pokemons;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public Person(String name) {
        this.name = name;
        this.company = "";
        this.car = "";
        this.pokemons = new ArrayList<>();
        this.children = new ArrayList<>();
        this.parents = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name +
                "\nCompany:" + stringifyField(this.company) +
                "\nCar:" + stringifyField(this.car) +
                "\nPokemon:" + stringifyList(this.pokemons) +
                "\nParents:" + stringifyList(this.parents) +
                "\nChildren:" + stringifyList(this.children);

    }

    public String stringifyList(List<String> list) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            output.append("\n" + list.get(i));
        }
        return output.toString();
    }

    public String stringifyField(String field) {
        if (!field.equals("")){
            field =  "\n" + field;
        }
        return field;
    }
}
