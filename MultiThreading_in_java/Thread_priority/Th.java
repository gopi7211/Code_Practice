package com.gopi7211.Thread_priority;

public class Th extends Thread{
    public void run()
    {
        Thread t = currentThread();
        for (int i = 0; i <=5; i++) {
            try {
                t.sleep(100);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
