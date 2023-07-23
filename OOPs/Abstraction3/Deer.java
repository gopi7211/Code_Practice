package com.gopi7211.Abstraction3;

class Deer extends Animal{
    @Override
    void eat() {
        System.out.println("Deer will eat grass");
    }

    @Override
    void sleep() {
        System.out.println("deer will sleep with sharp observation");
    }
}
