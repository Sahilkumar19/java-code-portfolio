package com.simplestcodings;

import java.util.PriorityQueue;

//Given an array arr[] and an integer k where k is smaller than
// the size of the array, the task is to find the kth smallest
// element in the given array. It is given that all array elements are distinct.
public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
//        int N = arr.length;
        int k = 2;
        int ans  = findKtSmallest(arr,k);
        System.out.println(ans);
    }
    public static int findKtSmallest(int[] arr, int k){
//        for kth smallest use max heap
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

//        for kth largest use min heap(by default pq is a min heap)
//        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
