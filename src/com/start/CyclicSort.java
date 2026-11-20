package com.start;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[] arr={1,3,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int i=0;
        while(i < arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
               swap(arr,i,arr[i]-1);
            else
                i++;
        }
    }
    static void swap(int[] arr, int current, int correct){
        int temp= arr[current];
        arr[current]=arr[correct];
        arr[correct]=temp;
    }
}
