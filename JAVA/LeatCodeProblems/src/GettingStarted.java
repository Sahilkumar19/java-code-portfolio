import java.util.*;

public class GettingStarted {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
        int[] height = {1,8,6,2,5,4,8,3,7};
        int area = maxArea(height);
        System.out.println(area);
        int[] nums2 = {1,12,-5,-6,50,3};
        int k=4;
        int max = maxSum(nums2,k);
        System.out.println(max);
        String s = "abcabcbb";
        int maxlength = lengthOfLongestSubstring(s);
        System.out.println(maxlength);
        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";
        String minw = minWindow(s1,s2);
        System.out.println(minw);
    }
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while (l<r){
                List<Integer> triplet = new ArrayList<>();
                int sum = nums[i]+nums[l]+nums[r];
                if (sum>0){
                    r--;
                } else if (sum<0) {
                    l++;
                }
                else {
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    res.add(triplet);
                    l++;
                    while (nums[l]==nums[l-1] && l<=r){
                        l++;
                    }
                }
            }
        }
        return res;
    }
    public static int maxArea(int[] height){
        int l=0;
        int r=height.length-1;
        int res = 0;
        while (l<=r){
            int area = (r-l)*Math.min(height[l],height[r]);
            res = Math.max(res,area);
            if (height[l]<height[r]){
                l+=1;
            }else {
                r-=1;
            }
        }
        return res;
    }
    public static int maxSum(int[] nums, int k){
        int max = 0;
        for (int i = 0; i < k; i++) {
            max+=nums[i];
        }
        int windowMaxSum = max;
        for (int i = k; i < nums.length; i++) {
            windowMaxSum+=nums[i]-nums[i-k];
            max=Math.max(max,windowMaxSum);
        }
        return max;
    }
    public static int lengthOfLongestSubstring(String s){
        if (s==null || s.isEmpty()){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)){
                set.remove(c);
                start++;
            }
            set.add(c);
            maxLength = Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
    public static String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0, minLength = Integer.MAX_VALUE, start = 0;
        int required = targetMap.size();
        int formed = 0;
        HashMap<Character, Integer> windowMap = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }
            while (left <= right && formed == required) {
                c = s.charAt(left);
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                windowMap.put(c, windowMap.get(c) - 1);
                if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
