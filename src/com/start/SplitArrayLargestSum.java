package com.start;

public class SplitArrayLargestSum {
    static void main() {

    }
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int n:nums)
        {
            start=Math.max(start,n);
            end+=n;
        }

        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int n:nums){
                if(sum+n>mid){
                    sum=n;
                    pieces++;
                }
                else
                    sum+=n;
            }
            if(pieces>k)
                start=mid+1;
            else
                end=mid;

        }
        return end;
    }
}
