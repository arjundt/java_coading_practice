package com.example.multithreading;

public class DeamonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world! ");
        }
    }

    public static void main(String[] args) {
        DeamonThread myThread = new DeamonThread();
        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        DeamonThread t1 = new DeamonThread();
        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Main Done");
    }
}