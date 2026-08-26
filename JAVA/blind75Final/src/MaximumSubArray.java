public class MaximumSubArray {
    public static void main(String[] args) {

    }
    public static int maxSubArray(int[] arr){
        int max = arr[0];
        int curSum = 0;
        for (int num : arr) {
            if (num<0){
                curSum=0;
            }
            curSum+=num;
            max=Math.max(max,curSum);
        }
        return max;
    }
}
