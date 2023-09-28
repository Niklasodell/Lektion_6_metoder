package com.niklas.metoder;

public class Student {

    public int age;
    public String name;
    public boolean isTired;

    public Student(int age, String name, boolean isTired) {
        this.age = age;
        this.name = name;
        this.isTired = isTired;
    }

    // Methods
    public String showIfSleepy() {

        if (isTired == true) {
            return name + " is Very tired!";
        } else
            return name + " is not tired";

    }
}

