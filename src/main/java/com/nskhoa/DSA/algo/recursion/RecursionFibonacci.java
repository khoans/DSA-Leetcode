package com.nskhoa.DSA.algo.recursion;

public class RecursionFibonacci {
    public static void main(String[] args) {
        int result = fibo(20);
        System.out.println(result);

    }

    public static int fibo(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        }


        return fibo(n - 1) + fibo(n - 2);
    }
}
