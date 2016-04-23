package com.adrianjaylopez;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test cases for the LinkedListNode.
 * @version 2.1
 * @author Adrian J Lopez
 * @since <pre>6/24/15</pre>
 */
public class LinkedListNodeTest {

    LinkedListNode<Integer> node, next;//declarations

    /**
     * Setup before each test
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        node = new LinkedListNode<>(5);//initialize node object and pass in value
    }

    /**
     * Tear down after each test.
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        node = null;//set variables to null at the end of each test
        next = null;
    }

    /**
     * Tests the getnext method.
     * @throws Exception
     */
    @Test
    public void testGetNext() throws Exception {
        next = new LinkedListNode<>(9);//create instance
        HelperMethods.reflectionSetHelper("next", next, node);//call helper method to do reflection for setting variable
        assertEquals(node.getNext(), next);//see if what is set matches the next node
    }

    /**
     * Tests the setter method
     * @throws Exception
     */
    @Test
    public void testSetNext() throws Exception {
        next = new LinkedListNode<>(12);//create instance
        node.setNext(next);//set the next node
        assertEquals(HelperMethods.reflectionGetHelper("next", node), (LinkedListNode)next);//call reflection helper for getter and
        //see if the next node matches the next node
    }

    /**
     * Tests the getter for the value of the node
     * @throws Exception
     */
    @Test
    public void testGetValue() throws Exception {
        assertEquals((int) node.getValue(), 5);//get the value of the node and check against expected result
    }

    /**
     * Tests the setter method for the node
     * @throws Exception
     */
    @Test
    public void testSetValue() throws Exception {
        node.setValue(15);//set the value of the node
        assertEquals(HelperMethods.reflectionGetHelper("value", node), 15);//use reflection getter method and verify
        //against expected result
    }
}