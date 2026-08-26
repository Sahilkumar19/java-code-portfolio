package com.simplestcodings;

import java.util.Arrays;

public class BBS {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,345,123,43,32,5643,63,123,43,2,55,1,234,92};
        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(arr.length);
        System.out.println(ans.length);
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = arr.length; i >0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
