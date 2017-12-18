package app;

import app.waste_disposal.DefaultGarbageProcessor;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.StrategyHolder;
import app.waste_disposal.engine.Engine;
import app.waste_disposal.repositories.Repository;
import app.waste_disposal.repositories.StationRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Repository stationRepository = new StationRepository();
        GarbageProcessor garbageProcessor = new DefaultGarbageProcessor();

        Engine engine = new Engine(stationRepository, garbageProcessor);

        try {
            engine.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
