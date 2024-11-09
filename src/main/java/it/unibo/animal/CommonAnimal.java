package it.unibo.animal;

import it.unibo.diet.*;

/**
 * The generic class that implements Interface Animal, destinated to be extended.
 */
public class CommonAnimal implements Animal {

    protected final double weight;
    protected final Diet diet;
    protected final String family;
    protected final String species;

    /**
     * Constructor of common animal/
     * @param weight
     */
    protected CommonAnimal(final double weight, final Diet diet, final String family, final String species) {
        this.weight = weight;
        this.diet = diet;
        this.family = family;
        this.species = species;
    }

    
   
    /**
     * Check if the animal passed as parameter can be eaten by this animal.
     * Only carnivores can eat other animals, and only animals that weigh less than the eater can be eaten.
     * @param animal the animal to eat.
     * @return true if the animal can eat the given animal.
     */
    public boolean canEat(final Animal animal) {
        return this.diet.canEatMeat() && (animal.getWeight() < this.getWeight());
    }

    /**
     * Check if the animal can eat vegetables.
     * @return true if the animal can eat vegetables.
     */
    public boolean canEatVegetables() {
        return this.diet.canEatVegetables();
    }

    /**
     * @return the weight of the animal.
     */
    public double getWeight() {
        return this.weight;
    }
}
