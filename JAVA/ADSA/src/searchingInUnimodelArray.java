import java.util.Arrays;
import java.util.Scanner;
public class searchingInUnimodelArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {12,14, 27, 33, 26, 17, 12, 7};
        System.out.println("array is:"+" "+ Arrays.toString(array));
        System.out.print("enter target to find: ");
        int target = in.nextInt();
        System.out.println(impSearchinInUnimodelArray(array,target));
    }

    public static int impSearchinInUnimodelArray(int[] array, int target) {
        int peek = findPeak(array);
        int isAns = orderAgnosticBinarySearch(array,target,0,peek);
        if (isAns != -1){
            return isAns;
        }
        int descendingResult = orderAgnosticBinarySearch(array, target, peek + 1, array.length - 1);
        return descendingResult;
    }

    private static int orderAgnosticBinarySearch(int[] array, int target, int start, int end) {
        boolean isAsc = array[start]<array[end];
        while (start<end){
            int mid = start+(end-start)/2;
            if (array[mid]==target){
                return mid;
            }
            if (isAsc){
                if (array[mid]>target){
                    end=mid-1;
                } else if (array[mid]<target) {
                    start=mid+1;
                }else {
                    return mid;
                }
            }else {
                if (array[mid]>target){
                    start=mid+1;
                } else if (array[mid]<target) {
                    end=mid-1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static int findPeak(int[] array) {
        int s = 0;
        int e = array.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < e && array[mid] > array[mid + 1]) {
                return mid;
            } else if (mid > s && array[mid - 1] > array[mid]) {
                return mid - 1;
            }

            if (array[s] > array[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1; // This should not be reached in a valid unimodal array
    }

}
