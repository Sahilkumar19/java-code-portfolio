package com.simplestcodings;
//https://leetcode.com/problems/next-permutation/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nextpermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findPermutation(arr));
    }
    public static List<List<Integer>> findPermutation(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, result);
        return result;
    }
    public static void backtrack(int[] arr, int start, List<List<Integer>> result){
        if (start == arr.length){
            List<Integer> permutation = new ArrayList<>();
            for (int num:arr) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            backtrack(arr, start + 1, result);
            swap(arr, start, i); // backtrack
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//
//public class Permutations {
//    public static void main(String[] args) {
//        int[] array = {3, 2, 1};
//        List<List<Integer>> result = permute(array);
//
//        for (List<Integer> permutation : result) {
//            System.out.println(permutation);
//        }
//    }
//
//    public static List<List<Integer>> permute(int[] nums) {
//        Arrays.sort(nums); // Sort the array to ensure permutations are generated in lexicographic order
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(nums, 0, result);
//        return result;
//    }
//
//    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
//        if (start == nums.length) {
//            List<Integer> permutation = new ArrayList<>();
//            for (int num : nums) {
//                permutation.add(num);
//            }
//            result.add(permutation);
//            return;
//        }
//
//        for (int i = start; i < nums.length; i++) {
//            swap(nums, start, i);
//            backtrack(nums, start + 1, result);
//            swap(nums, start, i); // backtrack
//        }
//    }
//
//    private static void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//}
