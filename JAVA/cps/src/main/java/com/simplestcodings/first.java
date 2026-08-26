package com.simplestcodings;

public class first {
    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        printArrayBackward(input);
    }
    public static void printArrayBackward(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+","+" ");
        }
    }
}
