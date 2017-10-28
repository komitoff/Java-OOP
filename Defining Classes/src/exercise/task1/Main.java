package exercise.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        TreeMap<String, Person> persons = new TreeMap<>();

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] personalInfo = reader.readLine().split("\\s+");

            if (!persons.containsKey(personalInfo[0])) {
                Person person = new Person(personalInfo[0], Integer.valueOf(personalInfo[1]));
                persons.put(personalInfo[0], person);
            }
        }

        persons.entrySet().stream()
                .filter((x) -> x.getValue().getAge() > 30)
                .forEach(y -> System.out.println(y.getValue()));
    }
}
