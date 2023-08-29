package com.gopi7211.getId_Method;

public class Thred_Method extends Thread{
    public void run(){
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
}
