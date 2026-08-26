package com.simplestcodings;
import java.util.ArrayList;
import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,7,-9};
        int[] ans = insertion_sort(arr);
        System.out.println(Arrays.toString(ans));
//        int n=arr.length;
//        int[] ans=sort(arr,0,n-1);
//        System.out.println(Arrays.toString(ans));
    }
    //  bubble sort arrange n elements of array by placing the biggest element on proper position.
    public static int[] bubble_sort(int[] arr){
        for (int i = arr.length; i>0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    // selection sort arrange n elements of array by placing the smallest item at its correct position.
    public static int[] selection_sort(int[] arr){
//        int min = find_minimum(arr);
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[0];
            int loc = i+1;
            for (int j = i+1; j < arr.length; j++) {
                if (min>arr[j]){
                    min=arr[j];
                    loc=j;
                }
            }
            if (arr[loc]<arr[i]){
                int temp=arr[loc];
                arr[loc]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    public static int[] insertion_sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j <= 1; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static int partition(int[] arr, int low, int high){
        int pivat=arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<=pivat){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static int[] sort(int[] arr, int low, int high){
        if (low<high){
            int pi=partition(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
        return arr;
    }

}
