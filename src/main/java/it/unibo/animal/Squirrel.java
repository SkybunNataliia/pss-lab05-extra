package it.unibo.animal;

import it.unibo.diet.Omnivore;

public class Squirrel extends CommonAnimal {

    public Squirrel(final double weight, final String family, final String specie) {
        super(weight, new Omnivore(), family, specie);
    }
}
