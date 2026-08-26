public class missingNumber {
    public static void main(String[] args) {

    }
    public static int find(int[] arr){
        int sum=0;
        for (int n: arr) {
            sum+=n;
        }
        int n=arr.length;
        int nSum=n*(n+1)/2;
        return nSum-sum;
    }
}
