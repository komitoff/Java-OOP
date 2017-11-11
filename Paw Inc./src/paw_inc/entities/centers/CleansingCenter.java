package paw_inc.entities.centers;

import paw_inc.entities.animals.Animal;

import java.util.HashMap;
import java.util.List;

public class CleansingCenter extends Center{

    private HashMap<String, AdoptionCenter> adoptionCenters;

    public CleansingCenter(String name) {
        super(name);
    }

}
