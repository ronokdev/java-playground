package datastructure.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main (String[] args){
        System.out.println("Binary Search In Action");
        /*
        * Need to Write the Iterative approach
        * Time: O(log(n))
        * Space: O(n), we are not using a recursive approach (recursive approach uses Stack and for that the space Complexity will be O(n)
        * */

        int[] sortedArray = {5,7,8,11,13,25,48,55,66,77,87,96,102,135,185,220};
        System.out.println(Arrays.toString(sortedArray));

        int indexNum = getIndexNum(sortedArray, 220,0,sortedArray.length-1);
        System.out.println("Index Number :: "+indexNum);
    }

    public static int getIndexNum(int[] sortedArray,int key,int low,int high){
        /*
        * Low High Median
        * */
        //iterative Approach
        while(low <= high){
           int median = (int) Math.floor((low+high)/2);
           if(key == sortedArray[median]){
               return median;
           }
           else if(key <= sortedArray[median]){
              high = median -1;
           }
           else if(key >= sortedArray[median]){
               low = median+1;
           }
        }
        return -1;
    }
}
