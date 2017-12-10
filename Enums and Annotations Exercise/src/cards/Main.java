package cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Ranks rank = Ranks.valueOf(reader.readLine());
        Suits suit = Suits.valueOf(reader.readLine());

        int power = rank.getValue() + suit.getValue();

        System.out.println(String.format("Card name: %s of %s; Card power: %d",
                rank, suit, power));
    }
}
