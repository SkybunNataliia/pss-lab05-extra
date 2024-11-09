package it.unibo.animal;

import it.unibo.diet.Carnivore;

public class SiameseCat extends CommonAnimal {

    public SiameseCat(final double weight, final String family, final String specie) {
        super(weight, new Carnivore(), family, specie);
    }
}
