package lab.shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Shape> listOfShapes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] reminder = reader.readLine().split( " ");
            if (reminder.length == 1) {
                listOfShapes.add(new Circle(Double.parseDouble(reminder[0])));
            } else {
                listOfShapes.add(new Rectangle(Double.parseDouble(reminder[0]),
                        Double.parseDouble(reminder[1])));
            }
        }
        for (Shape shape : listOfShapes) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }
}
