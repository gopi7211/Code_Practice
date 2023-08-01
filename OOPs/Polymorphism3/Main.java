package com.gopi7211.Polymorphism3;
//Write a Java program to create a base class Sports with a method called play().
// Create three subclasses: Football, Basketball, and Rugby.
// Override the play() method in each subclass to play a specific statement for each sport.
public class Main {
    public static void main(String[] args) {

        Sports sp = new Sports();
        Sports bask = new BasketBall();
        FootBall foot = new FootBall();
        Sports Rug = new Rugby();

        sp.Play();
        bask.Play();
        foot.Play();
        Rug.Play();
    }
}
