public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,7,1,2,3};
        int[] ans= Insertion(arr);
        System.out.println(ans);
    }
//    static int[] Insertion(int[] arr) {
//        for (int i = 1; i <= arr.length-1; i++) {
//            int temp = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > temp) {
//                int temp2 = temp;
//                temp = arr[j];
//                arr[j] = temp2;
//                j = j - 1;
//            }
//        }
//        return arr;
//    }
//}
