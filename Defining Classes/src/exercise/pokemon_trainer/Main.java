package exercise.pokemon_trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        String command = reader.readLine();

        if (command.equals("")) {
            return;
        }
        while (!command.equals("Tournament")) {
            String[] tokens = command.split("\\s+");
            String trainerName = tokens[0];
            Trainer trainer = new Trainer(trainerName);
            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, trainer);
            }

            Pokemon pokemon = new Pokemon(tokens[1], tokens[2], Integer.valueOf(tokens[3]));
            trainers.get(trainerName).getPokemonList().add(pokemon);
            command = reader.readLine();
        }

        command = reader.readLine();

        while(!command.equals("End")) {
            boolean flag = false;
            for (Map.Entry<String, Trainer> trainer : trainers.entrySet()) {
                for(Pokemon pokemon : trainer.getValue().getPokemonList()) {
                    if (pokemon.getElement().equals(command)) {
                        flag = true;
                        trainer.getValue().increaseBadges();
                        break;
                    }
                }

                if (!flag) {
                    for(Pokemon pokemon : trainer.getValue().getPokemonList()) {
                        pokemon.setHealth(pokemon.getHealth() - 10);
                    }
                }
                trainer.getValue().checkForDeadPokemons();
            }
            command = reader.readLine();
        }

        Map<String, Trainer> sortedTrainers = trainers.entrySet().stream()
                .sorted((x, y) -> Integer.compare(y.getValue().getBadges(), x.getValue().getBadges()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        for(Map.Entry<String, Trainer> trainer : sortedTrainers.entrySet()) {
            System.out.print(trainer.getKey() + " " +
                    trainer.getValue().getBadges() + " " +
                    trainer.getValue().getPokemonList().size());
            System.out.println();
        }
    }
}
