import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DaySeries_21 {
    public static void main(String[] args) {
//        int[] arr={2,1,3};
//        System.out.println(optimizedSumSubArray(arr));
        String corridor = "SSPPSPS";
//        System.out.println(numberOfWays(corridor));
//        System.out.println(setBits(19));
//        System.out.println(buildString(3));
//        System.out.println(findGCDOptimal(7,44));
//        System.out.println(findLCMOptimal(5,7));
//        System.out.println(divCountOptimal(12,4,6));
//        factorOptimal(450);
//        System.out.println(countFactors(450));
//        System.out.println(checkEvenOdd(98));
//        System.out.println(openDoors(8));/
//        System.out.println(isPrime(29));
//        primeInRange(29);
//        System.out.println(primeInRangeUsingSOE(10));
//        System.out.println(isTPrime(25));
//        System.out.println(optimalIsTPrime(25));
//        System.out.println(-12*-1);
//        int[] array = {1,1,5,5,5,6,9,9,9,9};
//        System.out.println(firstOccurrence(array,5));
//        int[] arr={40,10,10,30,40,20,50,70,50};
//        System.out.println(Arrays.toString(selectionSort(arr)));
//        System.out.println(kthSmallestOptimal(arr,6));
//        int[] arr = {2,1,8,5,9,4};
//        int sum=12;
//        System.out.println(pairSum(arr,sum));
//        int[] arr = {1,2,2,4,5,5,5,8,8,11};
//        int sum=10;
//        System.out.println(numberPairs(arr,sum));
//        int[] arr={2,3,5};
//        System.out.println(numberOfRectangles(arr,15));
//        String str = "aba";
//        System.out.println(countOnAllSubStr(str));
//        int[] arr={1,2,3};
//        System.out.println(productOfAllSubSets(arr));
        int[] arr = {100,1,2,500};
        int[] memo = new int[arr.length];
        System.out.println(maxSumSubSequenceMemo(0,arr,memo));
    }


//    ------------------------------------------------------ Combinations -------------------------------------------------------------------------------------

    // sum of all the subArrays {1,2,3} ==> 1+1+2+1+2+3+2+2+3+3 ==> 19
    // this approach will cost O(n^2) which will give TLE for large input like n~10^6
    public static int sumSubArrays(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
            }
        }
        return sum;
    }

    // that is where contribution technique comes into the picture

    // means consider the contribution of each element

//    [2,1,3] ==> how many subarrays contains 1 ? ==> 4 so contribution is 1*4 and same for all other elements

//    so contribution of an element arr[i]=arr[i]*(the number of subarrays that contains arr[i])
    // the number of subarrays that contains arr[i] = (i+1)*(n-i)

    public static int optimizedSumSubArray(int[] arr){
        int n=arr.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i]*(i+1)*(n-i);
        }
        return sum;
    }

    // Modular Arithmetic Rules

//    contribution in 2D
//    Sum of all SubMatrices
//    sum = martix[i][j]*(i+1)*(j+1)*(m-i)*(n-j)



    //    ------------------------------------------------------ COMBINATORICS -------------------------------------------------------------------------------------

//    Question ==> 2147. Number of Ways to Divide a Long Corridor
//    Input: corridor = "SSPPSPS"
//    Output: 3
    public static int numberOfWays(String corridor){
        ArrayList<Integer> storeWays = new ArrayList<>();
        int c = 0;
        int total = 0;
        int first;
        int last=-1;
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i)=='S'){
                c++;
                total++;
                if (c==2) {
                    last=i;
                } else if (c==3) {
                    first=i;
                    storeWays.add(first-last);
                    c=1;
                    last=-1;

                }
            }
        }
        if (total==0 || total%2!=0){
            return 0;
        }
        long m= 1000000007;
        int ans =1;
        for (int i = 0; i < storeWays.size(); i++) {
            ans= (int) (((ans%m)*(storeWays.get(i)%m))%m);
        }
        return ans;
    }

    //    ------------------------------------------------------ BIT-MANIPULATION --------------------------------------------------------------------------------
//8==>1000
    public static int numberOfSetBits(int n){
        int cnt=0;
        while (n>0){
            if (n%2==1){
                cnt++;
            }
            n=n/2;
        }
        return cnt;
    }
// complexity is O(log base 2 n)

//    2. Approach
    public static int setBits(int n){
        int cnt=0;
        while (n!=0){
            n=(n)&(n-1);
            cnt++;
        }
        return cnt;
    }

//
    //    ------------------------------------------------------ CONSTRUCTIVE ALGORITHMS --------------------------------------------------------------------------------

