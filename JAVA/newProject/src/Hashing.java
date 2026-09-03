// simple example of a hash function = i%l (where i is the input number and l is the size of the storage table/map). 
// it gives us the slot of the input in the storage table/map. 
// the inserion in hashmap is O(1) in all cases..even if in worst cases if collison happens we can keep/memorize 
// the address of the head and tail(in case we are using the linkedlist for chaining).
// seach can be O(n) in worst case and the amortized complexity of the search in worst case is O(1) given that we have a robust hash function.


// some questions based on hashmap and prefix sum. All questions are cpoied from the leetcode.

// 1. two sum
// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

 
// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

class TwoSum{
  public int[] twoSum(int[] nums, int target){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      if(map.containsKey(target-nums[i]){
        return new int[] {i, map.get(target-nums[i])};
      }else{
        map.put(nums[i],i);
      }
    }
  }
}



// 2. subarrays sum equals to k. problem no. 560

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

 
// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2
 

// Constraints:

// 1 <= nums.length <= 2 * 104
// -1000 <= nums[i] <= 1000
// -107 <= k <= 107

public int subArraySum(int[] nums, int k){
 HashMap<Integer, Integer> map = new HashMap<>();
 map.put(0,1);
 int currentSum=0;
 int totalSubArray=0;
 for(int i=0; i<nums.length; i++){
  currentSum+=nums[i];
  if(map.containsKey(currentSum-k){
   totalSubArray+=map.get(currentSum-k);
  }
   map.put(currentSum, map.getOrDefault(currentSum,0)+1);
 }
 return totalSubArray;
}


// 3. contiguous array problem no. 525.

// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 
// Example 1:

// Input: nums = [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
// Example 2:

// Input: nums = [0,1,0]
// Output: 2
// Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
// Example 3:

// Input: nums = [0,1,1,1,1,1,0,0,0]
// Output: 6
// Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
 

// Constraints:

// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.

public int findMaxLength(int[] nums){
 for(int i=0; i<nums.length; i++){
  if(nums[i]==0){
   nums[i]=-1;
  }
 }
 HashMap<Integer, Integer> map=new HashMap<>();
 int maxLength=0;
 int currentSum=0;
 for(int i=0; i<nums.length; i++){
  currentSum+=nums[i];
  if(currentSum==0){
   maxLength=i+1;
  }else if(map.containsKey(currentSum)){
   maxLength=Math.max(maxLength,i-map.get(currentSum));
  }else{
   map.put(currentSum,i);
  }
 }
 return maxLength;
}

// NOTE: this solution will work(with some tweaking in this sol) in variety of such problem like 
// ~ max subarray sum equals to zero
// ~ max subarray sum equal to k
// and also not just for the binary arrays 
