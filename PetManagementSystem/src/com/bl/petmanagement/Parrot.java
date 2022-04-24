package com.bl.petmanagement;

public class Parrot extends Bird implements Flyable {

    public Parrot(String id) {
        this.id = id;
        name = "Parrot";
        colour = Colour.GREEN;
    }
    @Override
    public void eat() {

        System.out.println("Parrot eats cereals");
    }

    @Override
    public void fly() {
        System.out.println("Parrot can Fly");
    }
}
