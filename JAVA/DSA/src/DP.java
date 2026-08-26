import java.util.Arrays;

public class DP {
    public static void main(String[] args) {
        int ans=fibBtoUp(10);
        int ans2=fib(10);
        System.out.println(ans);
        System.out.println(ans2);
//        System.out.print(count);
    }
    static int count;
    public static int fib(int n){
//        int[] memo=new int[n];
//        if (memo[n]!=0){
//            return memo[n];
//        }
        count++;
        if (n<2){
            return n;
        }
//        int sum=fib(n-1)+fib(n-2);
//        memo[n]=sum;
//        return sum;
        return fib(n-1)+fib(n-2);
    }
    public static int fibBtoUp(int n){
        int first=0;
        int second=1;
        int next = 0;
        for (int i = 2; i <=n ; i++) {
            next=first+second;
            first=second;
            second=next;
        }
        return next;
    }
}
