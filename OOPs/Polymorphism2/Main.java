package com.gopi7211.Polymorphism2;
//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer.
// In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
public class Main {
    public static void main(String[] args) {
//        Employee emp = new Employee("Gopala","7211");
        Manger emp1 = new Manger("Gopala",98766,9844);
        Programmer emp2 = new Programmer("Ramesh",8733,94111);

//        System.out.println("Manager: " + man.getName() + "\nRole: " + man.getRole() + "\nSalary: $" + man.calculateSalary());

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Manger: " + emp1.getName() + "\nRoll: " + emp1.getRoll() + "\nSalary : $" + emp1.calculateSalary());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Manger: " + emp2.getName() + "\nRoll: " + emp2.getRoll() + "\nSalary : $" + emp2.calculateSalary());
        System.out.println("--------------------------------------------------------------------------");
    }
}
