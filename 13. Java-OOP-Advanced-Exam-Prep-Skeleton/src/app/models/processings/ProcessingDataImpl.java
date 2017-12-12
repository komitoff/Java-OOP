package app.models.processings;

import app.waste_disposal.contracts.ProcessingData;

public class ProcessingDataImpl implements ProcessingData {

    private double energyBalance;
    private double capitalBalance;

    public ProcessingDataImpl(double energyBalance, double capitalBalance) {
        this.capitalBalance = capitalBalance;
        this.energyBalance = energyBalance;
    }
    @Override
    public double getEnergyBalance() {
        return 0;
    }

    @Override
    public double getCapitalBalance() {
        return 0;
    }
}
