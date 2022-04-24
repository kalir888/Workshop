package com.bl.petmanagement;


public class Dog extends Animal implements Swimable {

    public Dog(String id) {
        this.id = id;
        name = "Dog";
        colour = Colour.WHITE;
    }
    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void swim() {
        System.out.println("Dog can Swim");
    }
}
