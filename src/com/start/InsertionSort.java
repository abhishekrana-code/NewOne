package com.start;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr={7,8,5,6,7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if (arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    static void swap(int[] arr, int j, int before){
        int temp= arr[j];
        arr[j]=arr[before];
        arr[before]=temp;
    }
}
