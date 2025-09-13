package com.nskhoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Simulate 5 threads trying to get the singleton instance
        Runnable task = () -> {
            DatabaseConnection conn = DatabaseConnection.getInstance();
            System.out.println("Thread " + Thread.currentThread().getId() + " -> " + conn.hashCode());
            conn.connect();
        };

        // Create and start 5 threads
        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
