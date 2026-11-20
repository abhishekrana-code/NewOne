package com.start;

import java.util.Arrays;

public class BinaryIn2D {
    static void main() {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int t = 6;
        int[] ans= binary(arr,t);
        System.out.println(Arrays.toString(ans));

    }
    static int[] binary(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;

        int s=0;
        int e=rows*cols-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            int row=mid/cols;
            int col=mid%cols;

            if(arr[row][col]==target)
                return new int[]{row,col};
            else if (arr[row][col]<target) {
                s=mid+1;
            }
            else
                e=mid-1;
        }
        return new int[]{-1,-1};
    }
}
