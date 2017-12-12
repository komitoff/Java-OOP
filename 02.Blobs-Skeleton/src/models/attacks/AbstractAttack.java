package models.attacks;

import interfaces.Attack;
import models.BlobImpl;

public abstract class AbstractAttack implements Attack {
    public abstract void execute(BlobImpl attacker, BlobImpl target);
}
