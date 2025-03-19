package org.example;

public class ThreadExample5 {

    public static void main(String[] args)
    {
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Thread");
        };
        //Order in which these lines are printed are not guaranteed it is based on the CPU
        Thread thread1 = new Thread(runnable, "Yashu1");
        thread1.start();
        Thread thread2 = new Thread(runnable, "Yashu2");
        thread2.start();
        Thread thread3 = new Thread(runnable, "Yashu3");
        thread3.start();
        Thread thread4 = new Thread(runnable, "Yashu4");
        thread4.start();
    }
}
