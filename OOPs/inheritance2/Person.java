package com.gopi7211.inheritance2;
// create class name know as person with method called getFirstName() and getLastName()

public class Person {
    public String FirstName;
    public String LastName;

    public Person(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public String FullName(){
        return FirstName + LastName;
    }
}

