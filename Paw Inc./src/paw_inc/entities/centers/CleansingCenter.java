package paw_inc.entities.centers;

import java.util.HashMap;

public class CleansingCenter extends Center{

    private HashMap<String, AdoptionCenter> adoptionCenters;

    public CleansingCenter(String name) {
        super(name);
    }
}
