package hell.entities.heroes;

import hell.utils.Constants;

public class Assassin extends AbstractHero {

    public Assassin(String name) {
        super(name, Constants.ASSASSIN_INITIAL_STRENGTH,
                Constants.ASSASSIN_INITIAL_AGILITY,
                Constants.ASSASSIN_INITIAL_INTELLIGENCE,
                Constants.ASSASSIN_INITIAL_HIT_POINTS,
                Constants.ASSASSIN_INITIAL_DAMAGE);
    }


}
