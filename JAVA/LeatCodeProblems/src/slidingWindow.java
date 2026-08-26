import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;
public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
//        double ans  = maxAvgSubArray(arr, k);
//        System.out.println(ans);
//        String s = "abcabcebb";
        String s ="pwwkew";
        int ans = longestSubStrWithoutRepChar(s);
        System.out.println(ans);
    }
    public static int findMaxSubArraySum(int[] arr, int k){
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < arr.length ; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
    public static double maxAvgSubArray(int[] arr, int k){
        int maxAvg = 0;
        for (int i = 0; i < k; i++) {
            maxAvg+=arr[i];
        }
        int windowMaxAvg = maxAvg;
        for (int i = k; i < arr.length; i++) {
            windowMaxAvg += arr[i] - arr[i-k];
//            windowMaxAvg/=k;
            maxAvg=Math.max(windowMaxAvg,maxAvg);
        }
        double ans = (double) maxAvg /k;

        return ans;
    }
    public static int longestSubStrWithoutRepChar(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }
            HashSet<Character> set = new HashSet<>();
            int maxLength = 0;
            int start = 0;

            for (int end = 0; end < s.length(); end++) {
                char c = s.charAt(end);
                while (set.contains(c)) {
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(c);
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
}
