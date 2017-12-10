import models.Blob;
import models.attacks.PutridFart;
import models.behaviors.Aggressive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Blob blob = new Blob("Ivan", 25, 25, new Aggressive(), new PutridFart());

        System.out.println(blob);
    }
}
