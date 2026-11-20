package com.start;

public class Swap {
    static void main() {
        int a=1;
        int b=2;
        swap(a,b);
        System.out.println("a = "+ a +"b ="+b);
    }
    static void swap(int num1,int num2)
    {
        int temp=num1;
        num1=num2;
        num2=temp;
    }
}
