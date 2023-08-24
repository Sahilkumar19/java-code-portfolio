// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int arr[] = {98,87,76,65,54,43,32,21};
        int key = 43;
        int ans = BinarySearch2(arr,key);
        System.out.println(ans);
    }
    // binary search technique for array in ascending order
    static int BinarySearch(int arr[] , int key) {
        int s = 0;
        int e = arr.length-1;
        while (s <= e) {
            int mid = s +(e - s)/2;
            if (arr[mid] > key) {
                e = mid - 1;
            } else if (arr[mid] < key) {
                s = mid + 1;

            }else {
                return mid;
            }
        }
        return -1;

    }
    // binary search technique for array in descending order
    static int BinarySearch2(int arr[] , int key) {
        int s = 0;
        int e = arr.length-1;
        while (s < e) {
            int mid = s + (e - s)/2;
            if (arr[mid] > key) {
                s = mid +1;
            } else if (arr[mid] < key) {
                e = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }


}