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
                if(flag == 0)break;
                pass++;
            }
            System.out.println("Number of passes Completed : "+pass);
            return unSortedArray;
        }
    }