package com.bl.petmanagement;

public class Rabbit extends Animal {

    public Rabbit(String id) {
        this.id = id;
        name = "Rabbit";
        colour = "White";
    }
    @Override
    public void eat() {
        System.out.println("Rabbit eats carrot");
    }
}
