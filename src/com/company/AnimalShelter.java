package com.company;

import java.util.ArrayList;


public class AnimalShelter {
    ArrayList<Animal> animals = new ArrayList();

    public void enqueue(Animal animal) {
        animals.add(animal);
    }

    public void dequeue(String pref) {
        // validation to ensure there are animals in the shelter
        if (!(animals.size() > 0)) {
            System.out.println("There are no animals in the shelter at this time.");
        }

        // validation to make sure cat or dog is the pref
        if (pref != "cat") {
            if (pref != "dog") {
                return;
            }
        }

        // find animal that matches the pref string passed into the method
        for (Animal animal: animals) {
            if (animal.animalType == pref) {
                animals.remove(animal);
                System.out.println("You got " + animal.name);
                break;
            }
        }
    }
}
