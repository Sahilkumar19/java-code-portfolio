public class Armstrong {
    public static void main(String[] args) {
        int[] arr = {370,400};
        printArmstrong(arr);
    }
    public static void printArmstrong(int[] arr){
        for (int n:arr) {
            int res = 0;
            while (n>0){
                int l=findLength("" + n);
                int rem=n%10;
                res= (int) (res+Math.pow(rem,l));
                if (res==n){
                    System.out.println(res);
                }
                n=n/10;
            }
        }
    }
    public static int findLength(String n){
        return n.length();
    }
}
