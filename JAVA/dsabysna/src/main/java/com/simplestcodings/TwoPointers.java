package com.simplestcodings;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {11,15,6,8,9,10};
        boolean ans  = findPairs(arr,16);
        System.out.println(ans);

    }
    public static boolean findPairs(int[] arr, int sum){
        Arrays.sort(arr);
        int lp=0;
        int rp=arr.length-1;
        while (lp<rp){
            if (arr[lp]+arr[rp]>sum){
                rp--;
            }
            if (arr[lp]+arr[rp]<sum){
                lp++;
            }if (arr[lp]+arr[rp]==sum){
                return true;
            }
        }
        return false;
    }
}
