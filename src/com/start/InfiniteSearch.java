package com.start;

public class InfiniteSearch {
    static void main() {
        int[] arr={1,8,9,77,777,7777,8888,99999,666666};
        int target=99999;
        int ans= findRange(arr,target);
        System.out.println(ans);

    }
    static int findRange(int[] arr,int target)
    {
        int s=0;
        int e=1;

        while(e < arr.length && target>arr[e])
        {
            int newS=e+1;
            e= e+(e-s+1)*2;
            s=newS;
        }
        e = Math.min(e, arr.length - 1);
        return search(arr,target,s,e);
    }
    static int search(int[] arr,int target, int s,int e){
        while(s<=e)
        {
            int mid=(s+(e-s)/2);
            if(target>arr[mid])
                s=mid+1;
            else if (target<arr[mid]) {
                e=mid-1;
            }
            else
                return mid;

        }
        return -1;
    }
}
