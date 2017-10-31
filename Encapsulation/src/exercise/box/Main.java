package exercise.box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.valueOf(reader.readLine());
        double width = Double.valueOf(reader.readLine());
        double height = Double.valueOf(reader.readLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(box);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
