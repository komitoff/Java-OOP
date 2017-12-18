package app.waste_disposal;

import app.waste_disposal.annotations.Burnable;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import app.waste_disposal.models.wastes.BurnableWaste;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;

import static org.junit.Assert.*;

public class DefaultGarbageProcessorTest {

    private GarbageProcessor garbageProcessor;

    @Before
    public void init() {
        this.garbageProcessor = new DefaultGarbageProcessor();
    }

    @Test(expected = IllegalArgumentException.class)
    public void processWasteShouldProcessBurnableWastes() throws Exception {
        Waste waste = Mockito.mock(BurnableWaste.class);
        ProcessingData processingData = Mockito.mock(ProcessingData.class);
        Mockito.when(waste.getWeight()).thenReturn(10d);
        Mockito.when(waste.getVolumePerKg()).thenReturn(10d);
        Mockito.when(processingData.getCapitalBalance()).thenReturn(0d);
    }

}