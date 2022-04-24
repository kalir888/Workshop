package com.bl.petmanagement;

import java.util.Scanner;
import com.bl.petmanagement.Pet.Colour.*;

import static com.bl.petmanagement.Pet.Colour.*;

public class Main {

    public void handleUserOption(int choice) {
        PetStorage petStorage = PetStorage.getInstance();
        Scanner get = new Scanner(System.in);
        String petId;

        switch(choice) {
            case 1:
                addPet();
                break;
            case 2:
                UserInterface userInterface = UserInterface.getInstance();
                userInterface.print(petStorage.getPetList());
                break;
            case 3:
                System.out.println("Enter the Id of the Pet that you want to remove");
                petId = get.next();
                Pet petToRemove = petStorage.getPet(petId);
                if(petToRemove != null)
                    petStorage.remove(petToRemove);
                else
                    System.out.println("PetId not found to remove");
                break;
            case 4:
                System.out.println("Enter the Id of the Pet that you want to update");
                petId = get.next();
                Pet petToUpdate = petStorage.getPet(petId);
                if(petToUpdate != null)
                    update(petToUpdate);
                else
                    System.out.println("PetId not found \n if you want to add new Pet use Add Pet option in Menu");
                break;
            default:
                System.out.println("Invalid Menu option");
                break;
        }
    }


    public void addPet() {
        Animal dog = new Dog("Do001");
        dog.breed = "Labour";
        dog.age = 5;
        dog.price = 2000;

        Animal dog2 = new Dog("Do001");
        dog2.breed = "Labour";
        dog2.age = 5;
        dog2.price = 2000;

        Animal cat = new Cat("Ca001");
        cat.breed = "BombayCat";
        cat.age = 2;
        cat.price = 1000;

        Animal rabbit = new Rabbit("Ra001");
        rabbit.breed = "Rex";
        rabbit.age = 1;
        rabbit.price = 1500;

        Bird parrot = new Parrot("Pa001");
        parrot.species = "Rose Ringed";
        parrot.age = 1;
        parrot.price = 1000;

        Bird duck = new Duck("Du001");
        duck.species = "Mallard";
        duck.age = 2;
        duck.price = 800;

        PetStorage petStorage = PetStorage.getInstance();
        petStorage.add(dog);
        petStorage.add(cat);
        petStorage.add(rabbit);
        petStorage.add(parrot);
        petStorage.add(duck);
        petStorage.add(dog2);
    }

    public void update(Pet pet) {
        int updateChoice = 0;
        UserInterface userInterface = UserInterface.getInstance();
        while(updateChoice <= 6) {
            if(updateChoice == 6) {
                System.out.println("Returning to Menu");
                break;
            }
            updateChoice = userInterface.showUpdateMenu();
            handleUserUpdateOption(updateChoice,pet);
        }
    }

    public void handleUserUpdateOption(int choice,Pet pet) {
        Scanner get = new Scanner(System.in);
            switch(choice) {
                case 1:
                    System.out.println("Enter the New Name");
                    pet.name = get.next();
                    break;
                case 2:
                    System.out.println("Select a Colour");
                    int i = 0;
                    for(Pet.Colour colour: Pet.Colour.values()) {
                        i++;
                        System.out.println(i + ". " + colour );
                    }

                    int colourChoice = get.nextInt();

                    switch(colourChoice) {
                        case 1:
                            pet.colour = BLACK;
                            break;
                        case 2:
                            pet.colour = RED;
                            break;
                        case 3:
                            pet.colour = WHITE;
                            break;
                        case 4:
                            pet.colour = BLUE;
                            break;
                        case 5:
                            pet.colour = BLACK_WHITE;
                            break;
                        case 6:
                            pet.colour = GREEN;
                            break;
                        case 7:
                            pet.colour = GREY;
                            break;
                        default:
                            System.out.println("Invalid Colour Option");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the New Age");
                    pet.age = get.nextInt();
                    break;
                case 4:
                    System.out.println("Enter the New price");
                    pet.price = get.nextInt();
                    break;
                case 5:
                    System.out.println("Enter the New Breed or Species");
                    if(pet instanceof Animal) {
                        Animal animal = (Animal) pet;
                        animal.breed = get.next();
                    }else {
                        Bird bird = (Bird) pet;
                        bird.species = get.next();
                    }
                    break;
                default:
                    System.out.println("Invalid Update Option");
                    break;

            }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Pet Management System!");

        UserInterface userInterface = UserInterface.getInstance();
        Main main = new Main();

        int choice = 0;
        while(choice <= 5) {
            if(choice == 5) {
                System.out.println("Exiting from Menu");
                break;
            }
            choice = userInterface.showMenu();
            main.handleUserOption(choice);
        }



        /*Animal dog = new Dog("Do001");
        dog.breed = "Labour";
        dog.age = 5;
        dog.price = 2000;

        Animal dog2 = new Dog("Do001");
        dog2.breed = "Labour";
        dog2.age = 5;
        dog2.price = 2000;

        Animal cat = new Cat("Ca001");
        cat.breed = "BombayCat";
        cat.age = 2;
        cat.price = 1000;

        Animal rabbit = new Rabbit("Ra001");
        rabbit.breed = "Rex";
        rabbit.age = 1;
        rabbit.price = 1500;

        Bird parrot = new Parrot("Pa001");
        parrot.species = "Rose Ringed";
        parrot.age = 1;
        parrot.price = 1000;

        Bird duck = new Duck("Du001");
        duck.species = "Mallard";
        duck.age = 2;
        duck.price = 800;

        PetStorage petStorage = new PetStorage();
        petStorage.add(dog);
        petStorage.add(cat);
        petStorage.add(rabbit);
        petStorage.add(parrot);
        petStorage.add(duck);
        petStorage.add(dog2);

        UserInterface userInterface = new UserInterface();
        Set petList = petStorage.getPetList();
        userInterface.print(petList);

        petStorage.remove(cat);
        System.out.println("After Removing Cat");
        userInterface.print(petList);

        System.out.println("Printing Animals");
        userInterface.printAnimals(petList);
        System.out.println("Printing Birds");
        userInterface.printBirds(petList);

        System.out.println("Printing Swimables");
        userInterface.printSwimables(petList);
        System.out.println("Printing Flyables");
        userInterface.printFlyables(petList);*/


    }
}
