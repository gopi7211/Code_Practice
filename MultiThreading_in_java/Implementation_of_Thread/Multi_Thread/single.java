package com.gopi7211.Multi_Thread;

public class single extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
