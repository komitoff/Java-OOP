package cresla.entities.containers;

import cresla.annotations.ItemCollection;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Module;

import java.util.*;

public class ModuleContainer implements Container {

    private int moduleCapacity;
    @ItemCollection
    private List<Module> modulesByInput;
    private Map<Integer, EnergyModule> energyModules;
    private Map<Integer, AbsorbingModule> absorbingModules;

    public ModuleContainer(int moduleCapacity) {
        this.moduleCapacity = moduleCapacity;
        this.modulesByInput = new ArrayList<>();
        this.energyModules = new LinkedHashMap<Integer, EnergyModule>();
        this.absorbingModules = new LinkedHashMap<Integer, AbsorbingModule>();
    }

    public void addEnergyModule(EnergyModule energyModule) throws IllegalArgumentException {
        if (energyModule == null) {
            throw new IllegalArgumentException();
        }

        if (this.modulesByInput.size() == this.moduleCapacity) {
            this.removeOldestModule();
        }

        this.energyModules.put(energyModule.getId(), energyModule);
        this.modulesByInput.add(energyModule);
    }

    public void addAbsorbingModule(AbsorbingModule absorbingModule) throws IllegalArgumentException {
        if (absorbingModule == null) {
            throw new IllegalArgumentException();
        }

        if (this.modulesByInput.size() == this.moduleCapacity) {
            this.removeOldestModule();
        }

        this.absorbingModules.put(absorbingModule.getId(), absorbingModule);
        this.modulesByInput.add(absorbingModule);
    }

    @Override
    public long getTotalEnergyOutput() {
        return this.energyModules.values().stream()
                .mapToInt(EnergyModule::getEnergyOutput)
                .sum();
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return this.absorbingModules.values().stream()
                .mapToInt(AbsorbingModule::getHeatAbsorbing)
                .sum();
    }

    private void removeOldestModule() {
        int removeId = this.modulesByInput.remove(0).getId();

        if(!this.energyModules.containsKey(removeId)) {
            this.energyModules.remove(removeId);
        }

        if(!this.absorbingModules.containsKey(removeId)) {
            this.absorbingModules.remove(removeId);
        }
    }
}