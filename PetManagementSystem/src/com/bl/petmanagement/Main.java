package com.bl.petmanagement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Pet Management System!");

        Dog dog = new Dog("Do001");
        dog.breed = "Labour";
        dog.age = 5;
        dog.price = 2000;

        Cat cat = new Cat("Ca001");
        cat.breed = "BombayCat";
        cat.age = 2;
        cat.price = 1000;

        Rabbit rabbit = new Rabbit("Ra001");
        rabbit.breed = "Rex";
        rabbit.age = 1;
        rabbit.price = 1500;

        Parrot parrot = new Parrot("Pa001");
        parrot.species = "Rose Ringed";
        parrot.age = 1;
        parrot.price = 1000;

        Duck duck = new Duck("Du001");
        duck.species = "Mallard";
        duck.age = 2;
        duck.price = 800;

        PetStorage petStorage = new PetStorage();
        petStorage.add(dog);
        petStorage.add(cat);
        petStorage.add(rabbit);
        petStorage.add(parrot);
        petStorage.add(duck);

        UserInterface userInterface = new UserInterface();
        ArrayList petList = petStorage.getPetList();
        userInterface.print(petList);

        petStorage.remove(cat);
        System.out.println("After Removing Cat");
        userInterface.print(petList);
    }
}
