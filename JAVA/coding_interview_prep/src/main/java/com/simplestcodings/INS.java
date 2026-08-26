package com.simplestcodings;

import java.util.Arrays;

public class INS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 33, 2, 8};
        int[] ans = insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j <= 1; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
