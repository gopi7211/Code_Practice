package com.gopi7211.Polymorphism2;

public class Manger extends Employee{
    private double baseSalary;
    private double bonus;


    public Manger(String name, double baseSalary, double bonus) {
        super(name, "Manger");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return  baseSalary + bonus;
    }
}
