package com.gopi7211.Set_Thread_Priority;

public class SetPriority extends  Thread {
    public void run()
    {
        Thread t = currentThread();
        for (int i = 0; i <=5; i++) {
            try {
                t.sleep(10000);
            }
            catch (Exception e){

            }
            System.out.println(i);
        }
    }
}
