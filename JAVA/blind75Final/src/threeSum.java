import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
    }
    public static List<List<Integer>> sum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int l=i+1;
            int r=arr.length-1;
            List<Integer> triplet = new ArrayList<>();
            while (l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if (sum>0){
                    r--;
                } else if (sum<0) {
                    l++;
                }else {
                    triplet.add(i);
                    triplet.add(l);
                    triplet.add(r);
                    result.add(triplet);
                    l++;
                    while (arr[l]==arr[l-1]&&l<r){
                        l++;
                    }
                }
            }
        }
        return result;
    }
}
