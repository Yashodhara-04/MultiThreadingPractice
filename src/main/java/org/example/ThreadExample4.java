package org.example;

public class ThreadExample4 {

    public static void main(String[] args)
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running");
                System.out.println("Thread finished");
            }
        };

        Runnable runnable1 = ()->
        {
            System.out.println("Thread");
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
