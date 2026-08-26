import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DaysOfCode {
    public static void main(String[] args) {
//        int[] arr={2,7,9,5,8,7,4};
//        int p=1,q=2,r=3;
//        System.out.println(findMaxSum(arr,p,q,r));
//        System.out.println(Arrays.toString(suffixMax(arr)));
//        System.out.println(findMaxSumOptimize(arr,1,2,3));
//        int[] array = {1,5,7,0,-1,2,3};
//        System.out.println(Arrays.toString(rightRotateByKUnitsOptimized(array, 3)));
//        kSizedSubArrSumOptimized(array,4);
//        System.out.println(minSwap(arr,5));
//        int[] arr = {1,3,0,2};
//        System.out.println(Arrays.toString(changeArrOptimized(arr)));
//        System.out.println(gcdRecursive(7,25));
//        System.out.println(lcmOptimized(3,5));
//        System.out.println(countNum(10,2,3));
//        System.out.println(countNumOptimize(10,2,3));
//        System.out.println(openDoors(2));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(4));
//        printPrimeUpToNOptimal(3);
//        int[] arr={1,2,3};
//        System.out.println(subsets(arr));
//        System.out.println(subsetsOfSizeK(4,2));
//        System.out.println(findPowerOptimal(2,4));
//        int[] arr = {2,5,6,9,19};
//        System.out.println(BinarySearch(arr,6));
//        int[] arr = {1,1,2,2,3,4,5};
//        System.out.println(firstOccurence(arr, 2));
//        int[] arr = {1,2,2,2,2,2,4};
//        System.out.println(lastOccurence(arr,2));
//        int[] arr = {10, 20, 23, 40};
//        System.out.println(findPeak(arr));
//        System.out.println(findSqrt(10));
//        int[] arr = {10,20,10,50,70,20,40,10};
//        System.out.println(findKthSmallest(arr,6));
        int[] arr = {7,1,3,6};
//        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
//    1. we have been given an int array, int p,q,r we need to maximize the p*arr[i]+q*arr[j]+r*arr[k] such that i<j<k

//    brute force approach
//    using nested(3) loops
    public static int findMaxSum(int[] arr, int p, int q, int r){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    max=Math.max(max, p*arr[i]+q*arr[j]+r*arr[k]);
                }
            }
        }
        return max;
    }

//    PrefixMax[j] = max(PrefixMax[j-1],arr[j])

    public static int[] prefixMax(int[] arr){
        int[] prefixMaxArr = new int[arr.length];
        prefixMaxArr[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixMaxArr[i]=Math.max(prefixMaxArr[i-1],arr[i]);
        }
        return arr;
    }
    public static int[] suffixMax(int[] arr){
        int n=arr.length;
        int[] suffixMaxArr = new int[n];
        suffixMaxArr[n-1]=arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixMaxArr[i]=Math.max(suffixMaxArr[i+1],arr[i]);
        }
        return arr;
    }

    public static int findMaxSumOptimize(int[] arr, int p, int q, int r){
        int n=arr.length;
        int j=n/2;
        int max=Integer.MIN_VALUE;
        int[] prefixMax=prefixMaxy(arr,0,j);
        int[] suffixMax=suffixMaxy(arr, j+1,n);
        for (int i = 1; i < n-1 ; i++) {
            max=Math.max(prefixMax[i-1]+arr[i]+suffixMax[i+1],max);
        }
        return max;

    }
    public static int[] prefixMaxy(int[] arr, int i, int j){
        int n=arr.length;
        int[] prefixMax=new int[n];
        prefixMax[0]=arr[0];
        for (int k = 1; k < j ; k++) {
            prefixMax[i]=Math.max(arr[k],prefixMax[k-1]);
        }
        return prefixMax;
    }
    public static int[] suffixMaxy(int[] arr, int i, int j){
        int n=arr.length;
        int[] suffixMax=new int[n];
        suffixMax[j-1]=arr[j-1];
        for (int k = j-2; k >=i ; k--) {
            suffixMax[i]=Math.max(arr[k],suffixMax[k+1]);
        }
        return suffixMax;
    }