//    class of algos which does not just check the existence of solution, rather generate one such solution
//    no fixed pattern

//    1. Question

//    {'a','b','c'} given three characters and an integer n...create a string of length n which should satisfy the following two conditions
//    1. there should not be any substring of length 3 which is palindrome
//    2. use c as less as possible.
    public static StringBuilder buildString(int n){
        Character[] arr = new Character[n];
        char curr='a';
        for (int i = 1; i < n; i+=2) {
            arr[i]=curr;
            if (curr=='a'){
                curr='b';
            }else {
                curr='a';
            }
        }
        char curr2='a';
        for (int i = 0; i < n; i+=2) {
            arr[i]=curr2;
            if (curr2=='a'){
                curr2='b';
            }else {
                curr2='a';
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c:arr) {
            ans.append(c);
        }
        return ans;
    }

    //    ------------------------------------------------------MATHS GCD AND LCM--------------------------------------------------------------------------------

//    1. gcd

    public static int findGCD(int n1, int n2){
        for (int i = Math.min(n1,n2); i >= 1; i--) {
            if (n1%i==0 && n2%i==0){
                return i;
            }
        }
        return -1;
    }
//    time complexity is O(min(n1,n2)), but this will give tle when the n1 and n2 are very large

    public static int findGCDOptimal(int n1, int n2){
        int x=Math.min(n1,n2);
        int y=Math.max(n1,n2);
        while (x>0){
            int temp=x;
            x=y%x;
            y=temp;
        }
        return y;
    }
//    its time complexity is log( y base 2);

//    2. lcm

    public static int findLCM(int n1, int n2){
        for (int i = Math.max(n1,n2); i <=n1*n2 ; i++) {
            if (i%n1==0 && i%n2==0){
                return i;
            }
        }
        return -1;
    }
//    the above approach to find lcm will take O(n*m) but will give tle when n1 and n2 are very large

//    lcm * hcf(gcd) = n1*n2 we can use it and reduce the complexity

    public static int findLCMOptimal(int n1, int n2){
        return (n1*n2)/findGCDOptimal(n1,n2);
    }

//    3. given an int n, int A and int B job is to find the count of natural no. which divisible by A or B or both

    public static int divCount(int n, int A, int B){
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (i%A==0 || i%B==0){
                count++;
            }
        }
        return count;
    }
//    this will take linear time and will give TLE when n is very large

    public static int divCountOptimal(int n, int A, int B){
//        n/A = gives the number of multiples(count of number divisible by A) of A and same for B then subtracting the common multiples that occurs twice by taking lcm of A and B

        return (n/A)+(n/B)-(n/findLCMOptimal(A,B));
    }
    //we can extend this to three numbers A, B, C
//    formula will be  n/A + n/B + n/C - n/lcm(A,B) - n/lcm(B,C) - n/lcm(C,A) + n/lcm(A,B,C)

//    4. given an array of int we have to choose a number x>= 2 such that the array
//    can be chunked and each chunk of size x and all the elements in each chunk should be same.

    public static void findX(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else {
                freq.put(arr[i],1);
            }
        }
        //now if gcd of all the frequencies of numbers is >= 2 then return that number
//        otherwise there is no such x

    }

    //    ------------------------------------------------------ MATHS-FACTORS + PRIMALITY TEST -------------------------------------------------------------------------------------

//    factor of a number
    public static void factor(int x){
        for (int i = 1; i <= x/2; i++) {
            if (x%i==0){
                System.out.println(i);
            }
        }
        System.out.println(x);
    }
    public static void factorOptimal(int x){
        for (int i = 1; i*i <=x ; i++) {
            if (x%i==0){
                if (i!=x/i){
                    System.out.println(i);
                    System.out.println(x/i);
                }else {
                    System.out.println(x/i);
                }
            }
        }
    }
//    best approach to list down all the factors. time complexity is O(under-root x)

    public static int countFactors(int n){
        int factors=0;
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0){
                if (i!=n/i){
                    factors+=2;
                }else {
                    factors+=1;
                }
            }
        }
        return factors;
    }
    public static String checkEvenOdd(int n){
        boolean isPerfect = checkPerfectSquare(n);
        if (isPerfect){
            return "odd";
        }
        return "even";
    }
    //simple idea is to check whether the number is a perfect square or not
//    if the number is a perfect square then it has odd number of factors else even

    public static boolean checkPerfectSquare(int n){
        int s=1;
        int e=n;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (mid*mid==n){
                return true;
            } else if (mid*mid>n) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return false;
    }

    // count number of open doors
