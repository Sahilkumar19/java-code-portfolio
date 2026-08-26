import java.util.Arrays;

public class ptp1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6};
        int target = 6;
        int[] ans = findIndex(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findIndex(int[] nums, int target){
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            if (nums[left] + nums[right] > target){
                right = right - 1;
            } if (nums[left] + nums[right] < target) {
                left ++;
            }if(nums[left] + nums[right] == target){
                result[0] = left;
                result[1] = right;
                return result;
            }
        }
        return result;
    }
}
