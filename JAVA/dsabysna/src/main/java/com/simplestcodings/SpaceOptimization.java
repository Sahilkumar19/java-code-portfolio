package com.simplestcodings;
//Given two numbers say a and b, mark the multiples of 2 and 5
// between a and b using less than O(|b – a|) space and output
// each of the multiples.
public class SpaceOptimization {
    public static void main(String[] args) {
        multiplesOf2And5(2,10);
    }
    public static void multiplesOf2And5(int a, int b){
        int size = Math.abs(b - a) + 1;
        int[] arr = new int[size];
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 5 == 0){
                arr[i - a] = 1;
            }
        }
        for (int i = a; i <= b; i++) {
            if (arr[i - a] == 1){
                System.out.print(i + " ");
            }
        }
    }
}
