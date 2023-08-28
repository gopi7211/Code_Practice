package com.gopi7211.Multi_Thread;

public class Main {
    public static void main(String[] args) {
        single s = new single();
        Thread t = new Thread(s);
        t.start();
    }
}
