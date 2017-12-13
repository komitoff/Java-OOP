package cresla.engines;

import cresla.interfaces.Runnable;
import cresla.repositories.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Engine implements Runnable {

    private static final String TERMINATE_COMMAND = "Exit";

    private Repository repository;
    private BufferedReader reader;

    public Engine(Repository repository) {
        this.repository = repository;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() throws IOException {
        while (true) {
            List<String> tokens = new ArrayList<>(Arrays.asList(this.reader.readLine().split("\\s+")));
            this.dispatchCommand(tokens.get(0), tokens);

            if (TERMINATE_COMMAND.equals(tokens.get(0))) {
                break;
            }
        }
    }

    private void dispatchCommand(String command, List<String> tokens) {


        switch (command) {

        }
    }
}
