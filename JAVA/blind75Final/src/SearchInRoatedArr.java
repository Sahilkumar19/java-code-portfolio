public class SearchInRoatedArr {
    public static void main(String[] args) {

    }
    public static int search(int[] arr){
        if (arr.length==1){
            return arr[0];
        }
        int left =0;
        int right = arr.length-1;
        int ans  = arr[0];
        while (left<=right){
            if (arr[left]<arr[right]){
                ans = Math.min(ans, arr[left]);
            }
            int mid = left + (right - left) / 2;
            ans = Math.min(ans, arr[mid]);
            if (arr[left] < arr[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }
        return ans;
    }

}
