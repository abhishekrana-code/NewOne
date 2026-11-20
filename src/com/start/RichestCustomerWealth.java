package com.start;

public class RichestCustomerWealth {
    static void main() {
        int[][] accounts ={{1,5},{7,3},{3,5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i[] : accounts)
        {
            int sum=0;
            for(int n : i)
            {
                sum+=n;
            }
            if(sum>=max)
                max=sum;
        }
        return max;
    }
}
