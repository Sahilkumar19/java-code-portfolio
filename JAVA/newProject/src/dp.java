import java.util.Arrays;

public class dp {
    public static void main(String[] args) {
//         triangularNum(5);
//         long ans=fibo3(100);//0,1,1,2,3,5
//        System.out.println(ans);
        System.out.println(ways2(2));
//        int[] arr = {3,2,7,10};
//        int ans = maxSumSubSeqMemo(arr,0);
//        System.out.println(ans);
//        String s="leet";
//        s.
    }
    //1. print first nth triangular number
    public static void triangularNum(int n){
        int res=0;
        for (int i = 1; i < n+1; i++) {
            res+=i;
            System.out.println(res);
        }
    }

    //2. fibonacci number
//    1. approach top-down ==> recursion + memoization (in this approach we have the fibonacci series in random order)
    public static long fib(int n){
        long[] memo = new long[n+1];
        //base condition check
        if (n<2){
            return n;
        }
        //check if answer is present in the cache/memo
        if (memo[n]!=0){
            return memo[n];
        }
        memo[n]=fib(n-1)+fib(n-2);
        return memo[n];
    }

//    2. approach bottom - up or tabular or iterative method here we have fibonacci series in order
    // in this approach we can reduce the space complexity to the constant if we have been asked to just return the nth fibonacci number not the whole sequence.

    //for whole sequence we will take a memo array where we will store the fibonacci sequence till n in the correct order.
    public static long fibo(int n){

//        this approach taking O(n) space
        long[] memo = new long[n+1];
        memo[0]=0;
        memo[1]=1;
        for (int i = 2; i < memo.length; i++) {
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];

        //we can reduce this by taking some variables


    }
    public static long fibo3(int n){
        long first=0;
        long second=1;
        long curr =0;
        for (int i = 2; i < n+1; i++) {
            curr=first+second;
            first=second;
            second=curr;
        }
        return curr;
    }
//   3.  stair Case problem using the topdown approach
    public static int ways(int n){
        if (n<2){
            return n;
        }
        return ways(n-1)+ways(n-2);
    }

//    using bottom up to save the space

    public static int ways2(int n){
        int first=1;
        int second=2;
        int res=0;
        for (int i = 2; i < n+1; i++) {
            res=first+second;
            first=second;
            second=res;
        }
        return res;
    }

//    4. maximum sum subsequence such that no two elements are adjacent
//    arr=[3,2,7,10]
//    ans=13

//    1. approach using recursion

    public static int maxSumSubSeq(int[] arr, int i){
        if (i>=arr.length){
            return 0;
        }
        return Math.max(arr[i]+maxSumSubSeq(arr,i+2),maxSumSubSeq(arr,i+1));
    }

//    now memozing the same solution by using the memo array so for the memoization the logic is fixed which is
//    1. check the memo array if its not null or zero then simply return memo[i] else calculate then store and then return it.

    public static int maxSumSubSeqMemo(int[] arr, int i){
        if (i>=arr.length){
            return 0;
        }
       int[] memo = new int[arr.length];
//        1. memo check
        if (memo[i]!=0){
            return memo[i];
        }
        memo[i]=Math.max(arr[i]+maxSumSubSeq(arr,i+2),maxSumSubSeq(arr,i+1));
        return memo[i];
    }

}

