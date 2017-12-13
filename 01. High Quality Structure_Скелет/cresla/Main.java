package cresla;

import cresla.engines.Engine;
import cresla.entities.containers.ModuleContainer;
import cresla.entities.reactors.CryoReactor;
import cresla.interfaces.Runnable;
import cresla.repositories.ReactorRepository;
import cresla.repositories.Repository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Repository repository = new ReactorRepository();
        Runnable engine = new Engine(repository);
        try {
            engine.run();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CryoReactor reactor = new CryoReactor(2, new ModuleContainer(2), 16);
        System.out.println(reactor.getModuleCount());
    }
}
