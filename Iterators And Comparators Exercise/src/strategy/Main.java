package strategy;

import strategy.comparators.PersonAgeComparator;
import strategy.comparators.PersonNameComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.valueOf(reader.readLine());
        Set<Person> sortedByAge = new TreeSet<>(new PersonAgeComparator());
        Set<Person> sortedByName = new TreeSet<>(new PersonNameComparator());

        for (int i = 0; i < cnt; i++) {
            String[] input = reader.readLine().split("\\s+");
            Person person = new Person(input[0], Integer.valueOf(input[1]));
            sortedByAge.add(person);
            sortedByName.add(person);
        }

        sortedByName.stream().forEach(System.out::println);
        sortedByAge.stream().forEach(System.out::println);
    }
}
