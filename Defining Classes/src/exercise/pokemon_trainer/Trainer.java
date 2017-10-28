package exercise.pokemon_trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public Trainer(String name) {
        this.name = name;
        this.pokemonList = new ArrayList<>();
    }

    public void increaseBadges() {
        this.badges ++;
    }

    public void checkForDeadPokemons() {
//        for (Pokemon pokemon : this.pokemonList) {
//            if (pokemon.getHealth() <= 0) {
//                this.pokemonList.remove(pokemon);
//            }
//        }

        for (int i = 0; i < this.pokemonList.size(); i++) {
            if (pokemonList.get(i).getHealth() <= 0) {
                this.getPokemonList().remove(pokemonList.get(i));
            }
        }
    }
}
