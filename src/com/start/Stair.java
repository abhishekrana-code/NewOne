package com.start;

//O(m+n)
import java.util.Arrays;

public class Stair {
    static void main() {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int t = 12;
        int[] ans= stairCase(arr,t);
        System.out.println(Arrays.toString(ans));

    }
    static int[] stairCase(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target)
                return new int[]{r, c};
            else if (arr[r][c] < target)
                r++;
            else
                c--;
        }

        return new int[]{-1, -1};

    }
}

