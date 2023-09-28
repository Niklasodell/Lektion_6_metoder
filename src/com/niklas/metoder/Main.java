package com.niklas.metoder;

public class Main {
    public static void main(String[] args) {

        // Object Creation AKA Insantiation
        Student benny = new Student(15, "Benny", false);
        Student frida = new Student(25, "Frida", true);

        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.isTired);

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.showIfSleepy());


    }
}
