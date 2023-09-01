package com.gopi7211.Thread_priority;

public class TMetods_Main {
    public static void main(String[] args) {
        Th t1 = new Th();
        System.out.println("Priority of Thread is "+t1.getPriority());
        t1.start();
    }
}
