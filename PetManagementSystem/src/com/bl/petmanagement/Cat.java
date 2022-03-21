package com.bl.petmanagement;

public class Cat extends Animal {

    public Cat(String id) {
        this.id = id;
        name = "Cat";
        colour = "White";
    }

    @Override
    public void eat() {

        System.out.println("Cat eats fish");
    }
}
