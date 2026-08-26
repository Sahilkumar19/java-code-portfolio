package Sorting;

import java.util.Arrays;


public class quicksort {
    public static void main(String[] args) {
        int[] arr={10,16,8,12,15,6,9,3,5};
//        int[] ans=bubblesort(arr,arr.length);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(59%60);

    }
    public static int[] QuickSort(int[] arr,int l,int h){
        if (l<h){
            int j=partition(arr,l,h);
            QuickSort(arr,l,j-1);
            QuickSort(arr,j+1,h);
        }
//        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static int partition(int[] arr, int l, int h) {
        int p=arr[l];
        int i=l;
        int j=h;
        while (i<j){
            while (arr[i]<=p&&i<h){
                i++;
            }
            while (arr[j]>p){
                j--;
            }if (i<j){
                swapnumbers(arr,i,j);
            }
        }swapnumbers(arr,l,j);
//        return -1;
        return j;
    }
    public static void swapnumbers(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] bubblesort(int[] arr,int num_s){
        int flag=0;
        for (int i = 0; i < num_s-1; i++) {
            for (int j = 0; j < num_s-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    swapnumbers(arr,j,j+1);
                    flag++;
                }
            }
            if (flag==0){
                return arr;
            }
        }
        return arr;
    }
}