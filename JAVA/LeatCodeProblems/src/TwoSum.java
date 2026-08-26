import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[] arr = {2,3,4};
       int target = 6;
       int start = 0;
       int ans = Ceiling(arr , target);
       System.out.println(ans);
        System.out.println(Arrays.toString(Sum(arr, target, start, ans)));
    }
    // this will return the index of the greatest number less than the target
    static int[] Sum(int[] arr , int target , int start , int ans) {
        int[] Ans = new int[0];
        for (int i = 0; i <= ans ; i++) {
            for (int j = 1; j < ans + 1; j++) {
                if (arr[i] + arr[j] == target) {
                     Ans = new int[]{i + 1, j + 1};
                }
            }

        }
        return Ans;
    }
    static int Ceiling(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;

            }else {
                return mid;
            }
        }
        return end;
    }
}
