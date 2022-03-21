package com.bl.petmanagement;

public class Parrot extends Bird {

    public Parrot(String id) {
        this.id = id;
        name = "Parrot";
        colour = Colour.GREEN;
    }
    @Override
    public void eat() {
        System.out.println("Parrot eats cereals");
    }
}
