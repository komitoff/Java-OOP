package interfaces;

import models.BlobImpl;

public interface Attack {
    void execute(BlobImpl source, BlobImpl target);
}
