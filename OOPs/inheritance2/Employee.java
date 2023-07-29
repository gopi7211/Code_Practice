package com.gopi7211.inheritance2;

public class Employee extends Person{
    public int EmployeeId;
    public String JobTitle;

    public Employee(String FirstName, String LastName, int EmployeeId, String JobTitle) {
        super(FirstName, LastName);
        this.EmployeeId = EmployeeId;
        this.JobTitle = JobTitle;
    }

    public int getEmployeeId(){
        return EmployeeId;
    }

    public String getLastName(){
        return  super.getLastName() + "," + JobTitle;
    }
}
