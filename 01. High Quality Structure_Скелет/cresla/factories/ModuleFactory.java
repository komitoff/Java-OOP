package cresla.factories;

import cresla.entities.modules.AbstractModule;
import cresla.entities.modules.absorbing.CooldownSystem;
import cresla.entities.modules.absorbing.HeatProcessor;
import cresla.entities.modules.energy.CryogenRod;

public class ModuleFactory {

    private ModuleFactory() {}

    public AbstractModule createModule(String type, int firstParam, int secondParam) {
        if (type.equals("CryogenRod")) {
            return new CryogenRod(firstParam, secondParam);
        }
        if (type.equals("CooldownSystem")) {
            return new CooldownSystem(firstParam, secondParam);
        }
        if (type.equals("HeatProcessor")) {
            return new HeatProcessor(firstParam, secondParam);
        }

        return null;
    }

    public ModuleFactory getInstance() {
        return new ModuleFactory();
    }
}
