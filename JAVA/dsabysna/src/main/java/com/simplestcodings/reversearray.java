package com.simplestcodings;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {-4, 5, 1, 2, -4};
        int[] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] reverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[j] = arr[i];
            j++;
        }
        return reversedArray;
    }
}
