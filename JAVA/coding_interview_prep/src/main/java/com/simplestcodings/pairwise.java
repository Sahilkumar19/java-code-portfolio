package com.simplestcodings;

public class pairwise {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 1};
        int n = 100;
        int ans = pairWiseIndices(arr,n);
        System.out.println(ans);
    }
    public static int pairWiseIndices(int[] arr, int n){
        if (arr.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    sum += i + j;
                }
            }
        }
        return sum;
    }
}
