package com.bl.petmanagement;

import java.util.Objects;

public abstract class Pet {
    enum Colour{BLACK,RED,WHITE,BLUE,BLACK_WHITE,GREEN,GREY}
    String id;
    String name;
    Colour colour;
    int age;
    int price;

    public abstract void eat();

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
