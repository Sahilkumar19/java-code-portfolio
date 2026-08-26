package com.simplestcodings;
public class fibo {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println((ans)%(Math.pow(10,9)+7));
    }
    public static int fib(int n){
        if (n==1 || n==2){
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
//            return (int) (f%Math.pow(10,9)+7);
        }
    }
}
