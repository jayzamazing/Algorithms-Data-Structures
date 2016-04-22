package com.adrianjaylopez;

/**
 * This class solves a series of numbers in a fibonacci sequence from n to 1.
 * O(n^2)
 * @author Adrian J Lopez
 * @since <pre>4/18/16</pre>
 * @version 1.0
 */
public class Fibonacci {
    int fib(int n){
        //continue with recursion until
        if (n <= 1)
            return 1;
        //recursive call
        return fib(n - 1) + fib(n - 2);
    }
}
