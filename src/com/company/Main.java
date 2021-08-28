package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        Dog dog1 = new Dog("Spot", "dog");
        Dog dog2 = new Dog("Casper", "dog");
        Dog dog3 = new Dog("Pinky", "dog");

        Cat cat1 = new Cat("Beerus", "cat");
        Cat cat2 = new Cat("Ester", "cat");
        Cat cat3 = new Cat("Jimmy", "cat");

        animalShelter.enqueue(dog1);
        animalShelter.enqueue(dog2);
        animalShelter.enqueue(cat1);

        for (Animal animal : animalShelter.animals) {
            System.out.println(animal.name);
        }

        System.out.println("--------");

        animalShelter.dequeue("cat");

        System.out.println("--------");


        for (Animal animal : animalShelter.animals) {
            System.out.println(animal.name);
        }
    }



}
