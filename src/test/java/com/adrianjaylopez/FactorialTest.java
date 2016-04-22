package com.adrianjaylopez;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests the factorial class.
 * @author Adrian J Lopez
 * @since <pre>4/22/16</pre>
 * @version 1.0
 */
public class FactorialTest extends TestCase {
    Factorial f;
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
        assertEquals(f.fact(5), 120);//checks value of factorial

    }

    /**
     * Tests the non recursive factorial method.
     * @throws Exception
     */
    @Test
    public void fact2() throws Exception {
        assertEquals(f.fact2(5), 120);//checks value of factorial

    }

}