package com.start;

import java.util.Arrays;

public class FirstAndLastPosition {
    static void main(String[] args)
    {
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first,last};
    }
    static int findFirst(int[] nums, int target)
    {
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target) {
                ans = mid;
                e = mid - 1;
            }
            else if(target>nums[mid])
                s=mid+1;
            else
                e=mid-1;

        }
        return ans;
    }
    static int findLast(int[] nums, int target)
    {
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target) {
                ans = mid;
                s = mid + 1;
            }
            else if(target>nums[mid])
                s=mid+1;
            else
                e=mid-1;

        }
        return ans;
    }
}
