package com.adrianjaylopez;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the fibonacci class.
 * @author Adrian J Lopez
 * @since <pre>4/22/16</pre>
 * @version 1.0
 */
public class FibonacciTest {
    Fibonacci f;
    /**
     * This runs before each test for the initial setup
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        f = new Fibonacci();// instantiate class
    }

    /**
     * This runs after each test to perform clean up
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        //set everything to null
        f = null;
    }

    /**
     * Tests the fibonacci recursive method.
     * @throws Exception
     */
    @Test
    public void fib() throws Exception {
        assertEquals(8, f.fib(6));//checks value of fibonacci sequence
    }

    /**
     * Tests the fibonacci loop method.
     * @throws Exception
     */
    @Test
    public void fib2() throws Exception {
        assertEquals(8, f.fib(6));//checks value of fibonacci sequence
    }

}