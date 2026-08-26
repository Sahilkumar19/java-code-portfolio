package com.simplestcodings;

public class min_max {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int min = findMin(arr);
        System.out.println("minimum is "+" "+min);
        int max = findMax(arr);
        System.out.println("minimum is "+" "+max);
    }
    public static int findMin(int[] arr){
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    public static int findMax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
