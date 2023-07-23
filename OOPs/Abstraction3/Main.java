package com.gopi7211.Abstraction3;

public class Main {
    public static void main(String[] args) {

        Animal leo = new Lion();
        leo.eat();
        leo.sleep();

        Tiger lio = new Tiger();
        lio.eat();
        lio.sleep();

        Animal dee = new Deer();
        dee.eat();
        dee.sleep();
    }
}
