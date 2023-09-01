package com.gopi7211.Set_Thread_Priority;


public class main {
    public static void main(String[] args) {
        SetPriority t1 = new SetPriority();
        System.out.println("Priority of Thread is "+t1.getPriority());
        t1.setPriority(1);
        System.out.println("Priority of Thread after changing is " + t1.getPriority());
        t1.start();
    }
}
