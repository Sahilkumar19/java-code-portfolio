import java.util.Arrays;

public class doutchFlag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        int[] ans = flag(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] flag(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int i = 0;  // Pointer to iterate through the array

        while (i <= r) {
            if (arr[i] == 0) {
                // Swap current element with the left pointer, move both left and current pointers
                swap(i, l, arr);
                l++;
                i++;
            } else if (arr[i] == 2) {
                // Swap current element with the right pointer, move only the right pointer
                swap(i, r, arr);
                r--;
            } else {
                // If the element is 1, just move the current pointer
                i++;
            }
        }
        return arr;
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
