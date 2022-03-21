package com.bl.petmanagement;

public class Duck extends Bird {

    public Duck(String id) {
        this.id = id;
        name = "Duck";
        colour = "White";
    }
    @Override
    public void eat() {
        System.out.println("Duck eats seeds");
    }
}