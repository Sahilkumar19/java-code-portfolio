public class IndexInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19,20};
        int target = 20;
//        int ans = InfiniteArray(arr , target);
        System.out.println(InfiniteArray(arr , target));

    }
    static int InfiniteArray(int[] arr , int target) {
        // find the range in which your target could be found
        // we are not going to use the arr.length because it
        // is given that the array is of infinite length
        // first we are starting with box of size 2
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
            int NewStart = end + 1;
            // we are here doubling the size of box
            end = end + (end - start + 1) * 2;
            start = NewStart;
        }
        return BinarySearch(arr , target , start , end);
    }
    // now we have start and end (where in between them our target is there)
    // so will apply normal binary search over there
    static int BinarySearch(int[] arr , int target , int start , int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
