package exercise.online_radio_database;

import exercise.online_radio_database.exceptions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Playlist playlist = new Playlist();
        int count = Integer.valueOf(reader.readLine());

        for (int i = 0; i < count; i++) {
            String[] tokens = reader.readLine().split(";");
            try {
                Song song = new Song(tokens[0], tokens[1], tokens[2]);
                playlist.add(song);
                System.out.println("Song added.");
            } catch (InvalidSongException ise) {
                System.out.println(ise.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid song length.");
            }
        }

        System.out.println(String.format("Songs added: %d", playlist.getSongsCount()));
        System.out.println(playlist.getTotalLength());
    }
}
