package com.adrianjaylopez;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



/**
 * Tests the factorial class.
 * @author Adrian J Lopez
 * @since <pre>4/22/16</pre>
 * @version 1.1
 */
public class FactorialTest {
    Factorial f;
    /**
     * This runs before each test for the initial setup
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        f = new Factorial();// instantiate class
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
     * Tests the recursive factorial method.
     * @throws Exception
     */
    @Test
    public void fact() throws Exception {
        assertEquals(120, f.fact(5));//checks value of factorial

    }

    /**
     * Tests the non recursive factorial method.
     * @throws Exception
     */
    @Test
    public void fact2() throws Exception {
        assertEquals(120, f.fact(5));//checks value of factorial

    }

}