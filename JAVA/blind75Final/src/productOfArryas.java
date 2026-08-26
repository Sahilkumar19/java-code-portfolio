public class productOfArryas {
    public static void main(String[] args) {
    }
    public static int[] product(int[] arr){
        int[] preArr = new int[arr.length];
        int[] postArr = new  int[arr.length];
        int[] productArr = new int[arr.length];
        preArr[0] = 1;
        postArr[postArr.length-1]=1;
        for (int i = 1; i < preArr.length; i++) {
            preArr[i] = arr[i-1]*preArr[i-1];
        }
        for (int i = postArr.length-2; i >=0; i--) {
            postArr[i]=arr[i+1]*postArr[i+1];
        }
        for (int i = 0; i < productArr.length; i++) {
            productArr[i] = preArr[i]*postArr[i];
        }
        return productArr;
    }
}
