import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] arr) {
        //1. by sorting the array
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==arr[i+1]){
//                return true;
//            }
//        }
//        return false;
        // 2. using hashset
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
