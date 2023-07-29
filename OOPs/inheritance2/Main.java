package com.gopi7211.inheritance2;
// create class name know as person with method called getFirstName() and getLastName()
//create subclass called Employee that add new method named GetEmployeeId() and override the GetLastName()
//method to include the employee job title
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Gopala", "Krishna ",7211,"Java Trainee");
        Employee emp2 = new Employee("Ramesh", "Kumar ",81279,"CPP Traine");

        System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getEmployeeId() );
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " " + emp2.getEmployeeId() );

    }
}
