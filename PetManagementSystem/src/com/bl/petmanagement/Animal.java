package com.bl.petmanagement;

public abstract class Animal extends Pet{

    String breed;

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
