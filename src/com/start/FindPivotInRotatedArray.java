package com.start;

public class FindPivotInRotatedArray {
    static void main(String[] args){
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        boolean ans = search(arr,target);
        System.out.println(ans);
    }
     static boolean search(int[] nums, int target){
        int pivot = findPivot( nums);
        if(pivot == -1)
            return binarySearch(nums,target,0,nums.length-1);
        if(nums[pivot]==target)
            return true;
        if(target>=nums[0])
            return binarySearch(nums,target,0,pivot-1);

        return  binarySearch(nums,target,pivot+1, nums.length-1);
    }
    static int findPivot(int[] arr)
    {
        int s=0;
        int e= arr.length;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1])
                return mid;
            if(mid>s && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[mid]<=arr[s])
                e=mid-1;
            else
                s=mid+1;
        }
        return -1;
    }

    static boolean binarySearch(int[] nums , int target, int s, int e)
    {
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<nums[mid])
                e=mid-1;
            else if(target>nums[mid])
                s=mid+1;
            else
                return true;
        }
        return false;
    }
}
