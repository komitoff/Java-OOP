package interfaces;

import models.Blob;

public interface Attack {
    void execute(Blob source, Blob target);
}
