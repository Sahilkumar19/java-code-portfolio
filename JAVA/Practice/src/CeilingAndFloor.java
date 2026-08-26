public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,14,16,20};
        int target = 4;
        int ans = floor(arr , target);
        System.out.println(ans);
    }
    // find the index of the smallest number >= target (ceiling)
    static int ceiling(int[] arr, int target) {
        // what if target is greater than the largest number in the array
        if (target > arr[arr.length - 1]) {
            return  -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {
                start = mid + 1;

            }else {
                return  mid;
            }
        }
        return  start;
    }

    // find the index of greatest number <= target (floor)
    static int floor(int[] arr, int target) {
        // what if target is greater than the largest number in the array
        if (target > arr[arr.length - 1]) {
            return  -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            } else if (arr[mid] < target) {
                start = mid + 1;

            }else {
                return  mid;
            }
        }
        return  end;
    }
}
