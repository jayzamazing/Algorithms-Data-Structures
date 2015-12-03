package com.adrianjaylopez.unionfind;

/**
 * This is the union root class that is used to solve dynamic connectivity problem.
 * Using weighted quick-union with path compression.
 * @author Adrian J Lopez
 * @since <pre>11/28/15</pre>
 * @version 1.1
 */
public class UF {
    //declarations
    private int[] parent;
    private byte[] rank;
    private int count;

    /**
     * constructor to initialize array of objects and point each object
     * at itself
     * @param items amount of objects to initialize
     * @throws IllegalArgumentException
     */

    public UF(int items){
        if (items < 0)
            throw new IllegalArgumentException("Please enter a number that is >= 0");
        count = items;
        parent = new int[items];//initialize array to amount of items
        count = items;//store items in class
        rank = new byte[items];
        for (int i = 0; i < items; i++){
            parent[i] = i;//set each object to point at itself
            rank[i] = 0;//set each object to 0 because there are no sub trees
        }
    }

    /**
     * Joins a set of points together with a different set.
     * @param point1 original set of points
     * @param point2 set of points to join with
     * @throws
     */
    public void union(int point1, int point2){
        int root1 = root(point1);
        int root2 = root(point2);
        if (root1 == root2) return;

        //
        if (rank[root1] < rank[root2])
            parent[root1] = root2;
        else if (rank[root1] > rank[root2])
            parent[root2] = root1;
        else{
            parent[root2] = root1;
            rank[root1]++;
        }
        count--;
    }

    /**
     * Method to see if two points are connected, if each points roots are the same then this it true.
     * @param point1
     * @param point2
     * @return true if connected, false otherwise
     * @throws IndexOutOfBoundsException
     */
    public boolean connected(int point1, int point2){return root(point1) == root(point2);}

    /**
     * Returns the root for a given point and also uses path compression to flatten the tree.
     * @param point
     * @return root of point
     * @throws IndexOutOfBoundsException
     */
    public int root(int point){
        validate(point);//validate the number is valid
        while (point != parent[point])//loop until at root node
            parent[point] = parent[parent[point]];//path compression to flatten the tree, points to grandparent
            point = parent[point];//set point to grandparent, now parent
        return point;//root
    }

    /**
     * Ensure that the given point is valid
     * @param point to validate
     * @throws IndexOutOfBoundsException
     */
    private void validate(int point){
        if (point < 0 || point >= count)
            throw new IndexOutOfBoundsException("Not a valid number");

    }

    /**
     * Returns the number of points.
     * @return number of points.
     */
    public int count(){ return count; }
}
