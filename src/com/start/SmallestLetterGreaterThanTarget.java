package com.start;

public class SmallestLetterGreaterThanTarget {
    static void main() {
        char[] letters = {'e','e','e','n'};
        char target = 'x';
        char ans = nextGreatestLetter( letters, target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
        int s=0;
        int e=letters.length-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(target>=letters[mid])
                s=mid+1;
            else
                e=mid-1;
        }
        return letters[s % letters.length];
    }
}
