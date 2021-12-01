package datastructure.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] unSortedArray = {55,4,3,99,121,31,22,0,2000,12347,-8,-99};
        int[] ints = doInsertionSort(unSortedArray);
        System.out.println("Sorted Array : "+Arrays.toString(ints));
    }

    private static int[] doInsertionSort(int[] unSortedArray) {

        int numberOfPass =0;
        for(int i=1;i<unSortedArray.length;i++){
            numberOfPass++;
            int x = unSortedArray[i];
            int j = i-1;

            while (j>=0 && unSortedArray[j] > x){
                unSortedArray[j+1] = unSortedArray[j];
                j--;
            }
            unSortedArray[j+1] = x;
            System.out.println("pass :"+numberOfPass);
            System.out.println("current Array : "+Arrays.toString(unSortedArray));
        }
        System.out.println("Number of Pass "+numberOfPass);
        return unSortedArray;
    }
}
