package com.gopi7211.Polymorphism2;

public class Programmer extends Employee{
    private double baseSalary;
    private double overtime;

        public Programmer(String name,double baseSalary, double overtime){
            super(name,"Programmer");
            this.baseSalary = baseSalary;
            this.overtime = overtime;
        }

        public double calculateSalary(){
            return baseSalary + overtime;
        }
}
