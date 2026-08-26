import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,19};
        int target = 1;
        int index = 0;
        boolean ans = LS(arr , target , index);
        System.out.println(ans);
    }
    // Linear search with recursion
    static boolean LS(int[] arr , int target , int index) {
        if (index == arr.length - 1) {
            return false;
        }
        if (arr[index] == target || LS(arr , target , index + 1)){
            return true;
        }else {
            return false;
        }
    }
    // if target is two times in the array return the index of target
    static List LS2(int arr , int target , int index , List) {
        if (index == arr.length - 1) {
            return list;
        }if (target == arr[index]) {
            list.(index);
        }
        return list;
    }
}
