package com.simplestcodings;
//Find minimum number of merge operations to make an array palindrome
public class minimumMerging {
    public static void main(String[] args) {
        int[] arr = {1,4,5,1};
        int ans = checkValues(arr);
        System.out.println(ans);
    }
    public static int checkValues(int[] arr){
        int ans  = 0;
        int j = arr.length-1;
        int i = 0;
        for (int k = 0; k < arr.length-1; k++) {
            if (arr[i]==arr[j]){
                i++;
                j--;
            } else if (arr[i]>arr[j]) {
                ans++;
                j--;
            }else {
                ans++;
                i++;
            }
        }
        return ans;
    }
}
