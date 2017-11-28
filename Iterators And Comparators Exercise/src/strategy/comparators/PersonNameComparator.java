package strategy.comparators;

import strategy.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getName().length() == p2.getName().length()) {
            if (p1.getName().toLowerCase().charAt(0) > p2.getName().toLowerCase().charAt(0)) {
                return 1;
            } else if (p1.getName().toLowerCase().charAt(0) < p2.getName().toLowerCase().charAt(0)) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (p1.getName().length() > p2.getName().length()) {
                return 1;
            } else if (p1.getName().length() < p2.getName().length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