//    problem = there are n doors which are initially closed. a game is played of n rounds and the rule is in ith round the doors which
//    are the multiples of i will be opened. then at the end of the game means after n rounds count the number of open doors.
    public static int openDoors(int n){
        int openDoors = 0;
        for (int i = 1; i <=n ; i++) {
            if (checkPerfectSquare(i)){
//                if a number is a perfect square then it has odd numbers of factors
                openDoors++;
            }
        }
        return openDoors;
    }

//    logic of the above solution: so door is toggeled as many times as the numbers of its factors
//    and we know one thing for sure is that if numbers is a perfect square then it has odd numbers of factors
//    in that case if a door is toggeled odd numbers of times then it will be opened at the end (given that initially doors were closed)

//    primality test

//    1.prime number
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        int count =0;
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0){
                count+=2;
            }if (count>2){
                return false;
            }
        }
        return true;
    }

//    print all the primes in the range [1...N]

    public static void primeInRange(int n){
        for (int i = 1; i <=n ; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime){
                System.out.println(i);
            }
        }
    }

//    the above approach has time complexity of n*under-root(n) which will give tle for larger n.

//    second approach using sieve of Eratosthenes

    public static int primeInRangeUsingSOE(int n){
        if (n<2){
            return 0;
        }
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for (int i = 2; i*i <=n ; i++) {
            if (isPrime[i]){
                for (int j = i; i*j <=n ; j++) {
                    isPrime[i*j]=false;
                }
            }
        }
        int count=0;
        for (int i = 2; i <=n ; i++) {
            if (isPrime[i]){
                count++;
            }
        }
        return count;
    }


    // t-prime => the number which has only three factors

    public static boolean isTPrime(int n) {
        if (n < 2) {
            return false;
        }
        int count=0;
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0){
                count+=2;
            }
            if (count>3){
                return false;
            }
        }
        return true;
    }

//    optimal approach for the t prime
//    1.............5............25 ,, so by seeing we can say that the number should be a perfect square and the square root of the number should be a prime number then the number is t prime
//    implementation
    public static boolean optimalIsTPrime(int n){
        return isPrime(findPerfectSquare(n));
    }
    // helper for the above to find the perfect square using the binary search approach
    public static int findPerfectSquare(int n){
        int s=1;
        int e=n;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (mid*mid==n){
                return mid;
            }
            if (mid*mid>n){
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return -1;
    }


    //    ------------------------------------------------------ Binary-Search -------------------------------------------------------------------------------------
//1. first occurrence
    public static int firstOccurrence(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
//        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                if (mid==0){
                    return mid;
                }
                if (arr[mid-1]!=target){
                    return mid;
                }else {
                    e=mid-1;
                }
            } else if (arr[mid]>target) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return -1;
    }

//    2. find Kth smallest element in an unsorted array
//    1. Approach : sort the array then return arr[k-1]. TE=O(nlogn)

//    in selection sort we find the smallest element and swap it with current element
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            int mini=i;
            for (int j = i; j <=arr.length-1 ; j++) {
                if (arr[j]<arr[mini]){
                    mini=j;
                }
            }
            swap(arr,mini,i);
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int kthSmallest(int[] arr, int k){
        return arr[k-1];
    }
//    2. use heap
//    do not modify the array and algorithm should be having O(1).

    public static int kthSmallestOptimal(int[] arr, int k){
        int s=findSmallest(arr);
        int e=findLargest(arr);
        while (s<=e){
            int mid=s+(e-s)/2;
            int c=cnt(mid,arr);
            if (c<k){
                s=mid+1;
            }else{
                int c1=cnt(mid-1,arr);
                if (c1<k){
                    return mid;
                }else {
                    e=mid-1;
                }
            }
        }
        return -1;
    }
    public static int findSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE;
        for (int n:arr) {
            if (n<smallest){
                smallest=n;
            }
        }
        return smallest;
    }
    public static int findLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        for (int n:arr) {
            if (n>largest){
                largest=n;
            }
        }
        return largest;
    }
    public static int cnt(int x, int[] arr){
        int count=0;
        for (int n:arr) {
            if (n<=x){
                count++;
            }
        }
        return count;
    }

    //    ------------------------------------------------------ TWO-POINTERS -------------------------------------------------------------------------------------

//    1. pair sum
    public static boolean pairSum(int[] arr,int sum){
//        1. brute force use nested loop and iterate and check for pairs - O(n**2)
//        2. sort the array and then use two pointers - O(nlogn)
//        3. use hashmap and then check as lookup

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],i);
            }
        }
        for (int n:arr) {
            if (hashMap.containsKey(sum-n)){
                return true;
            }
        }
        return false;
    }

