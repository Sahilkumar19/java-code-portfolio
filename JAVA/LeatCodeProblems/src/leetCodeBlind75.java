import java.util.*;

public class leetCodeBlind75 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3};
        int target = 4;
//        int[] ans = twoSum(arr,target);
//        System.out.println(Arrays.toString(ans));

        int[] input = {7,1,5,3,6,4};
//        int maxProfit = bestTime(input);
//        System.out.println(maxProfit);

        int[] nums = {1,2,3,4};
//        boolean ans = isContainsDuplicate(nums);
//        System.out.println(ans);

        int[] nums2 = {-1,1,0,-3,3};
//        int[] prod = arraysProduct(nums2);
//        System.out.println(Arrays.toString(prod));

        int[] nums3 = {-1,-2,-3,4,-1,2,1,-5,4};
//        int res = subArray(nums3);
//        System.out.println(res);

        int[] arr4 = {-2,-3,-4};
        int maxProd=prodSubArray(arr4);
        System.out.println(maxProd);

        int[] arr5 = {4,5,6,7,0,1,2};
//        int ans = findMinimum(arr5);
//        System.out.println(ans);

        int[] arr6 = {4,5,6,7,0,1,2};
//        int ans = searchInRotatedArray(arr6,0);
//        System.out.println(ans);

//        int ans = addTwoNumbers(1,2);
//        System.out.println(ans);

//        boolean ans = validAnagram("rat","car");
//        System.out.println(ans);

//        int ans = climbStairs(5);
//        System.out.println(ans);

        int[] nums0={-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums0);
        System.out.println(ans);
    }
//    1. Two Sum
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> hm=new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            int complement = target-arr[i];
            if (hm.containsKey(complement)){
                return new int[] {i,hm.get(complement)};
            }else {
                hm.put(arr[i],i);
            }
        }
        return new int[0];
    }
//    2. best time to buy and sell stock
    public static int bestTime(int[] arr){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price:arr) {
            min=Math.min(min,price);
            int profit = price-min;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
//    3. Contains Duplicate
    public static boolean isContainsDuplicate(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int num:arr) {
            if (set.contains(num)){
                return true;
            }else {
                set.add(num);
            }
        }
        return false;
    }
//    4. Product of Array Except Self
    public static int[] arraysProduct(int[] arr){
        int[] result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod=helper(arr,i);
            result[i]=prod;
        }
        return result;
    }
    public static int helper(int[] arr, int index){
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i==index){
                continue;
            }else {
                ans=ans*arr[i];
            }
        }
        return ans;
    }
//    5. Maximum sum of SubArray (contiguous)
    public static int subArray(int[] arr){
        int max=arr[0];
        int curSum=0;
        for (int num:arr) {
            if (curSum<0){
                curSum=0;
            }
            curSum+=num;
            max=Math.max(max,curSum);
        }
        return max;
    }
//    6. maximum product of subarray
    public static int prodSubArray(int[] arr){
        int res=findMax(arr);
        int curMin=1;
        int curMax=1;
        for (int n:arr) {
            int temp=curMax*n;
            int temp2=Math.max(n*curMax,n*curMin);
            curMax=Math.max(temp2,n);
            int temp3=Math.min(temp,n*curMin);
            curMin=Math.min(temp3,n);
            res=Math.max(res,curMax);
        }
        return res;
    }
    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int num:arr) {
            if (num>max){
                max=num;
            }
        }
        return max;
    }
//    7. find minimum in rotated sorted array
    public static int findMinimum(int[] arr){
        int max=arr[0];
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            if (arr[l]<arr[r]){
                max=arr[l];
                break;
            }
            int mid=l+(r-l)/2;
            if (arr[mid]>arr[l]){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return max;
    }
//    8. Search in rotated sorted array
    public static int searchInRotatedArray(int[] arr, int target){
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (target==arr[mid]){
                return mid;
            }
//            left sorted portion
            if (arr[l]<=arr[mid]){
                if (target>arr[mid]){
                    l=mid+1;
                } else if (target<arr[l]) {
                    l=mid+1;
                }
                else {
                    r=mid-1;
                }
            }else {
                if (target<arr[l] || target>arr[r]){
                    r=mid-1;
                }else {
                    l=mid+1;
                }
            }
        }
        return -1;
    }
//    9. Add two numbers
    public static int addTwoNumbers(int n1,int n2){
        while (n2 !=0){
            int temp=(n1&n2)<<1;
            n1=n1^n2;
            n2=temp;
        }
        return n1;
    }
//    10. valid anagrams
    public static boolean validAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for (Character c:s.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 1));
        }
        for (Character c:t.toCharArray()) {
            hm2.put(c, hm2.getOrDefault(c, 1));
        }
        for (Character c:s.toCharArray()) {
            if (!Objects.equals(hm2.get(c), hm1.get(c))){
                return false;
            }
        }
        return true;
    }
//    11. container with most water
    public static int findArea(int[] arr){
        int l=0;
        int r=arr.length-1;
        int res=0;
        while (l<=r){
            int area=r-l*Math.min(arr[l],arr[r]);
            res=Math.max(res,area);
            if (arr[l]<arr[r]){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
    public static int climbStairs(int n){
        int one=1;
        int two=1;
        for (int i = 0; i < n-1; i++) {
            int temp=one;
            one=one+two;
            two=temp;
        }
        return one;
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
                ArrayList<Integer> triplets=new ArrayList<>();
                int sum=nums[i]+nums[l]+nums[r];
                if (sum>0){
                    r--;
                }else if (sum<0){
                    l++;
                }
                else {
                    triplets.add(nums[i]);
                    triplets.add(nums[l]);
                    triplets.add(nums[r]);
                    res.add(triplets);
                    l++;
                    while (nums[l]==nums[l-1]&&l<r){
                        l++;
                    }
                }
            }
        }
        return res;
    }

}
