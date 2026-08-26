import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        int[] ans = twoSum(arr,3);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while (l<r){
            if (arr[l]+arr[r]==target){
                return new int[] {l,r};
            }else if (arr[l]+arr[r]>target){
                r--;
            }else {
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}
