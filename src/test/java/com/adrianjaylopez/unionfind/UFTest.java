package com.adrianjaylopez.unionfind;

import org.junit.After;
import org.junit.Before;

import java.util.Scanner;

/**
 * @author Jay
 * @version 1.0
 * @since <pre>12/3/15</pre>
 */
public class UFTest {

    UF unionfFind;
    Scanner scanner;
    /**
     * This runs before each test for the initial setup
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of connections");
        unionfFind = new UF(scanner.nextInt());
    }

    /**
     * This runs after each test to perform clean up
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        //set everything to null
        unionfFind = null;
    }




}
