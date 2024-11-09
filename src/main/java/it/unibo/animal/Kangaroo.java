package it.unibo.animal;

import it.unibo.diet.Herbivore;

public class Kangaroo extends CommonAnimal {

    public Kangaroo(final double weight) {
        super(weight, new Herbivore());
    }
}
