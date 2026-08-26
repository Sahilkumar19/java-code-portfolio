import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void qs(int[] arr, int low, int high){
        if (low<high){
            int pivot = partion(arr,low,high);
            qs(arr,low,pivot-1);
            qs(arr,pivot+1,high);
        }
    }
    public static int partion(int[] arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
