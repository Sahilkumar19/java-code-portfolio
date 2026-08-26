package com.simplestcodings;
//3 Sum
import java.util.ArrayList;
import java.util.List;

public class S3sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
//        System.out.println(ThreeSum(arr));
        int n=3;
        System.out.println(n^1);
    }
    public static List<List<Integer>> ThreeSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> trip = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0){
                        trip.add(arr[i]);
                        trip.add(arr[j]);
                        trip.add(arr[k]);
                    }
                    result.add(trip);
                }
            }
        }
        return result;
    }
}
