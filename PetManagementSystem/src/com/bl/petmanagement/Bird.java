package com.bl.petmanagement;

public abstract class Bird extends Pet {

    String species;

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
