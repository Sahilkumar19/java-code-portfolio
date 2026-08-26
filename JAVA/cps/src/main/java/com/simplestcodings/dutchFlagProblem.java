package com.simplestcodings;

import java.util.Arrays;

public class dutchFlagProblem {
    public static void main(String[] args) {
        int[] arr = {1,2,12,9,5,3,1};
        famousDutchFlagProblem(arr,9);
    }
    public static void famousDutchFlagProblem(int[] arr, int pivot){
        int lp = 0;
        int mid = 0;
        int hp = arr.length - 1;
        while (mid<=hp){
            if (arr[mid] < pivot){
                swap(arr,lp,mid);
                lp++;
                mid++;
            }if (arr[mid] == pivot){
                mid++;
            }if (arr[mid] > pivot){
                swap(arr, hp, mid);
                hp--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int lp, int hp){
        int temp = arr[lp];
        arr[lp] = arr[hp];
        arr[hp] = temp;
    }
}
