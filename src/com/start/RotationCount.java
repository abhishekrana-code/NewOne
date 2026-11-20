package com.start;

import java.sql.SQLOutput;

public class RotationCount {
    static void main() {
        int[] arr={1,2,3,1,1};
        int ans=count(arr);
        System.out.println(ans);

    }
    static int count(int[] arr)
    {
        int pivot= findPivot(arr);
        if(pivot==-1)
            return 0;
        int count=pivot+1;
        return count;
    }
    static int findPivot(int[] arr)
    {
        int s=0;
        int e= arr.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1])
                return mid;
            if(mid>s && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[mid]==arr[s]&&arr[mid]==arr[e]) {
                if (s < e && arr[s] > arr[s + 1])
                    return s;
                s++;
                if (e>s && arr[e] < arr[e - 1])
                    return e - 1;
                e--;
            }
            else if (arr[s]<arr[mid] || arr[mid] == arr[s] && arr[e] < arr[mid]) {
                s = mid + 1;
            } else
                e = mid - 1;
        }
        return -1;
    }
}
