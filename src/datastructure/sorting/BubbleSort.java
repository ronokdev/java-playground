package datastructure.sorting;

import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args){
            int[] unSortedArray = {55,4,3,99,121,31,22,0,2000,12347,-8};
            System.out.println("unSortedArray = " + Arrays.toString(unSortedArray)+"\n");
            int[] sortedArray = bubbleSort(unSortedArray);
            System.out.println("sortedArray = " + Arrays.toString(sortedArray));
        }

        public static int[] bubbleSort(int[] unSortedArray){
            /*
            * pass is used to calculate the number of passes it completed in order to fully sort the array.
            * */
            int pass =0;
            for(int i = 0;i<unSortedArray.length-1;){
                int flag =0;
                for(int j =i; j<unSortedArray.length-1-i; j++){
                    if(unSortedArray[j] > unSortedArray[j+1])
                    {
                        flag = 1;
                        int temp = unSortedArray[j];
                        unSortedArray[j] = unSortedArray[j+1];
                        unSortedArray[j+1] = temp;
                    }
                }
                /*
                * we are checking if the array got fully sorted .
                * If the array is fully sorted then we are Breaking from the LOOP.
                * */
                if(flag == 0)break;
                pass++;
            }
            System.out.println("Number of Element in the Array : "+unSortedArray.length);
            System.out.println("Number of passes Completed : "+pass);
            return unSortedArray;
        }
    }