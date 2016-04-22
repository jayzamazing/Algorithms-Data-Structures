package com.adrianjaylopez;

/**
 * A Node for use with a singly linked list
 *
 * @author Adrian J Lopez
 * @since <pre>6/18/15</pre>
 * @version 2.0
 */
public class LinkedListNode<T> {
    //instance variables
    private T value; //value or element stored in this node
    private LinkedListNode next; //pointer to the next node in the list

    /**
     * Constructor to create node with set value
     * @param value value held inside node
     */
    public LinkedListNode(T value) {
        this(value, null);
    }

    /**
     * Constructor to create node with set value and next node
     *
     * @param value value held inside node
     * @param next  link to next node
     */
    public LinkedListNode(T value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Getter for the next node
     *
     * @return returns next node
     */
    public LinkedListNode getNext() {
        return next;
    }

    /**
     * Setter for the next node
     *
     * @param next link to next node
     */
    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    /**
     * Getter for the value in the node
     *
     * @return returns the value
     */
    public T getValue() {
        return value;
    }

    /**
     * Setter for the value in the node
     *
     * @param value value held inside node
     */
    public void setValue(T value) {
        this.value = value;
    }

}


