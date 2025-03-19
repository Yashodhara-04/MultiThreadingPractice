package org.example;

public class ThreadExample3 {

    public static class MyRunnable implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("Thread running");
            System.out.println("Thread finished");
        }
    }

    public static void main(String[] args)
    {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
