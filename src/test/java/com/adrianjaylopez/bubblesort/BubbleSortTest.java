package com.adrianjaylopez.bubblesort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * This class tests the bubble sort class.
 * @Author Adrian J Lopez
 * @since <pre>6/20/15</pre>
 * @version 1.2
 */
public class BubbleSortTest {

    //declarations
    BubbleSort<Integer> sort;
    Integer toSort[], sorted [];

    /**
     * This runs before each test for the initial setup
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        sort = new BubbleSort<>(); // instantiate class
        //create array to sort and array to compare to
        toSort = new Integer[] {5, 3, 2, 6, 7, 1, 9};
        sorted = new Integer[] {1, 2, 3, 5, 6, 7, 9};
    }

    /**
     * This runs after each test to perform clean up
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        //set everything to null
        sort = null;
        toSort = null;
        sorted = null;
    }

    /**
     * Test for the bubble sort method.
     * @throws Exception
     */
    @Test
    public void testBubbleSort() throws Exception {
        sort.bubbleSort(toSort);//call the sort method on the array to be sorted
        assertArrayEquals(sorted, toSort);//check to see if the array to be sorted matches the already sorted array
    }

    /**
     * Test for the sort method using Java 8 method reference.
     * @throws Exception
     */
    @Test
    public void testBubbleSort2() throws Exception {
        sort.bubbleSort2(toSort);//call the sort method on the array to be sorted
        assertArrayEquals(sorted, toSort);//check to see if the array to be sorted matches the already sorted array
    }
}