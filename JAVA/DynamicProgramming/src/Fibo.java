public class Fibo {
    static int n=5;
    public static void main(String[] args) {
        int ans3=fiboRecur(5);
        System.out.println(ans3);
        System.out.println("the count of function call in normal recursion is"+" "+ count2);
        int ans=fib(5);
        System.out.println(ans);
        System.out.println("the count of function call in top down is"+" "+count);
//        int ans2=fibBtoUp(5);
//        System.out.println(ans2);
    }
//    normal fibonacci method using recursion
    static int count2;
    public static int fiboRecur(int n){
        count2++;
        if (n<2){
            return n;
        }
        return fiboRecur(n-1)+fiboRecur(n-2);
    }
    static int count;
    static int[] memo=new int[n+1];
    public static int fib(int n){
        count++;
//        int[] memo=new int[n+1];
        if (memo[n]!=0){
            return memo[n];
        }
        if (n<=1){
            return n;
        }
        int sum=fib(n-1)+fib(n-2);
        memo[n] = sum;
        return memo[n];
    }

    public static int fibBtoUp(int n){
        int first=0;
        int second=1;
        int next=0;
        for (int i = 2; i <=n ; i++) {
            next=first+second;
            first=second;
            second=next;
        }
        return next;
    }
}
