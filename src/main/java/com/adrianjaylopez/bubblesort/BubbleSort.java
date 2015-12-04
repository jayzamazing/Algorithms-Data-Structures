package com.adrianjaylopez.bubblesort;

import java.util.Arrays;

/**
 * This class is for the bubble sort algorithm. O(n^2)
 * @author Adrian J Lopez
 * @since <pre>6/18/15</pre>
 * @version 2.0
 */
public class BubbleSort<T extends Comparable<? super T>>{
    /**
     * Method to do bubble sort on a generic array of values
     * @param values generic array to be sorted
     */
    public void bubbleSort(T[] values){

        boolean notSorted = true;//variable to determine if sorted

        while (notSorted){//repeat until sorted
            notSorted = false;//breaks loop if nothing left to sort

            for (int i = 0; i < values.length - 1; i++){//iterate over array
                if (values[i].compareTo(values[i + 1]) > 0){//if values are not in order
                    T temp = values[i];//store current value in variable
                    values[i] = values[i + 1];//set current variable to next value
                    values[i + 1] = temp;//set next variable to current
                    notSorted = true;//keep looping
                }
            }

        }
    }

    /**
     * This is basically does the sorting but just using a method reference
     * from Java 8.
     * @param values generic array to be sorted
     */
    public void bubbleSort2(T[] values){
        Arrays.sort(values,T::compareTo);
    }
}
