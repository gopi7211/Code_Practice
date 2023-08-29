package com.gopi7211.getId_Method;

public class main {
    public static void main(String[] args) {
        Thred_Method t1 = new Thred_Method();
        System.out.println("ID="+t1.getId());
        t1.start();
    }
}
