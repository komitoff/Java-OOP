package models.attacks;

import models.BlobImpl;

public class PutridFart extends AbstractAttack {

    public void execute(BlobImpl source, BlobImpl target) {
        target.respond(source.getDamage());
    }
}
