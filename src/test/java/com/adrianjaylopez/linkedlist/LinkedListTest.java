package com.adrianjaylopez.linkedlist;

import com.adrianjaylopez.HelperMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Tests the linkedlist class
 * @version 1.0
 * @author Adrian J Lopez
 * @since <pre>6/24/15</pre>
 */
public class LinkedListTest {

    //declarations
    LinkedList<Integer> list;
    LinkedListNode<Integer> node, next, next2;

    /**
     *Setup before each test
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        list = new LinkedList<>();//initialize object
    }

    /**
     * Tear down after each test
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        list = null;//set variables to null at the end of each test
        node = null;
        next = null;
    }

    /**
     * Tests the get count method to see how many nodes are in the linkedlist
     * @throws Exception
     */
    @Test
    public void testGetCount() throws Exception {
        HelperMethods.reflectionSetHelper("count", 5, list);//use helper set method and set the count to 5
        assertEquals(list.getCount(), 5);//get the count and compare to expected results
    }

    /**
     * Test the gethead method to see what is assigned as the head node
     * @throws Exception
     */
    @Test
    public void testGetHead() throws Exception {
        node = new LinkedListNode<>(7);//initialize node with value
        HelperMethods.reflectionSetHelper("head", node, list);//use helper set method to set the head node
        assertEquals(list.getHead(), node);//get the head node and compare against expected result
    }

    /**
     * Test the gettail method to see what is assigned as the tail node
     * @throws Exception
     */
    @Test
    public void testGetTail() throws Exception {
        node = new LinkedListNode<>(12);//initialize node with value
        HelperMethods.reflectionSetHelper("tail", node, list);//use helper set method to set the tail node
        assertEquals(list.getTail(), node);//get the head node and compare against expected result
    }

    /**
     * Tests the first method which either returns null if there is no head node or returns the head node
     * @throws Exception
     */
    @Test
    public void testFirst() throws Exception {
        list.first();
        assertEquals(list.first(), null);//get the head node and compare against expected result
        node = new LinkedListNode<>(7);//initialize node with value
        HelperMethods.reflectionSetHelper("head", node, list);//use helper set method to set the head node
        assertEquals(list.first(), node);//get the head node and compare against expected result
    }

    /**
     * Tests the last method which either returns null if there is no tail node or returns the tail node
     * @throws Exception
     */
    @Test
    public void testLast() throws Exception {
        assertEquals(list.last(), null);//get the head node and compare against expected result
        node = new LinkedListNode<>(7);//initialize node with value
        HelperMethods.reflectionSetHelper("tail", node, list);//use helper set method to set the head node
        assertEquals(list.last(), node);//get the head node and compare against expected result
    }

    /**
     * Tests the addfirst method which adds an item to the front of the list
     * @throws Exception
     */
    @Test
    public void testAddFirst() throws Exception {
        list.addFirst(15);//add a value to the list
        assertEquals(HelperMethods.reflectionGetHelper("head", list), 15);//get the head node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("tail", list), 15);//get the head node and compare against expected result
        list.addFirst(9);//add value to the list
        assertEquals(HelperMethods.reflectionGetHelper("head", list), 9);//get the head node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("tail", list), 15);//get the head node and compare against expected result
    }

    /**
     * Tests the addlast method  which adds an item to the back of the list
     * @throws Exception
     */
    @Test
    public void testAddLast() throws Exception {
        list.addLast(15);//add a value to the list
        assertEquals(HelperMethods.reflectionGetHelper("head", list), 15);//get the head node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("tail", list), 15);//get the head node and compare against expected result
        list.addLast(9);//add value to the list
        assertEquals(HelperMethods.reflectionGetHelper("head", list), 15);//get the head node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("tail", list), 9);//get the head node and compare against expected result
    }

    /**
     * Tests the removefirst method which removes the first item from the list
     * @throws Exception
     */
    @Test
    public void testRemoveFirst() throws Exception {
        node = new LinkedListNode<>(7);//initialize node with value
        next = new LinkedListNode<>(8);
        next2 = new LinkedListNode<>(9);
        node.setNext(next);
        next.setNext(next2);
        HelperMethods.reflectionSetHelper("head", node, list);//use helper set method to set the head node
        HelperMethods.reflectionSetHelper("tail", node.getNext().getNext(), list);//use helper set method to set the head node
        assertEquals(list.removeFirst(), node.getValue());
    }

    @Test
    public void testRemoveLast() throws Exception {
        node = new LinkedListNode<>(7);//initialize node with value
        next = new LinkedListNode<>(8);
        next2 = new LinkedListNode<>(9);
        node.setNext(next);
        next.setNext(next2);
        HelperMethods.reflectionSetHelper("head", node, list);//use helper set method to set the head node
        HelperMethods.reflectionSetHelper("tail", node.getNext().getNext(), list);//use helper set method to set the head node
        assertEquals(list.removeLast(), next2.getValue());
    }

    @Test
    public void testSearch() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testIterator() throws Exception {

    }
}