package it.unibo.animal;

import it.unibo.diet.Omnivore;

public class Squirrel extends CommonAnimal {

    public Squirrel(final double weight) {
        super(weight, new Omnivore());
    }
}