//    1. Array Rotation
//    right rotate the array by k units

//    1. approach using extra space

//    1,5,2,4,3 ==> 3 ==> 2,4,3,1,5

    public static int[] rightRotateByKUnits(int[] arr, int k){
        int n=arr.length;
        int[] temp= new int[n-k];
        for (int i = 0; i < n-k; i++) {
            temp[i]=arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i]=arr[n-k+i];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[k+i]=temp[i];
        }
        return arr;
    }

//    2. without any extra space

    public static int[] rightRotateByKUnitsOptimized(int[] arr, int k){
        int n=arr.length;
        reverseArr(arr,0,arr.length-k-1);
        reverseArr(arr,n-k,n-1);
        reverseArr(arr,0,n-1);
        return arr;
    }
    public static void reverseArr(int[] arr, int s, int e){
        while (s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    //3. print the sum of every k-sized subarray

    public static void kSizedSubArrSum(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            if (k+i>arr.length){
                break;
            }
            for (int j = i; j < k+i; j++) {
                sum+=arr[j];
            }
            System.out.println(sum);
            sum=0;
        }
    }

    public static void kSizedSubArrSumOptimized(int[] arr, int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length-k; i++) {
            sum=sum-arr[i]+arr[k+i];
            System.out.println(sum);
        }
    }

//    4. minimum number of swaps required to bring elements less than k together

//    {2,1,5,6,3} k=3 ==> {2,1,3,6,5} 1 swap

    public static int minSwap(int[] arr, int k){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=k){
                continue;
            }else {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]<=k){
                        swap(arr,i,j);
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

//    Maths for coding

//    5. given an int[] arr of size n containing numbers b/w 0 to n-1 and all the numbers are distinct so job is to
//    change the arr s.t. if arr[i]=j then make arr[j]=i
//    ex- arr = {1,3,0,2} here n=4 ans will be = {2,0,1,3}
//    1. brute force approach using extra array
    public static int[] changeArr(int[] arr){
        int n=arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[arr[i]]=i;
        }
        for (int i = 0; i < n; i++) {
            arr[i]=res[i];
        }
        return arr;
    }

//    2.optimized approach
    public static int[] changeArrOptimized(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]<0){
                continue;
            }else {
                int indx=arr[i],val=i;
                while (indx!=i){
                    int temp=arr[indx];
                    arr[indx]=-1*(val+1);
                    val=indx;
                    indx=temp;
                }
                arr[indx]=-1*(val+1);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i]=-1*arr[i]-1;
        }
        return arr;
    }

//    6. GCD
//    1. brute force approach - gcd of two numbers will never be grater that the smaller number ==> TC = O(min(n1,n2))

    public static int gdc(int n1, int n2){
        for (int i = Math.min(n1,n2); i >=1; i--) {
            if (n1%i==0 && n2%i==0){
                return i;
            }
        }
        return -1;
    }

//    2. approach- how we used to calculate it during our school days by dividing it till the reminder is 0.
//    TC = log(max(a,b)) to the base 2
    public static int gcdOptimized(int n1, int n2){
        int a = Math.min(n1,n2);
        int b = Math.max(n1,n2);
        while (a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    }

    public static int gcdRecursive(int a, int b){
        int max= Math.max(a,b);
        int min= Math.min(a,b);
        if (max%min==0){
            return min;
        }
        return gcdRecursive(min,max%min);
    }

//    7.LCM
//    1. brute force- TC = O(a*b)
    public static int LCM(int a, int b){
        for (int i = Math.max(a,b); i <= a*b; i++) {
            if (i%a==0 && i%b==0){
                return i;
            }
        }
        return -1;
    }

//    2. LCM optimized = TC=TC of gcd
    public static int lcmOptimized(int a, int b){
        return (a*b/gcdOptimized(a,b));
    }

//    8. given a number N and two int a,b>0, need to find the count of numbers between 1 to N that are divisible by at least a or b

//    1. brute force

    public static int countNum(int n, int a, int b){
        int count=0;
        for (int i = 1; i < n+1; i++) {
            if (i%a==0 || i%b==0){
                count++;
            }
        }
        return count;
    }

//    2. using lcm inclusion exclusion principle

    public static int countNumOptimize(int n, int a, int b){
        return (n/a)+(n/b)-(n/lcmOptimized(a,b));
    }

//    9. find factors of a number

    public static void factors(int n){
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0){
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

    public static void factorsOptimal(int n){
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0){
                if (i!=n/i){
                    System.out.println(i);
                    System.out.println(n/i);
                }
                else {
                    System.out.println(n/i);
                }
            }
        }
    }

