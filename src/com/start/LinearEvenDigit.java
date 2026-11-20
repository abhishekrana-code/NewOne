package com.start;

public class LinearEvenDigit {
    static void main() {
        int[] arr={580,317,640,957,718,764};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums)
    {
        if(nums.length==0)
            return -1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            int n=nums[i];
            while(n!=0)
            {
                if(n%10==0&&c==0)
                    c=0;
                else
                    c++;
                n/=10;
            }
            if(c%2==0)
                count++;
        }
        return count;
    }
}
