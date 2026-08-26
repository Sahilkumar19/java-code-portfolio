
import java.util.Arrays;
import java.util.Scanner;
//import java.
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of elements in the array : ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter item to put in the array : ");
            int item = in.nextInt();
            array[i] = item;
        }
        System.out.println(Arrays.toString(array));
        System.out.print("enter a number to search for: ");
        int target = in.nextInt();
        System.out.println("the value of index of target is" + " " + implBinarySearch(array,target));
    }
    public static int implBinarySearch(int[] array, int target){
        int s = 0;
        int e = array.length;
        while (s < e){
            int mid = s + (e - s) / 2;
            if (array[mid]>target){
                e = mid - 1;
            } else if (array[mid]<target) {
                s = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
