package com.adrianjaylopez.bubblesort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class tests the bubble sort class.
 * @author Adrian J Lopez
 */
public class BubbleSortTest extends TestCase {

    /**
     * Test for the bubble sort method.
     * @throws Exception
     */
    @Test
    public void testBubbleSort() throws Exception {

        BubbleSort<Integer> sort = new BubbleSort<>(); // instantiate class
        //create array to sort and array to compare to
        Integer toSort[] = {5, 3, 2, 6, 7, 1, 9}, sorted[] = {1, 2, 3, 5, 6, 7, 9};
        sort.bubbleSort(toSort);//call the sort method on the array to be sorted
        Assert.assertArrayEquals(sorted, toSort);//check to see if the array to be sorted matches the already sorted array
    }
}