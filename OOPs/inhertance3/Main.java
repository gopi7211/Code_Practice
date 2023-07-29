package com.gopi7211.inhertance3;

public class Main {
    public static void main(String[] args) {

        //Creating Object for All classes
        Animal ani = new Animal();
        Cat ca = new Cat();
        Dog dg = new Dog();

        // calling the method using instance variable
        ani.makeSound();
        ca.makeSound();
        dg.makeSound();

    }
}
