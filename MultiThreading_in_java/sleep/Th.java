package com.gopi7211.sleep;

public class Th extends  Thread{
    public void run(){
        for (int i = 0; i < 5; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

}
