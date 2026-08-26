public class CheckingSorted {
    public static void main(String[] args) {
        int[] arr = {1,12,3,4,5,6,7,8};
        int index = 0;
        boolean ans = isSorted(arr , index);
        System.out.println(ans);
    }
    // we are checking if the array is sorted or not using recursion
    static boolean isSorted(int[] arr , int index) {
        if (index == arr.length - 1) {
            return true;
        }else {
            return arr[index] < arr[index + 1] && isSorted(arr , index + 1);
        }
    }
}