//    10. number of open doors
    public static int openDoors(int n){
        int doors=0;
        for (int i = 1; i <=n; i++) {
            if (isPerfectSquare(i)){
                doors++;
            }
        }
        return doors;
    }
    public static boolean isPerfectSquare(int n){
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

//    11. prime number
//Question : print all primes upto n
//    brute force: this approach will take O(n^3/2) time

    public static boolean isPrime(int n){
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeUpToN(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(n)){
                System.out.println(i);
            }
        }
    }

//    2.optimal approach : using sieve of eratosthenes : its time complexity is O(n*log(logn)) which is the sum of reciprocals of primes up to n.

    public static void printPrimeUpToNOptimal(int n){
        int[] primes = new int[n+1];
        Arrays.fill(primes,1);
        primes[0]=0;
        primes[1]=0; //[0,0,1,1]
        for (int i = 2; i <= n; i++) {
            if (primes[i]==1){
                for (int j = i; i*j <=n ; j++) {
                    primes[i*j]=0;
                }
            }

        }
//        return primes;
        for (int i = 2; i <= n; i++) {
            if (primes[i]==1){
                System.out.println(i);
            }
        }
    }

//    ---------------------------------------Recursion---------------------------------
//1. Generate all possible subsets of an array
    public static void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> allSubsets) {
        if (index == nums.length) {
            allSubsets.add(new ArrayList<>(currentSubset));
            return;
        }

        currentSubset.add(nums[index]);
        generateSubsets(nums, index + 1, currentSubset, allSubsets);

        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(nums, index + 1, currentSubset, allSubsets);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        generateSubsets(nums, 0, currentSubset, allSubsets);
        return allSubsets;
    }

    public static void allPossibleSubsets(int n, int k, int i, List<Integer> currentSubSet, List<List<Integer>> allSubSet){
        if (i>n){
            if (currentSubSet.size()==k){
                allSubSet.add(new ArrayList<>(currentSubSet));
                return;
            }
            return;
        }
        currentSubSet.add(i);
        allPossibleSubsets(n,k,i+1,currentSubSet, allSubSet);

        currentSubSet.remove(currentSubSet.size()-1);
        allPossibleSubsets(n,k,i+1,currentSubSet,allSubSet);
    }

    public static List<List<Integer>> subsetsOfSizeK(int n, int k) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        int i=1;
        allPossibleSubsets(n, k, i, currentSubset, allSubsets);
        return allSubsets;
    }

//    find power of a number given int n and k find n^k

//    1. brute force in order k time
    public static int findPower(int n, int k){
        int power=1;
        for (int i = 0; i < k; i++) {
            power=power*n;
        }
        return power;
    }

//    2. using recursion in order of logk base 2 time
    public static int findPowerOptimal(int n, int k){
        if (k==0){
            return 1;
        }
        int x = findPower(n,k/2);
        if (k%2==0){
            return x*x;
        }
        return x*x*n;
    }

//    Binary Search

    public static int BinarySearch(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return -1;
    }

