package com.simplestcodings;
//kadane's algorithm is a dynamic programming approach used to solve the maximum sub array problem,
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
    public static int max(int n1, int n2){
        if (n1 > n2){
            return n1;
        }
        return n2;
    }
    public static int maxSubArray(int[] arr){
        int max_so_for = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 1; i < arr.length; i++) {
            max_ending_here = max(arr[i], max_ending_here + arr[i]);
            max_so_for = max(max_so_for, max_ending_here);
        }
        return max_so_for;
    }
}
