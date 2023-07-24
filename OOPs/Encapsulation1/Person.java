package com.gopi7211.Encapsulation1;
////Write a Java program to create a class called Person with private instance variables name, age. and country.
//// Provide public getter and setter methods to access and modify these variables.
public class Person {
    private String name;
    private double age;
    private String country;

    public String getName() {
        return name;
    }

    public double getage() {
        return age;
    }

    public String getcountry() {
        return country;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setAge(double age){
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

