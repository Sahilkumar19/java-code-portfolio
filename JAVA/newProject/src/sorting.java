import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4};

        selectionSort(arr,arr.length);
//        bubbleSort(arr,arr.length);
//        insertionSort(arr,arr.length);
//        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
//    1. in selection sort find the smallest element and swap it with the current element. its time complexity is O(n^2) in best, worst and average case
//  {4,3,6,12,5,6} ==> {3,4,6,12,5,6} ==> {3,4,6,12,5,6} ==> {3,4,5,12,6,6} ==> {3,4,5,6,12,6} ==> {3,4,5,6,6,12}
    public static void selectionSort(int[] arr, int n){
        for (int i = 0; i <= n-2 ; i++) {
            int mini = i;
            for (int j = i; j <= n-1; j++) {
                if (arr[j]<arr[mini]){
                    mini=j;
                }
            }
            swap(arr,mini,i);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
//    2. in bubble sort we push the greatest element to the last by doing adjacent swapping.
//    its worst and average case time complexity is O(n^2) and best case time complexity is O(n)
//    as we can check for the case of the sorted array if there is any swap in the first pass or
//    not if there is no swap we simply break out of the loop.
//    {4,3,6,12,5,6}
    public static void bubbleSort(int[] arr, int n){
        for (int i = n-1; i > 1; i--) {
            int didSwap=0;
            for (int j = 0; j <= i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1);
                    didSwap++;
                }
            }
            if (didSwap==0){
                break;
            }
        }
    }
//    3. in insertion sort we pick an element and put it into its correct position.
//    the time complexity in average and worst case for this is O(n^2). and the best case complexity in O(n).

//    {4,3,6,12,5,6}
    public static void insertionSort(int[] arr, int n){
        for (int i = 0; i <= n-1 ; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int mid = (low + high)/2;
        mergeSort(arr,low, mid);
        mergeSort(arr, mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        while (left<=mid && right <= high){
            if (arr[left]<=arr[right]){
                temp[left]=arr[left];
                left++;
            }else {
                temp[right]=arr[right];
                right++;
            }
        }
        while (left<=mid){
            temp[left]=arr[left];
            left++;
        }
        while (right<=high){
            temp[right]=arr[right];
            right++;
        }
        for (int i = low; i < high; i++) {
            arr[i]=temp[i-low];
        }
    }
}
