package com.start;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr={8,8,8,1,5,6,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr,int start, int end)
    {
        int max=start;
        for (int i=0;i<=end;i++)
        {
            if(arr[max]<arr[i])
                max=i;
        }
        return max;
    }
    static void selectionSort(int[] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            int last=arr.length-i-1;
            int max = max(arr,0,last);
            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }
}
