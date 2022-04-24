package com.bl.petmanagement;

import java.util.HashSet;
import java.util.Set;

public class PetStorage {
    private static PetStorage instance;
    private Set<Pet> petList = new HashSet<>();

    private PetStorage() {
    }

    public static PetStorage getInstance() {
        if(instance == null) {
            instance = new PetStorage();
        }
        return instance;
    }

    public void add(Pet pet) {
        petList.add(pet);
    }

    public void remove(Pet pet) {
        petList.remove(pet);
    }

    public Set<Pet> getPetList() {
        return petList;
    }

    public Pet getPet(String petId){
        for(Pet pet: petList) {
            if(petId.equals(pet.id))
                return pet;
        }
        return null;
    }
}
