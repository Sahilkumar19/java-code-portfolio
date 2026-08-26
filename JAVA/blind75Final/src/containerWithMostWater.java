public class containerWithMostWater {
    public static void main(String[] args) {

    }
    public static int mostWater(int[] arr){
        int l=0;
        int r=arr.length-1;
        int result=0;
        while (l<r){
            int area=(r-l)*Math.min(arr[l],arr[r]);
            result=Math.max(area,result);
            if (arr[l]<arr[r]){
                l+=1;
            }else {
                r-=1;
            }
        }
        return result;
    }
}
