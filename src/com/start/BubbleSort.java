package com.start;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr={1,8,1,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr)
    {
        boolean swapped;
        int length=arr.length;
        for(int i= 0;i<length; i++) {
            swapped=false;
            for (int j = 1; j < length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }
}
