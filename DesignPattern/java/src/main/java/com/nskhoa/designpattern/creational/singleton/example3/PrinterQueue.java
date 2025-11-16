package com.nskhoa.designpattern.creational.singleton.example3;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    private static PrinterQueue instance;
    private Queue<String> jobs = new LinkedList<>();

    private PrinterQueue() {
    }

    public static PrinterQueue getInstance() {
        if (instance == null) {
            instance = new PrinterQueue();
        }
        return instance;
    }

    public void addJob(String job) {
        jobs.add(job);
    }

    public String printNext() {
        return jobs.poll();
    }

    public static void main(String[] args) {
        PrinterQueue printerQueue = PrinterQueue.getInstance();
        printerQueue.addJob("Document1.pdf");
        printerQueue.addJob("Image1.png");

        System.out.println("Printing: " + printerQueue.printNext());
        System.out.println("Printing: " + printerQueue.printNext());
    }
}
