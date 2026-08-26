public class sdp {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int[] memo=new int[arr.length];
//        System.out.println(minEnergy(arr.length-1,arr));
//        System.out.println(mimEnergyMemo(arr.length-1,arr,memo));
        System.out.println(maxSumSubSeq(0,arr,memo));
    }

//    Question ==> Dynamic Programming : Frog Jump (DP 3)
//    [10,20,30,10]

//    just recursion based solution
    public static int minEnergy(int i, int[] arr){
        if (i==0){
            return 0;
        }
        int jumpOne=minEnergy(i-1,arr)+Math.abs(arr[i]-arr[i-1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (i>1){
            jumpTwo=minEnergy(i-2,arr)+Math.abs(arr[i]-arr[i-2]);
        }
        return Math.min(jumpOne,jumpTwo);
    }

//    now memoization

    public static int mimEnergyMemo(int i, int[] arr, int[] memo){
        if (i==0){
            return 0;
        }
        if (memo[i]!=0){
            return memo[i];
        }
        int jumpOne=mimEnergyMemo(i-1,arr,memo)+Math.abs(arr[i]-arr[i-1]);
        int jumpTwo=Integer.MAX_VALUE;
        if (i>1){
            jumpTwo=mimEnergyMemo(i-2,arr,memo)+Math.abs(arr[i]-arr[i-2]);
        }
        memo[i]=Math.min(jumpOne,jumpTwo);
        return memo[i];
    }

//    Question ==> Maximum sum of non-adjacent elements (DP 5)

//    [1,2,4]==>5


    /// after solving the corresponding leetcode problem of this problem (198. House Robber), the same solution written below I was thinking is correct and I written the same
    // same solution for this in leetcode too but to my surprise I got TLE, (guess what I was thinking that I have memoized the recusion approach so it must be correct and will get
    // submitted in one go) after debugging and brainstorming I got where is the problem as I can clearly see that I am passing the memo array in each recursive call which is created
    // in each call which is leading to TLE means is that there is memoization is actually happening.

    // i was making the memo array inside the method itself;;

    public static int maxSumSubSeq(int i, int[] arr,int[] memo){
        if (i>=arr.length){
            return 0;
        }
        if (memo[i]!=0){
            return memo[i];
        }
        memo[i]= Math.max(arr[i]+maxSumSubSeq(i+2,arr,memo),maxSumSubSeq(i+1,arr,memo));
        return memo[i];
    }
}
