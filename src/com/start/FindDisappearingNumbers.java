package com.start;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearingNumbers {
    static void main() {
        int[] arr={4,3,2,7,8,2,3,1};//0-n
        List<Integer> ans = findDisappearingNumbers(arr);
        System.out.println(ans);

    }
    static List<Integer> findDisappearingNumbers(int[] nums)
    {
        int i=0;
        while (i < nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i] <= nums.length && nums[i]!=nums[correct])
                swap(nums,i,correct);
            else
                i++;
        }

        List<Integer> l =new ArrayList<>();

        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1) {
                l.add(index+1);
            }
        }

        return l;
    }
    static void swap(int[] arr, int current,int correct){
        int temp=arr[current];
        arr[current]=arr[correct];
        arr[correct]=temp;
    }
}
