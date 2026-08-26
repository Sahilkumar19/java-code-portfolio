package com.simplestcodings;
// Search in rotated sorted array
public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        //means the array is in normally in sorted order
        if (pivot == -1){
            return BS(arr, target, 0, arr.length - 1);
        }
        //means the pivot element is the target
        if (arr[pivot] == target){
            return pivot;
        }
        //if target is greater than the first element of the array means that we need to search in the ascending part of the array starting from 0th index till pivot - 1
        if (target > arr[0]){
            return BS(arr, target, 0, pivot - 1);
        }
        //we are searching in the descending part of the array
        return BS(arr, target, pivot + 1, arr.length - 1);
    }
    //normal binary search method
    public static int BS(int[] arr, int target, int s, int e) {
        while (s <= e){
            int mid = s + (e - s)/2;
            if (arr[mid] > target){
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //method to find the pivot(index) to get the ascending and descending parts of the array
    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if (mid < e && arr[mid] > arr[mid + 1]){
                return mid;
            } if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }if (arr[mid] <= arr[s] ){
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return -1;
    }
}