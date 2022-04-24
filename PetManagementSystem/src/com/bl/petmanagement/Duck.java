package com.bl.petmanagement;

public class Duck extends Bird implements Flyable,Swimable {

    public Duck(String id) {
        this.id = id;
        name = "Duck";
        colour = Colour.WHITE;
    }
    @Override
    public void eat() {

        System.out.println("Duck eats seeds");
    }

    @Override
    public void fly() {
        System.out.println("Duck can Fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can Swim");
    }
}
