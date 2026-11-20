package com.start;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate
{
    static void main() {
        int[] arr={4,3,2,7,8,2,3,1};//0-n
        List<Integer> ans = findDuplicate(arr);
        System.out.println(ans);

    }
    public static List<Integer> findDuplicate(int[] nums)
    {
        int i=0;
        List<Integer> list = new ArrayList<>();
        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find duplicates
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }
        return list;
    }
    public static void swap(int[] arr, int current,int correct){
        int temp=arr[current];
        arr[current]=arr[correct];
        arr[correct]=temp;
    }
}


