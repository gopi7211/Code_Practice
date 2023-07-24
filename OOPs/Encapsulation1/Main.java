package com.gopi7211.Encapsulation1;
//Write a Java program to create a class called Person with private instance variables name, age. and country.
// Provide public getter and setter methods to access and modify these variables.
public class Main {
    public static void main(String[] args) {

        Person per = new Person();

        per.setname("Gopi Shetty");
        per.setAge(21);
        per.setCountry("India");

        String nam = per.getName();
        double age = per.getage();
        String coun = per.getcountry();

        System.out.println("The name is :" + nam);
        System.out.println("The age  is :" + age);
        System.out.println("The country is :" + coun);

    }
}
