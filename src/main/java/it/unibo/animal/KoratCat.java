package it.unibo.animal;

import it.unibo.diet.Carnivore;

public class KoratCat extends CommonAnimal {

    public KoratCat(final double weight) {
        super(weight, new Carnivore());
    }
}
