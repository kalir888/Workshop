package com.bl.petmanagement;

import java.util.ArrayList;

public class UserInterface {
    public void print(ArrayList petList) {
        for(int i = 0; i < petList.size(); i++) {
            System.out.println(petList.get(i));
        }
    }
}
