package com.gopi7211.Polymorphism2;
//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer.
// In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
public class Employee {
    private String name;
    private String roll;

    public Employee(String name, String roll){
        this.name = name;
        this.roll = roll;
    }

    public String getName(){
        return name;
    }

    public String getRoll(){
        return roll;
    }

    public double calculateSalary(){
        return 0.0;
    }
}
