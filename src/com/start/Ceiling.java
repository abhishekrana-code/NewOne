package com.start;

public class Ceiling {
    static void main(String[] args)
    {
        int[] arr={7,9,11,12,14,15,16,19};
        int target = 13;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr,int t){
        int s=0;
        int e = arr.length-1;

        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(t>arr[mid])
                s=mid+1;
            else if(t<arr[mid]) {
                e=mid-1;
            }
            else
                return mid;
        }
        return s;
    }
}
