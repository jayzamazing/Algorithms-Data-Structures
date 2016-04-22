package com.adrianjaylopez;

/**
 * This class returns the product of integers from n to 1.
 * Good way to count the amount of ways you can order elements.
 * @author Adrian J Lopez
 * @since <pre>4/19/16</pre>
 * @version 1.0
 */
public class Factorial {
    /**
     * Recursive class that multiplies numbers from n to 1. O(n!)
     * @param n integer to factor
     * @return the product of all said numbers
     */
    int fact(int n){
        //continue recursive calls until n = 1
        if (n == 1)
            return 1;
        //recursive factorial call taking number minus 1
        return n * fact(n -1);
    }

    /**
     * Class that calculates factorial without recursion. O(n!)
     * @param n integer to factor
     * @return the product of all said numbers
     */
    int fact2(int n){
        int j = 1;
        //loop from 2 till n
        for (int i = 2; i < n; i++){
            //factorial calculation
            j = j * i;
        }
        return j;
    }
}
