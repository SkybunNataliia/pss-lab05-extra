package it.unibo.animal;

import it.unibo.diet.Carnivore;

public class KoratCat extends CommonAnimal {

    public KoratCat(final double weight, final String family, final String specie) {
        super(weight, new Carnivore(), family, specie);
    }
}
