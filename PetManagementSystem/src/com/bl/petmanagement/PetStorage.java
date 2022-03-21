package com.bl.petmanagement;

import java.util.ArrayList;

public class PetStorage {
    private ArrayList petList = new ArrayList();

    public void add(Pet pet) {
        petList.add(pet);
    }

    public ArrayList getPetList() {
        return petList;
    }

    public void remove(Pet pet) {
        petList.remove(pet);
    }
}
