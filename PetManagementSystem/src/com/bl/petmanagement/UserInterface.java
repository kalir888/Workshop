package com.bl.petmanagement;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    private static UserInterface instance;

    private UserInterface() {
    }

    public static UserInterface getInstance() {
        if(instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    public void print(Set<Pet> petList) {
        for(Pet pet: petList) {
            System.out.println(pet);
        }
    }

    public void printAnimals(Set<Pet> petList) {
        for(Pet pet : petList) {
            if(pet instanceof Animal)
                System.out.println(pet);
        }
    }

    public void printBirds(Set<Pet> petList) {
        for(Pet pet : petList) {
            if(pet instanceof Bird)
                System.out.println(pet);
        }
    }

    public void printSwimables(Set<Pet> petList) {
        for(Pet pet: petList ) {
            if(pet instanceof Swimable)
                ((Swimable) pet).swim();
        }
    }

    public void printFlyables(Set<Pet> petList) {
        for(Pet pet: petList) {
            if(pet instanceof Flyable)
                ((Flyable) pet).fly();
        }
    }

    public int showMenu() {
        System.out.println("Select an option: \n1.Add pet 2.Print pet 3. Remove " +
                           "pet 4. Update pet 5. Exit");
        Scanner get = new Scanner(System.in);
        int userChoice = get.nextInt();
        return userChoice;
    }

    public int showUpdateMenu() {
        System.out.println("Select an Update option \n1.Name 2.Colour 3.Age 4.Price 5.Breed or Species 6.GotoMenu");
        Scanner get = new Scanner(System.in);
        int userChoice = get.nextInt();
        return userChoice;
    }
}
