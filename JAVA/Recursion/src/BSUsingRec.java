public class BSUsingRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int s = 0;
        int e = arr.length - 1;
        int ans = BS(arr , target , s , e);
        System.out.println(ans);
    }
    static int BS(int[] arr , int target , int s , int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return BS(arr , target , s , e = m - 1);
        }
        return BS(arr , target , s = m + 1 , e);
    }
}
