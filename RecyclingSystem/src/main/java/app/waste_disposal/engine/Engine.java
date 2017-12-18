package app.waste_disposal.engine;

import app.waste_disposal.contracts.*;
import app.waste_disposal.contracts.Runnable;
import app.waste_disposal.factories.StrategyFactory;
import app.waste_disposal.factories.WasteFactory;
import app.waste_disposal.repositories.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Engine implements Runnable {

    private static final String INTERRUPT_COMMAND = "TimeToRecycle";

    private Repository repository;
    private GarbageProcessor garbageProcessor;
    private WasteFactory wasteFactory;
    private StrategyFactory strategyFactory;
    BufferedReader reader;

    public Engine(Repository repository, GarbageProcessor garbageProcessor) {
        this.repository = repository;
        this.garbageProcessor = garbageProcessor;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.wasteFactory = WasteFactory.getInstance();
        this.strategyFactory = StrategyFactory.getInstance();
    }

    @Override
    public void run() throws IOException{
        while (true) {
            String commands = reader.readLine();

            if (INTERRUPT_COMMAND.equals(commands)) {
                break;
            }
            String output = dispatchCommand(commands);
            System.out.println(output);
        }
    }

    private String dispatchCommand(String commands) {

        String[] command = commands.split("\\s+");
        StringBuilder sb = new StringBuilder();

        Waste waste = null;
        GarbageDisposalStrategy strategy = null;
        ProcessingData processingData = null;
        switch (command[0]) {
            case "ProcessGarbage" :
                String[] params = command[1].split("\\|");
                waste = wasteFactory.createWaste(params[params.length - 1],
                        params[0],
                        Double.valueOf(params[2]),
                        Double.valueOf(params[1]));
                strategy = strategyFactory.createStrategy(params[params.length - 1]);
                processingData = strategy.processGarbage(waste);
                this.repository.addCapital(processingData.getCapitalBalance());
                this.repository.addEnergy(processingData.getEnergyBalance());
                sb.append(String.format("%.2f kg of %s successfully processed!",
                        waste.getWeight(), waste.getName()));
                break;
            case "Status" :
                sb.append(String.format("Energy: %.2f Capital: %.2f",
                        this.repository.getEnergy(), this.repository.getCapital()));
                break;
            default: break;
        }

        return sb.toString();
    }
}
