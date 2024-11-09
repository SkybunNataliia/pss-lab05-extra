package it.unibo.animal;

import it.unibo.diet.Carnivore;

public class SiameseCat extends CommonAnimal {

    public SiameseCat(final double weight) {
        super(weight, new Carnivore());
    }
}
