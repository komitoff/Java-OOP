package paw_inc.factories;

import paw_inc.entities.centers.AdoptionCenter;
import paw_inc.entities.centers.Center;
import paw_inc.entities.centers.CleansingCenter;

public class CenterFactory {

    private CenterFactory() {}

    public static CenterFactory getInstance() {
        return new CenterFactory();
    }

    public Center createCenter(String type, String name) {
        switch (type) {
            case "CleansingCenter":
                return new CleansingCenter(name);
            case "AdoptionCenter":
                return new AdoptionCenter(name);
            default:
                return null;
        }
    }
}
