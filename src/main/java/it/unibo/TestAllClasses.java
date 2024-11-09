package it.unibo;

import it.unibo.animal.*;

public class TestAllClasses {
    public static void main(String[] args) {
        Animal kangaroo = new Kangaroo(50.0, "Macropodidae", "Macropus");
        Animal korat = new KoratCat(4.0, "Felidae", "Felis catus");
        Animal siamese = new SiameseCat(7.0, "Felidae", "Felis catus");
        Animal squirrel = new Squirrel(0.60, "Sciuridae", "Sciurus");

        Animal[] animals = {kangaroo, korat, siamese, squirrel};

        // Test the canEat method
        // everything should print true
        System.out.println(!kangaroo.canEat(korat));
        System.out.println(korat.canEat(squirrel));
        System.out.println(!siamese.canEat(kangaroo));
        System.out.println(!squirrel.canEat(korat));

        // Test family and specie methods
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName().toUpperCase() + ":");
            System.out.println("Family: " + a.getFamily());
            System.out.println("Specie: " + a.getSpecies());
        }
    }
}
