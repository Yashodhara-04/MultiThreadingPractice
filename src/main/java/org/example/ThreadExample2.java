package org.example;

public class ThreadExample2 {

    public static class MyThread extends Thread
    {
        public void run()
        {
            System.out.println("MyThread running");
            System.out.println("My Thread finished");
        }
    }

    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
