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
