package com.simplestcodings;
//Find if there is a pair with a given sum in the rotated sorted Array
public class PairSumInRotatedArray {
    public static void main(String[] args) {
        int[] arr={11, 15, 6, 8, 9, 10};
        boolean ans = IsPairFound(arr,35);
        System.out.println(ans);
    }
    public static boolean IsPairFound(int[] arr,int sum){
        int maxIndx=FindMaxIndx(arr);
        int rp=maxIndx;
        int lp=maxIndx+1;
        while (lp!=rp){
            if (arr[lp]+arr[rp]>sum){
                rp=(arr.length+rp-1)%arr.length;

            }if (arr[lp]+arr[rp]<sum){
                lp=(lp+1)%arr.length;

            }if (arr[lp]+arr[rp]==sum){
                return true;
            }
        }
        return false;
    }
    public static int FindMaxIndx(int[] arr){
        int maxIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
