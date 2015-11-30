package com.adrianjaylopez.unionfind;

/**
 * This is the union find class that is used to solve dynamic connectivity problem.
 *
 * Created by Jay on 11/28/15.
 */
public class UF {
    //declarations
    private int[] id;

    /**
     * constructor to initialize array of objects and point each object
     * at itself
     * @param items amount of objects to initialize
     */
    public UF(int items){
        id = new int[items];//initialize array to amount of items
        for (int i = 0; i < items; i++){
            id[i] = i;//set each object to point at itself
        }
    }

    /**
     * Joins a set of points together with a different set.
     * @param point1 original set of points
     * @param point2 set of points to join with
     */
    public void union(int point1, int point2){
        int p1 = id[point1], p2 = id[point2];//temp variables, p1 orgin, p2 destination

        for (int i = 0; i < id.length; i++){//iterate over entire array
            if (id[i] == p1)//if object equals p1
                id[i] = p2;//change to equal p1
        }
    }

    /**
     * Method to see if two points are connected
     * @param point1
     * @param point2
     * @return true if connected, false otherwise
     */
    public boolean connected(int point1, int point2){return id[point1] == id[point2];}

    public int find(int point){ return 0;}

    public int count(){ return 0; }
}
