public class MaximumProSubArray {
    public static void main(String[] args) {

    }
    public static int maxProdSubArr(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int result = max;
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int temp = Math.max(cur,Math.max(cur*min,cur*max));
            min = Math.min(cur,Math.min(cur*min,cur*max));
            max=temp;
            result=Math.max(max,result);
        }
        return result;
    }

}
