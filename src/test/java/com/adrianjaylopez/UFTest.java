package com.adrianjaylopez;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the UF(Union Find) class.
 * @author Jay
 * @version 2.0
 * @since <pre>12/3/15</pre>
 */
public class UFTest {

    UF unionfFind;
    private int[] parent;
    private byte[] rank;
    private int count;

    /**
     * This runs before each test for the initial setup
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        unionfFind = new UF(10);//initialize object
        parent = new int[]{3, 1, 2, 3, 4, 4, 0, 1, 2, 3};//initialize arrays to compare against
        rank = new byte[]{1, 1, 1, 2, 1, 0, 0, 0, 0, 0};
        unionfFind.union(1, 7);//call union method
        unionfFind.union(2, 8);
        unionfFind.union(3, 9);
        unionfFind.union(0, 6);
        unionfFind.union(4, 5);
        unionfFind.union(3, 6);
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

    /**
     * Tests the union method.
     * @throws Exception
     */
    @Test
    public void testUnion() throws Exception {
        //use helper method to get the rank array and compare to expected results.
        assertArrayEquals((byte[]) HelperMethods.reflectionGetHelper("rank", unionfFind), rank);
        //use helper method to get the parent array and compare to expected results.
        assertArrayEquals((int[]) HelperMethods.reflectionGetHelper("parent", unionfFind), parent);

    }

    /**
     * Tests connected method to see if points are connected.
     * @throws Exception
     */
    @Test
    public void testConnected() throws Exception {
        assertTrue(unionfFind.connected(3,9));
        assertFalse(unionfFind.connected(4,0));
    }

    /**
     * Tests to see if point has the correct root.
     * @throws Exception
     */
    @Test
    public void testRoot() throws Exception {
        assertEquals(3, unionfFind.root(9));
        assertNotEquals(5, unionfFind.root(9));
    }

    /**
     * Test the current count of the points that are not connected.
     * @throws Exception
     */
    @Test
    public void testCount() throws Exception {
        assertEquals(4, unionfFind.count());
    }




}