//    find first occurence of the target in the sorted array
//    ex: [1,1,2,2,3,6,7], target = 2, ans = 2
    public static int firstOccurence(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while (s <= e){
            int mid = s + (e - s)/2;
            if (arr[mid] > target){
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }else {
                if (arr[mid - 1] < target){
                    return mid;
                }else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

//    second version of this is find the last occurence of the target in the sorted array
//    ex: [1,2,2,2,2,4] , target = 2, ans = 4

    public static int lastOccurence(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if (arr[mid] > target){
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }else {
                if (arr[mid + 1] > target){
                    return mid;
                }else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

//    find target in rotated sorted array
    public static int SearchInRotatedSortedArr(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid  = s + (e - s)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[s] < arr[mid]){
                if (target <= arr[s] && target < arr[mid]){
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }else {
                if (target > arr[mid] && target <= arr[e]){
                    s = mid + 1;
                }else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }


//    find peak element in an array==> element whose left and right are less than the element
    public static int findPeak(int[] arr){
//        1. brute force
        for (int i = 0; i < arr.length; i++) {
            if (i - 1 < 0){
                if (arr[i] > arr[i + 1]){
                    return i;
                }
            }
            if (i + 1 >= arr.length){
                if (arr[i] > arr[i - 1]){
                    return i;
                }
            }
            if (arr[i] > arr[i + 1] && arr[i] > arr [i - 1]){
                return i;
            }
        }
        return -1;
    }

//    find the square root of a number ex: sqrt(36) = 6, sqrt(50) = 7, sqrt(97) = 9
    public static int findSqrt(int n) {
//        simplest
//        return (int) Math.sqrt(n);

//        brute force

//        int sqrt = 0;
//        for (int i = 1; i*i < n; i++) {
//            if (i*i<=n){
//                sqrt = i;
//            }
//        }
//        return sqrt;
//    }

//        optimal approach using Binary Search

        int s = 1;
        int e = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s - 1;
    }

//    find kth smallest element in array

    public static int findKthSmallest(int[] arr, int k){
//        1. brute force - sort the array then return arr[k-1] this will take O(n^2) as we are sorting the array which take O(n^2) in worst case.
//        sorting the array using selection sort
//        int n = arr.length;
//        for (int i = 0; i <= n - 2; i++) {
//            int mini = i;
//            for (int j = i; j <= n - 1; j++) {
//                if (arr[j] < arr[mini]){
//                    mini = j;
//                }
//            }
//            swap(arr,mini,i);
//        }
//        return arr[k - 1];


//        2. better approach : using a priority queue which will take O(logn)
//        {10,20,10,50,70,20,40,10}
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        for (int n:arr) {
//            priorityQueue.add(n);
//        }
//        int i = 0;
//        while (i != k-1){
//            priorityQueue.poll();
//            i++;
//        }
//        return priorityQueue.peek();

//        3. optimal approach using binary search

        int s = findMin(arr);
        int e = findMax(arr);

        while (s <= e){
            int mid = s + (e - s)/2;
            int cnt = findCount(mid,arr);
            if (cnt < k){
                s = mid + 1;
            }else {
                if (findCount(mid - 1,arr) < k){
                    return mid;
                }else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int n:arr) {
            if (n < min){
                min = n;
            }
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int n:arr) {
            if (n > max){
                max = n;
            }
        }
        return max;
    }
    public static int findCount(int n, int[] arr){
        int count = 0;
        for (int num:arr) {
            if (num <= n){
                count++;
            }
        }
        return count;
    }


//    Sorting

//    stable vs unstable algo
//    stable means the relative position of the same element is same as in the original array.
//    unstable means the position get exchanged of the same element.
//    if some is asking which whether xyz algo is either stable or unstable so its a totally vague question because stability of algo is decided by what kind comparator we are using

//    1. insertion sort
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i <= arr.length - 1 ; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){ // so this is the comparator function where we are only checking if element is strictly less than which makes it stable because we are not swapping the equal elements
                swap(arr, j - 1, j);
                j--;
            }
        }
        return arr;
    }

//    2. bubble sort
    public static int[] bubbleSort(int[] arr){
        boolean isDone = false;
        while (!isDone){
            isDone = true;
            int i = 1;
            while (i < arr.length){
                if (arr[i] < arr[i - 1]){
                    swap(arr, i, i-1);
                    isDone = false;
                }
                i++;
            }
        }
        return arr;
    }
}