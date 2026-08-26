import java.util.Arrays;

public class StartAndEndIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,7,7,9};
        int target = 7;
        int[] ans = Mainfunc(arr , target);
        System.out.println(Arrays.toString(Mainfunc(arr, target)));
    }
    // return the start and end index of the in the array
    // if target is not found returns {-1 , -1}
    static int[] Mainfunc(int[] arr , int target) {
        int[] ans = {-1 , -1};
        ans[0] = search(arr , target , true);
        ans[1] = search(arr , target , false);
        return ans;
    }
    static int search(int[] arr , int target , boolean IsStarting) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                // possible ans found
                ans = mid;
                if (IsStarting) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
