public class CeilingFloorBinary {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(arr , target);
        System.out.println(ans);
    }
    // return the index of smallest number >= target
    static int Ceiling(int arr[] , int target) {
        int start = 0;
        int end = arr.length;
        // what if target is the greatest number
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;

    }
    // return the index of greatest number <= target
    static int floor(int arr[] , int target) {
        int start = 0;
        int end = arr.length;
        // what if target is the least number
        if (target < arr[0]) {
            return  -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end;

    }

}

