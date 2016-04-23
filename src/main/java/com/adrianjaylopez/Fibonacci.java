package com.adrianjaylopez;

/**
 * This class solves a series of numbers in a fibonacci sequence from n to 1.
 * @author Adrian J Lopez
 * @since <pre>4/18/16</pre>
 * @version 2.0
 */
public class Fibonacci {
    /**
     * Recursive fibonacci sequence
     * O(n^2)
     * @param n perform fibonacci sequence until n
     * @return the total of the fibonacci sequence
     */
    int fib(int n){
        //continue with recursion until
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        //recursive call
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Iterative fibonacci sequence. O(n)
     * @param n perform fibonacci sequence until n
     * @return the total of the fibonacci sequence
     */
    int fib2(int n){
        int a = 0, b = 1, sum = 0;
        //iterate until n
        for (int i = 1; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
