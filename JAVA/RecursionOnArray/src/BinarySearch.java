public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,9,11,24,35};
        int target = 1;
        int s = 0;
        int e = arr.length - 1;
        int ans = BS(arr , target , s , e);
        System.out.println(ans);
    }
    static int BS(int[] arr , int target , int s , int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return BS(arr , target , s , mid - 1);
            }else {
                return BS(arr , target , mid + 1 , e);
            }
        }
        return -1;
    }
}
