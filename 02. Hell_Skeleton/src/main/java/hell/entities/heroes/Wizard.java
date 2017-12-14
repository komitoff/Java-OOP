package hell.entities.heroes;

import hell.utils.Constants;

public class Wizard extends AbstractHero {
    public Wizard(String name) {
        super(name, Constants.WIZARD_INITIAL_STRENGTH,
                Constants.WIZARD_INITIAL_AGILITY,
                Constants.WIZARD_INITIAL_INTELLIGENCE,
                Constants.WIZARD_INITIAL_HIT_POINTS,
                Constants.WIZARD_INITIAL_DAMAGE);
    }
}
