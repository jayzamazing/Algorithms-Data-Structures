package com.adrianjaylopez.bubblesort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Adrian J Lopez
 */
public class BubbleSortTest extends TestCase {

    @Test
    public void testBubbleSort() throws Exception {

        BubbleSort<Integer> sort = new BubbleSort<>();
        Integer toSort[] = {5, 3, 2, 6, 7, 1, 9}, sorted[] = {1, 2, 3, 5, 6, 7, 9};
        sort.bubbleSort(toSort);
        Assert.assertArrayEquals(sorted, toSort);
    }
}