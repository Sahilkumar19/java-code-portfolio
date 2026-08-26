import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
public class FindFirstAndLastInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] result=fisrtAndLast(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        ans[0] = search(nums , target , true);
        ans[1] = search(nums, target , false);
        return ans;
    }
    public static int search(int[] nums, int target, boolean IsStarting) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
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
    public static int[] fisrtAndLast(int[] arr, int target){
        int[] ans = {0,0};
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }else {
                if (arr[mid+1]==target){
                    return new int[]{mid,mid+1};
//                    ans[0]=mid;
//                    ans[1]=mid+1;
                }else {
//                    ans[0]=mid-1;
//                    ans[1]=mid;
                    return new int[] {mid-1,mid};
                }
            }
        }
        return ans;
    }
}
