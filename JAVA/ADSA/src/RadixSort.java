import java.util.Scanner;
public class RadixSort {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter number : ");
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter a number:");
            int num=in.nextInt();
            a[i]=num;
        }
        RadSort(a,n);
    }
    static void RadSort(int[] a,int n){
        int max=getMax(a);
        for (int pos = 1; max/pos>0 ; pos=pos*10) {
            cs(a,n,pos);
        }
    }
    static int[] cs(int[] a, int n, int pos){
        int[] count=new int[n];
        int[] b=new int[n];
        int k=a[0];
        for (int i = 1; i < a.length; i++) {
            if (k<a[i]){
                k=a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            count[(a[i]/pos)%10]++;
        }
        for (int i = 1; i <= k; i++) {
            count[i]=count[i]+count[i-1];
        }
        for (int i = n-1; i >=0 ; i--) {
            b[count[(a[i]/pos)%10]]=a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i]=b[i];
        }
        return a;
    }
    static int getMax(int[] a){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
