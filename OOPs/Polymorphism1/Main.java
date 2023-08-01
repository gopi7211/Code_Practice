package com.gopi7211.Polymorphism1;
// Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
// Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Cat ca = new Cat();
        Bird ba = new Bird();


        ani.Sound();
        ca.Sound();
        ba.Sound();
    }
}
