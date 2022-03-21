package com.bl.petmanagement;


public class Dog extends Animal {

    public Dog(String id) {
        this.id = id;
        name = "Dog";
        colour = Colour.WHITE;
    }
    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
}
