package com.start;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MountainArray {
    static void main(String[] args)
    {
        int[] arr={1,2,3,2,1};
        int target=2;
        int ans = findInMountainArray(arr,target);
        System.out.println(ans);


    }
    static int findInMountainArray(int[] mountainArr,int target)
    {
        int peak=findPeakElement(mountainArr);
        int asdStart=0;
        int desEnd= mountainArr.length-1;

        int ansAsd=searchInAsd(mountainArr,target,asdStart,peak);
        int ansDsd=searchInDes(mountainArr,target,peak,desEnd);

        return Math.min(ansAsd,ansDsd);
    }
     static int findPeakElement(int[] arr)
    {
        int s=0;
        int e = arr.length-1;
        while (s<e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
                e=mid;
            else
                s=mid+1;
        }
        return s;
    }
    static int searchInAsd(int[] arr,int target,int s, int l)
    {
        while (s<l)
        {
            int mid=s+(l-s)/2;
            if(target>arr[mid])
                s=mid+1;
            else if(target<arr[mid])
                l=mid-1;
            else
                return mid;
        }
        return -1;
    }
    static int searchInDes(int[] arr,int target,int s, int l)
    {
        while (s<l)
        {
            int mid=s+(l-s)/2;
            if(target<arr[mid])
                s=mid+1;
            else if(target>arr[mid])
                l=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
