package Sorting;
import java.util.Arrays;

public class SortingAlgosImplementation {
    public static void main(String[] args) {
        int[] arr = {7,3,9,1,4,6,8};
        int[] ans = InsertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    bubble sort algorithm (highest element ko lsat me bhejte h inner loop ki har iteration k baad)
public static int[] BubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                Swap(arr, j, j + 1);
            }
        }
    }
    return arr;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------
//    insertion sort algorithm
    public static int[] InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                Swap(arr,j,j+1);
                j=j-1;
            }
        }
        return arr;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    helper method that is used for swapping the two elements of an array
    public static void Swap(int[] arr, int j, int i) {
        int var=arr[j];
        arr[j]=arr[i];
        arr[i]=var;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    selection sort algorithm

    public static int[] SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int min_indx=findMinimum(arr,i);
            if (arr[min_indx]<temp){
                Swap(arr,i,min_indx);
            }
        }
        return arr;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    helper method for the selection sort
    public static int findMinimum(int[] arr, int i) {
        int min=i;
        for (int j = i; j < arr.length; j++) {
            if (arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    quick sort algorithm

    public static int[] QuickSort(int[] arr, int s, int e) {
        if (s >= e) {
            return arr;
        }
        int partIndx = partition(arr, s, e);
        QuickSort(arr, s, partIndx - 1);
        QuickSort(arr, partIndx + 1, e);
        return arr;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    partition function of quick sort
    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                Swap(arr, i, j);
            }
        }
        Swap(arr, i + 1, e);
        return i + 1;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    merge sort algorithm
    public static int[] MergeSort(int[] arr, int low, int high){
        int mid;
        if (low<high){
            mid=(low+high)/2;
            int[] left= MergeSort(arr,low,mid);
            int[] right=MergeSort(arr,mid+1,high);
            return merge(left,right);
        }
        return new int[]{arr[low]};
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------
//    helper method for merge sort to merge the two chunks of sorted array
    public static int[] merge(int[] left, int[] right) {
        int result[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    method to print the elements of sorted array in merge sort
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}


