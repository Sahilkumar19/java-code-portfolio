
package Searching;

public class SeachingImplementation{
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    method for binary search algorithm that will return the index of the target if found or -1
//    method implemented in such a way that it handles both type of array(you can give ascending array or descending array)
    public static int OrderAgnosticBS(int[] arr, int target){
        boolean IsAsc=CheckArr(arr);
        int s=0;
        int e=arr.length;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (IsAsc){
                if (arr[mid]>target){
                    e=mid-1;
                } else if (arr[mid]<target) {
                    s=mid+1;
                }else {
                    return mid;
                }
            }else {
                if (arr[mid]>target){
                    s=mid+1;
                } else if (arr[mid]<target) {
                    e=mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//   helper method to check whether an array is in ascending order or not
    public static boolean CheckArr(int[] arr) {
        return arr[0]<arr[arr.length-1];
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
//    method for linear search algorithm
    public static int LinearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
