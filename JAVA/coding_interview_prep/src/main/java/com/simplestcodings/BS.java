package com.simplestcodings;

import java.util.ArrayList;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int t = 7;
        boolean ans  = BinarySearch(arr,t);
        System.out.println(ans);
    }
    public static boolean BinarySearch(int[] arr, int target){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e - s)/2;
            arrayList.add(mid);
            if (arr[mid] > target){
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }else {
                System.out.println(arrayList);
                return true;
            }
        }
        return false;
    }
    public static int binarySearch(int[] arr, int t){
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if (arr[mid] > t){
                e = mid - 1;
            } else if (arr[mid] < t) {
                s = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

