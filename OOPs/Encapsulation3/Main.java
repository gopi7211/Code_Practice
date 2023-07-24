package com.gopi7211.Encapsulation3;
//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
// Provide public getter and setter methods to access and modify the id and name variables,
// but provide a getter method for the salary variable that returns a formatted string.
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmployee_id(123);
        emp.setEmployee_name("Gopala");
        emp.setEmployee_salary(20000);

        double id = emp.getEmployee_id();
        String name = emp.getEmployee_name();
        String formsalar = emp.getFormattedSalary();

        System.out.println("Employee Details");
        System.out.println("ID:" + id);
        System.out.println("Name" + name);
        System.out.println("salary" + formsalar);

    }
}
