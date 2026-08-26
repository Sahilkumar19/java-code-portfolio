package com.simplestcodings;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    return true;
//                }
//            }
//        }
        HashSet<Integer> hs = new HashSet<>();
        for (int num:arr) {
            if (hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}
