package com.gopi7211.set_name;

public class TMethods {
    public static void main(String[] args) {
        Th t1 = new Th();

        // SetName -> is used to set the name for the Thread
        t1.setName("Gopala");
        System.out.println("Name of the Thread is "+t1.getName());
        t1.start();



    }
}
