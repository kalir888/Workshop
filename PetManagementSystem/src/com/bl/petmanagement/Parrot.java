package com.bl.petmanagement;

public class Parrot extends Bird {

    public Parrot(String id) {
        this.id = id;
        name = "Parrot";
        colour = "Green";
    }
    @Override
    public void eat() {
        System.out.println("Parrot eats cereals");
    }
}
