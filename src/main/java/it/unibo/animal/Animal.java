package it.unibo.animal;

/**
 * Represents a physical animal with fundamental characteristicsand behaviors common to animals in general.
 */
public interface Animal {

    /**
     * Return the family that animal belongs to.
     * @return the name of animals family name.
     */
    String getFamily();

    /**
     * Return the specie of animal.
     * @return the name of animals species.
     */
    String getSpecies();

    /**
     * Check if the animal passed as parameter can be eaten by this animal.
     * Only carnivores can eat other animals, and only animals that weigh less than the eater can be eaten.
     * @param animal the animal to eat.
     * @return true if the animal can eat the given animal.
     */
    boolean canEat(final Animal animal);

    /**
     * Check if the animal can eat vegetables.
     * @return true if the animal can eat vegetables.
     */
    boolean canEatVegetables();

    /**
     * @return the weight of the animal.
     */
    double getWeight();
}
