import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("enter the size of array or the value of n : ");
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter a number:");
            int num=in.nextInt();
            a[i]=num;
        }
        System.out.println(Arrays.toString(countSort(a,n)));
    }
    static int[] countSort(int[] a, int n){
        int k=a[0];
        for (int i = 1; i < a.length; i++) {
            if (k<a[i]){
                k=a[i];
            }
        }
        System.out.println(k);
        int[] count=new int[k+1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        System.out.println(Arrays.toString(count)); //[3, 3, 4, 0, 1, 1, 0, 2, 1, 2]

//        updating the count array so that it will tell the actual position of the element of the array
        for (int i = 1; i <=k ; i++) {
            count[i]=count[i]+count[i-1];
        }
        System.out.println(Arrays.toString(count));  //[3, 6, 10, 10, 11, 12, 12, 14, 15, 17]

//        making output sorted array
        int[] b=new int[n];
        for (int i = n-1; i >=0 ; i--) {
            b[--count[a[i]]]=a[i];
        }
        System.out.println(Arrays.toString(b)); //[0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 4, 5, 7, 7, 8, 9, 9]

//        now copying the element of b to a
        for (int i = 0; i < n; i++) {
            a[i]=b[i];
        }
//        System.out.println(Arrays.toString(a));
        return a;
    }
//    now to find the time complexity we need to see the how many times the statement written inside the for loop has been executed
//    O(n+k)
    //k should be order of n
    //will not work for negative values
    //it can not be applied if the values are in any range

}
