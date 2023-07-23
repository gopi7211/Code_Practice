package com.gopi7211.Abstraction3;

public class Lion extends  Animal{
    @Override
    void eat() {
        System.out.println("Lions eat met");
    }

    @Override
    void sleep() {
        System.out.println("Lions sleeps on grassland");
    }
}
