package com.simplestcodings;

public class bitManipulation {
    public static void main(String[] args) {
        int x = -93242;
        int count = 40;
        int ans1 = repeatedArithmeticShift(x, count);
//        System.out.println(ans1);
        int ans2 = repeatedLogicalShift(x, count);
//        System.out.println(ans2);
        int num = 4;
        int i = 3;
        boolean ans = setBit(i,num);
        System.out.println(ans);
    }
    public static  int repeatedArithmeticShift(int x, int count){
        for (int i = 0; i < count; i++) {
            x >>= 1; // Arithmetic shift by 1
        }
        return x;
    }
    public static int repeatedLogicalShift(int x, int count){
        for (int i = 0; i < count; i++) {
            x >>>= 1; // Logical shift by 1
        }
        return 1;
    }
    public static boolean setBit(int i, int num){
        return ((num & (1 << i)) != 0);
    }
}
