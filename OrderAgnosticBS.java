public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {98,87,76,65,54,43,32,21};
        int key = 32;
        int ans = OrderAgnosticBS(arr , key);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int arr[] , int key) {
        int s = 0;
        int e = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int mid = s + (e - s)/2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAsc) {
                if (key < arr[mid]) {
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }else {
                if (key > arr[mid]) {
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
