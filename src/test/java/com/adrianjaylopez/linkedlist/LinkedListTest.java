package com.adrianjaylopez.linkedlist;

import com.adrianjaylopez.HelperMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;


/**
 * Tests the linkedlist class
 * @version 1.2
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
        node = new LinkedListNode<>(7);//initialize node with value
        next = new LinkedListNode<>(8);//initialize node with value
        next2 = new LinkedListNode<>(9);//initialize node with value
        HelperMethods.reflectionSetHelper("next", next, node);//call helper method to do reflection for setting variable
        HelperMethods.reflectionSetHelper("next", next2, next);//call helper method to do reflection for setting variable
        HelperMethods.reflectionSetHelper("head", node, list);//use helper set method to set the head node
        HelperMethods.reflectionSetHelper("tail", next2, list);//use helper set method to set the tail node
        HelperMethods.reflectionSetHelper("count", 3, list);//use helper set method to set the count
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
        assertEquals(list.getCount(), 3);//get the count and compare to expected results
    }

    /**
     * Test the gethead method to see what is assigned as the head node
     * @throws Exception
     */
    @Test
    public void testGetHead() throws Exception {
        assertEquals(list.getHead(), node);//get the head node and compare against expected result
    }

    /**
     * Test the gettail method to see what is assigned as the tail node
     * @throws Exception
     */
    @Test
    public void testGetTail() throws Exception {
        assertEquals(list.getTail(), next2);//get the tail node and compare against expected result
    }

    /**
     * Tests the first method which either returns null if there is no head node or returns the head node
     * @throws Exception
     */
    @Test
    public void testFirst() throws Exception {
        assertEquals(list.first(), node.getValue());//get the first node and compare against expected result
    }

    /**
     * Tests the last method which either returns null if there is no tail node or returns the tail node
     * @throws Exception
     */
    @Test
    public void testLast() throws Exception {
        assertEquals(list.last(), next2.getValue());//get the last node and compare against expected result
    }

    /**
     * Tests the addfirst method which adds an item to the front of the list
     * @throws Exception
     */
    @Test
    public void testAddFirst() throws Exception {
        list.addFirst(6);//add a value to the list
        assertEquals(((LinkedListNode)HelperMethods.reflectionGetHelper("head", list)).getValue(), 6);//get the head node and compare against expected result
        assertEquals(((LinkedListNode)HelperMethods.reflectionGetHelper("tail", list)).getValue(), 9);//get the tail node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("count", list), 4);//get the count and compare to expected results

    }

    /**
     * Tests the addlast method  which adds an item to the back of the list
     * @throws Exception
     */
    @Test
    public void testAddLast() throws Exception {
        list.addLast(10);//add a value to the list
        assertEquals(HelperMethods.reflectionGetHelper("head", list), node);//get the head node and compare against expected result
        assertEquals(((LinkedListNode)HelperMethods.reflectionGetHelper("tail", list)).getValue(), 10);//get the tail node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("count", list), 4);//get the count and compare to expected results
    }

    /**
     * Tests the removefirst method which removes the first item from the list
     * @throws Exception
     */
    @Test
    public void testRemoveFirst() throws Exception {
        assertEquals(list.removeFirst(), node.getValue());//remove the first node from the list and compare against expected results
        assertEquals(((LinkedListNode)HelperMethods.reflectionGetHelper("head", list)).getValue(), 8);//get the head node and compare against expected result
        assertEquals(((LinkedListNode)HelperMethods.reflectionGetHelper("tail", list)).getValue(), 9);//get the tail node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("count", list), 2);//get the count and compare to expected results
    }

    @Test
    public void testRemoveLast() throws Exception {
        assertEquals(list.removeLast(), next2.getValue());//remove the first node from the list and compare against expected results
        assertEquals(((LinkedListNode)HelperMethods.reflectionGetHelper("tail", list)).getValue(), 8);//get the tail node and compare against expected result
        assertEquals(HelperMethods.reflectionGetHelper("count", list), 2);//get the count and compare to expected results
    }

    @Test
    public void testSearch() throws Exception {
        assertEquals(list.search(8), 2);//search for node and compare against expected results
    }

    @Test
    public void testDelete() throws Exception {
        assertEquals(list.delete(8), (Integer) 8);//delete node and compare against expected results
        assertEquals(HelperMethods.reflectionGetHelper("count", list), 2);//get the count and compare to expected results

    }

    @Test
    public void testIterator() throws Exception {
        Iterator it = list.iterator();//get iterator from class
        assertEquals(it.hasNext(), true);//call hasnext method and compare against expected results
        assertEquals(it.next(), next);//call next method and compare against expected results
    }
}