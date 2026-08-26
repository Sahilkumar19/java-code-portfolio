import java.util.Arrays;

public class partion {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int[] ans = question2(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] question2(int[] arr){
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            if (arr[l]<1){
                l++;
            } else if (arr[r]>=1) {
                r--;
            }else {
                swap(l,r,arr);
                l++;
                r--;
            }
        }
        return arr;
    }
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
