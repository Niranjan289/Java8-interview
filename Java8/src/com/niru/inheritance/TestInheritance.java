package com.niru.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.whoIAM();

        Cat cat = new Cat();
        cat.whoIAM();

        /*Dog dog1 = new Animal(); child class not hold Parent reference.
        dog1.whoIAM();*/

        Animal animal = new Dog();
        animal.whoIAM();
    }
}
