import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ptp2 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,4};
//        int[] ans = insertionSort(arr);
//        System.out.println(Arrays.toString(ans));
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        insertionSort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            List<Integer> tempArr = new ArrayList<>();
            while (left < right){
                int total = arr[i] + arr[left] + arr[right];
                if (total == 0){
                    tempArr.add(arr[i]);
                    tempArr.add(arr[left]);
                    tempArr.add(arr[right]);
                    result.add(tempArr);
                    while (left < right && arr[left] == arr[left + 1]){
                        left ++;
                    }
                    while (left < right && arr[right] == arr[right - 1]){
                        right --;
                    }
                } else if (total < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return result;
    }
}
