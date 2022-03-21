package com.bl.petmanagement;

public abstract class Pet {
    enum Colour{BLACK,RED,WHITE,BLUE,BLACK_WHITE,GREEN,GREY}
    String id;
    String name;
    Colour colour;
    int age;
    int price;`

    public abstract void eat();
}