//    2. array is sorted then we can simply apply the two pointers technique

    public static boolean pairSumTP(int[] arr, int sum){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int currSum=arr[s]+arr[e];
            if (currSum>sum){
                e--;
            } else if (currSum<sum) {
                s++;
            }else {
                return true;
            }
        }
        return false;
    }

//    3. find number of pairs
//int[] arr = {1,2,2,4,5,5,5,8,8,11};
    public static int numberPairs(int[] arr, int sum){
        int s=0;
        int e=arr.length-1;
        int count=0;
        while (s<e){
            int currSum=arr[s]+arr[e];
            if (currSum>sum){
                e--;
            } else if (currSum<sum) {
                s++;
            }else {
//                int[] arr = {1,2,2,4,5,5,5,8,8,11};
                if (arr[s]==arr[e]){
                    int k=e-s+1;
                    count+=k*(k-1)/2;
                    break;
                }else{
                    int countl=1;
                    int i=s;
                    while (arr[i]==arr[i+1]){
                        countl++;
                        i++;
                    }
                    int countr=1;
                    int j=e;
                    while (arr[j]==arr[j-1]){
                        countr++;
                        j--;
                    }
                    count+=countl*countr;
                    s=i+1;
                    e=j-1;
                }
            }

        }
        return count;
    }

//    find number of rectangles whose area is < A
//    [2,3,4] = 6
    public static int numberOfRectangles(int[] arr, int A){
        int s=0;
        int e=arr.length-1;
        int count =0;
        while (s<=e){
            int currArea=arr[s]*arr[e];
            if (currArea>=A){
                e--;
            }else {
                int l=e-s+1;
                count+=2*l-1;
                s++;
            }
        }
        return count;
    }
//    ---------------------------------------------------------N-POINTERS----------------------------------------------------------------------------------------------------------
//    1. find number of unique characters in a string

    public static int count(String str){
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for (Character c:str.toCharArray()) {
            if (!set.contains(c)){
                set.add(c);
                count++;
            }else {
                count--;
            }
        }
        return count;
    }
    public static int countOnAllSubStr(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                count+=count(str.substring(i,j));
            }
        }
        return count;
    }


    //    ------------------------------------------------------ DP -------------------------------------------------------------------------------------

//    main part: how to deduce the solution of a large problem from solution of smaller sub-problem(s)

//    1. sum of product of all subsets
    public static int productOfAllSubSets(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans+arr[i]*ans+arr[i];
        }
        return ans;
    }

//    2. Maximum sum subsequence such that no two elements are adjacent
//    arr={5,7,1,6} => 13


//    1. recursive approach
    public static int maxSumSubSequence(int i, int[] arr){
        if (i>=arr.length){
            return 0;
        }else {
            return Math.max(arr[i]+maxSumSubSequence(i+2,arr),maxSumSubSequence(i+1,arr));
        }
    }

//    memozing the above solution

    public static int maxSumSubSequenceMemo(int i, int[] arr, int[] memo){
        if (i>=arr.length){
            return 0;
        }
        if (memo[i]!=0){
            return memo[i];
        }
        memo[i]=Math.max(arr[i]+maxSumSubSequenceMemo(i+2,arr,memo),maxSumSubSequenceMemo(i+1,arr,memo));
        return memo[i];
    }
}

//    ------------------------------------------------------ PRE-COMPUTATION -------------------------------------------------------------------------------------
//     in 2d
class NumMatrix {
    int[][] precomputed;
    int n;
    int m;
    void prefixSumRow(){
        for (int r = 0; r < n; r++) {
            for (int c = 1; c < m; c++) {
                precomputed[r][c]+=precomputed[r][c-1];
            }
        }
    }
    void prefixSumCol(){
        for (int c = 0; c < m; c++) {
            for (int r = 1; r < n; r++) {
                precomputed[c][r]+=precomputed[r-1][c];
            }
        }
    }

    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        precomputed=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                precomputed[i][j]=matrix[i][j];
            }
        }
        prefixSumRow();
        prefixSumCol();
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = precomputed[row2][col2];
        if (row1-1>=0){
            ans-=precomputed[row2-1][col2];
        }if (col1-1>=0){
            ans-=precomputed[row2][col1-1];
        }if (row1-1>=0 && col1-1>=0){
            ans+=precomputed[row1-1][col1-1];
        }
        return ans;
    }
}



