package models.behaviors;

import interfaces.Behavior;
import models.BlobImpl;

public abstract class AbstractBehavior implements Behavior {

    protected boolean isTriggered;
    protected boolean toDelayRecurrentEffect;

    public AbstractBehavior() {
        this.toDelayRecurrentEffect = true;
    }

    public boolean isTriggered() {
        return this.isTriggered;
    }

    public void setIsTriggered(boolean isTriggered) {
        this.isTriggered = isTriggered;
    }

    public boolean toDelayRecurrentEffect() {
        return this.toDelayRecurrentEffect;
    }

    public void setToDelayRecurrentEffect(boolean toDelayRecurrentEffect){
        this.toDelayRecurrentEffect = toDelayRecurrentEffect;
    }

    public abstract void trigger(BlobImpl source);

    public abstract void applyRecurrentEffect(BlobImpl source);
}
