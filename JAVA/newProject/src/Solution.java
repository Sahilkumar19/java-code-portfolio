import java.util.PriorityQueue;
import java.util.Collections;
import java.util.*;
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(4);
        A.add(3);
        A.add(2);
        int ans = kthsmallest(A,3);
        System.out.println(ans);
    }
    public static int kthsmallest(final List<Integer> A, int B) {
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        for(int n : A){
//            maxHeap.add(n);
//            if(maxHeap.size() > B){
//                maxHeap.poll();
//            }
//        }
//        return maxHeap.peek();

        int low = findMin(A);
        int high = findMax(A);
        while (low <= high){
            int mid = low + (high - low) / 2;
            int count = countMidLessOrEqual(A, mid);
            if (count < B){
                low = mid + 1;
            }else {
                int count1 = countMidLessOrEqual(A,mid - 1);
                if (count1 < B){
                    return mid;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int findMin(List<Integer> A){
        int min = Integer.MAX_VALUE;
        for (int n : A) {
            if (n < min){
                min = n;
            }
        }
        return min;
    }
    public static int findMax(List<Integer> A){
        int max = Integer.MIN_VALUE;
        for (int n : A) {
            if (n > max){
                max = n;
            }
        }
        return max;
    }
    public static int countMidLessOrEqual(List<Integer> A, int mid){
        int count = 0;
        for (int n : A) {
            if (n <= mid){
                count++;
            }
        }
        return count;
    }
}
