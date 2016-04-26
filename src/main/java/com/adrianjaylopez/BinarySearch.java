package com.adrianjaylopez;

/**
 * This is the binary search class which tries to half searching for an item
 * in a hay stack each time.
 * O(log2 N)
 * @author Adrian J Lopez
 * @version 1.0
 * @since <pre>4/22/16</pre>
 */

public class BinarySearch {
    /**
     * This is a recursive binary search tree
     * @param array of elements to search through
     * @param element to find
     * @param low starting point
     * @param high end point
     * @return index or -1 if element could not be found
     */
    int binSearch(int[] array, int element, int low, int high){
        int middle = low + ((high - low) / 2);//takes care of element not present and overflow issues
        if (array.length > 0 && array[middle] == element)//if array has elements and middle element is element
            return middle;//return index
        if (low >= high)
            return -1;;//return -1 showing element could not be found
        if (array[middle] > element)//middle element is greater than element
            return binSearch(array, element, low, middle - 1);//recursive call using middle element - 1 as high element
        return binSearch(array, element, middle + 1, high);//recursive call using middle element + 1 as low element
    }
    /**
     * This is the iterative binary search.
     * @param array of integers to search
     * @param element interger to search for
     * @return index of element or -1 if it could not be found
     */
    int binSearch2(int[] array, int element){
        int low = 0, high = array.length - 1;//declare and initialize
        while (low <= high){//continue to loop until low gets to high
            int middle = low + ((high - low) / 2);//takes care of element not present and overflow issues
            if (element < array[middle])//if the middle element is larger than the element
                high = middle - 1;//set high to one before middle element
            else if (element > array[middle])//if element is larger than middle element
                low = middle + 1;//set low to one higher than the middle element
            else//otherwise
                return middle;//return the position of the element
        }
        return -1;//return -1 showing element could not be found
    }

}
