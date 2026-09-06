// 239. Sliding Window Maximum
// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

// Return the max sliding window.

 

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7
// Example 2:

// Input: nums = [1], k = 1
// Output: [1]
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// 1 <= k <= nums.length


  
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int[] result=new int[nums.length-k+1];
        // for(int i=0; i<nums.length-k+1; i++){
        //     result[i]=findMax(nums, i, k+i);
        // }
        // return result;
        int n=nums.length;
        int[] arr = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            if(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=k-1){
                arr[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return arr;
    }
    // public int findMax(int[] arr, int s, int e){
    //     int max=Integer.MIN_VALUE;
    //     for(int i=s; i<e; i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }

}
