package ex.ex2.ferrari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String driver = reader.readLine();
        Car ferarri = new Ferrari(driver);
        System.out.println(ferarri);
    }
}
