package com.menu;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public void printOptions() {
        ArrayList<String> options = new ArrayList<String>(5);
        options.add("Pick your choice");
        options.add("1 - Add");
        options.add("2 - Subtract");
        options.add("3 - Divide");
        options.add("4 - Multiply");

        for(String s : options) {
            System.out.println(s);
        }

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a , int b) {
        return a / b;
    }

    public int multiply(int a , int b) {
        return a * b;
    }

}
