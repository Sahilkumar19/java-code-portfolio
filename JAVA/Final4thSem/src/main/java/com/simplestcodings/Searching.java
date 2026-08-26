package com.simplestcodings;

public class Searching {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,9};
        int target=9;
        int s=0;
        int e=arr.length-1;
//        int ansbs=bs(arr,target);
//        System.out.println(ansbs);
        int ansbsr=bsrecursive(arr,target,s,e);
        System.out.println(ansbsr);

    }
    public static int ls(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int bs(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int bsrecursive(int[] arr,int target, int s, int e){
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                return bsrecursive(arr,target,s,mid-1);
            } else if (arr[mid]<target) {
                return bsrecursive(arr,target,mid+1,e);
            }else {
                return mid;
            }
        }
        return -1;
    }
}
