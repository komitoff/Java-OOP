package hell.entities.heroes;

import hell.utils.Constants;

public class Barbarian extends AbstractHero {

    public Barbarian(String name) {
        super(name, Constants.BARBARIAN_INITIAL_STRENGTH,
                Constants.BARBARIAN_INITIAL_AGILITY,
                Constants.BARBARIAN_INITIAL_INTELLIGENCE,
                Constants.BARBARIAN_INITIAL_HIT_POINTS,
                Constants.BARBARIAN_INITIAL_DAMAGE);
    }
}
