package com.adrianjaylopez.linkedlist;

import java.util.Iterator;

/**
 * Collection of nodes that are linked together
 *
 * @Author Adrian J Lopez
 * @since <pre>6/20/15</pre>
 * @version 1.0
 * @param <T> generic type parameter
 */
public class LinkedList<T> {
    //instance variables
    private LinkedListNode<T> head = null, tail = null; //head and tail nodes
    private int count = 0; //amount of nodes in list

    /**
     * Method to get the current count
     * @return returns int with the current amount of nodes
     */
    public int getCount() {
        return count;
    }

    /**
     * Set the count, private and only set in this class
     * @param count sets the count for the amount of nodes
     */
    private void setCount(int count) {
        this.count = count;
    }

    /**
     * Method to get the current head.
     * @return returns the head node.
     */
    public LinkedListNode<T> getHead() {
        return head;
    }

    /**
     * Sets the head node for the linked list
     * @param head sets the head node
     */
    private void setHead(LinkedListNode<T> head) {
        this.head = head;
    }

    /**
     *Method to get the tail node
     * @return returns tail node
     */
    public LinkedListNode<T> getTail() {
        return tail;
    }

    /**
     * Set the tail node for the linked list
     * @param tail sets the tail node
     */
    private void setTail(LinkedListNode<T> tail) {
        this.tail = tail;
    }

    /**
     * Used to determine if there is a head node and if so get the value.
     * @return returns the value of the head node
     */
    public T first(){
        if(count == 0) //if there are no nodes in the list
            return null;
        return head.getValue();
    }

    /**
     * Used to determine if there is a tail node and if so get the value.
     * @return returns the value of the tail node
     */
    public T last(){
        if(count == 0) //if there are no nodes in the list
            return null;
        return tail.getValue();
    }

    /**
     * Used to add a node to the beginning of the linked list. If this is the
     * first node added to the linked list then head and tail point to the same
     * node.
     * @param value value or element to be used for the creation of the node.
     */
    public void addFirst(T value){
        head = new LinkedListNode<T>(value, head);
        if(count == 0) //if this is the only node in the list
            tail = head; //point tail at head node
        count++; //increment node count
    }

    /**
     * Used to add a node to the end of the linked list.If this is the
     * first node added to the linked list then head and tail point to the same
     * node.
     * @param value value or element to the used for the creation of the node
     */
    public void addLast(T value){
        LinkedListNode<T> tempNode = new LinkedListNode<>(value);
        if (count == 0) //if this is the only node in the list
            head = tempNode; //make this node the head node
        else //otherwise just point tail to the new node
            tail.setNext(tempNode);
        tail = tempNode; //make the new node the tail
        count++; //increment node count

    }

    /**
     * Used to remove the first node from the linked list and return the
     * value back to the caller.
     * @return the value of the node
     */
    public T removeFirst(){
        if (count == 0) // if there are no nodes in the linked list
            return null; //return nothing
        T value = head.getValue(); //set the value of head node in a temp variable
        head = head.getNext(); //sets the head node to the next node in the list
        count--; //decrements the node count
        if (count == 0) //if there are no nodes in the linked list
            tail = null; //set the tail to null
        return value; //return the value
    }

    /**
     * Used to remove the last node from a linked list and return the value
     * back to the caller
     * @return the value of the node
     */
    public T removeLast(){
        if (count == 0) // if there are no nodes in the linked list
            return null; //return nothing
        LinkedListNode<T> current = head;
        if (count == 1){ //if there is only one node
            head = null; //set tail and head to null
            tail = null;
            return current.getValue(); //return the value of the node
        }
        T value = tail.getValue(); //hold tail value to return later
        for (int i = 1; i <= count - 1; i++){ //iterate through nodes
            current.getNext();//get the next node
            if ((count - 1) == i) //current node is the node before last
                tail = current; //set the tail to the previous node
        }
        return value; //return the tail value
    }

    /**
     * Used to search for a value and to get the position of the value
     * @param searchFor value to search for
     * @return index of node
     */
    public int search(T searchFor){
        if (count == 0) // if there are no nodes in the linked list
            return -1; //indicates empty list
        int index = 1;
        LinkedListNode<T> current = head;
        for (int i = 1; i <= count; i++){ //iterate through nodes
            if (current.getValue() == searchFor) //current node value matches search
                return index; //return index of the node
            else //otherwise
                current.getNext(); //get the next node
        }
        return -1; ////indicates node not found
    }

    /**
     * Used to delete the first node with a set value
     * @param searchFor value that is being searched for
     * @return deleted value or null if not deleted
     */
    public T delete(T searchFor){
        int location = search(searchFor);
        if (location == -1)
            return null;
        LinkedListNode<T> current = head;
        for (int i = 1; i <= location; i++){
            if (i == location - 1)
                current = current.getNext().getNext();
        }
        return searchFor;
    }

    /**
     * Method to return an iterator
     * @return iterator
     */
    public Iterator<T> iterator(){
        return this.iterator();
    }


}
