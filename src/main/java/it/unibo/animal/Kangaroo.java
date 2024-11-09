package it.unibo.animal;

import it.unibo.diet.Herbivore;

public class Kangaroo extends CommonAnimal {

    public Kangaroo(final double weight, final String family, final String specie) {
        super(weight, new Herbivore(), family, specie);
    }
}
