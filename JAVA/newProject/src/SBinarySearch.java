import java.util.ArrayList;

public class SBinarySearch {
    public static void main(String[] args) {
        int n=3;
        int m=4;
        int target=5;
        int[][] mat={
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
//        boolean ans = optimalSorted2DMatrix2(mat,target);
//        System.out.println(ans);
        int[] arr = {1,4,7,11,15};
        System.out.println(lowerBound(arr,6));
    }
//    question - implementing the core binary search
//    1. iteratively binary search

    public static int iterativeBS(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

//    2. recursive binary search

    public static int recursiveBS(int[] arr, int target, int s, int e){
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>target){
                return recursiveBS(arr,target,s,mid-1);
            } else if (arr[mid]<target) {
                return recursiveBS(arr,target,mid+1, e);
            }else {
                return mid;
            }
        }
        return -1;
    }

//    question - implement lower bound ==> means return the first index where element >= target

    public static int lowerBound(int[] arr, int x){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>x){
                e=mid-1;
            } else if (arr[mid]<x) {
                s=mid+1;
            } else {
                return mid;
            }
        }
        return s;
    }

//    upper bound==> return element > target
    public static int upperBound(int[] arr, int x){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>x){
                e=mid-1;
            }else {
                s= mid+1;
            }
        }
        return s;
    }

//    question - search insert position

    public static int insertPosition(int[] arr, int x){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>x){
                e=mid-1;
            } else if (arr[mid]<x) {
                x=mid+1;
            }else {
                return mid;
            }
        }
        return s;
    }
//    floor and ceil in sorted array
//    1. floor - of an element x is the largest element in the array that is smaller than or equal to x
//      2. The ceiling of x is the smallest element in the array greater than or equal to x

    public static void findFloorAndCeil(int[] arr, int x){
//        lower bound of x ===> smallest element in the array greater than or equal to x(same as the ceil)
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>x){
                e=mid-1;
            } else if (arr[mid]<x) {
                s=mid+1;
            }else {
                System.out.println("ceil is "+ mid);
            }
        }
        System.out.println(arr[s-1]);
        System.out.println(arr[s]);
    }

//    question ==> Last occurrence in a sorted array
//      {3,4,13,13,13,20,40}
    public static int lastOccurrence(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        int last=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                last=mid;
                s=mid+1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }else {
                e= mid-1;
            }
        }
        return last;
    }

    public static int firstOccurrence(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        int first=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                first=mid;
                e=mid-1;
            } else if (arr[mid]>target) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return first;
    }

//    Question ==> Count Occurrences in Sorted Array

    public static int countOccurrence(int[] arr, int x){
        int firstOccurrence= firstOccurrence(arr,x);
        int lastOccurrence= lastOccurrence(arr,x);
        return (lastOccurrence-firstOccurrence)+1;
    }

//    Question ===> Search Element in a Rotated Sorted Array
//        {7,8,9,1,2,3,4,5,6} , k=8
//        result=2
    public static int searchInRotatedArr(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==k){
                return mid;
            }if (arr[s]<=arr[mid]) {
                if (arr[s]<=k && k<=arr[mid]){
                    e=mid-1;
                }else {
                    s=mid+1;
                }
            }else {
                if (arr[mid]<=k && k<arr[e]){
                    s=mid+1;
                }else {
                    e=mid-1;
                }
            }
        }
        return -1;
    }

//    Question ==> Search Element in Rotated Sorted Array II
//        {1,0,1,1,1}
    public static boolean searchInRotatedArr2(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==k){
                return true;
            }
            if (arr[s]==arr[mid] && arr[mid]==arr[e]){
                s++;
                e--;
                continue;
            }
            if (arr[s]<=arr[mid]){
                if (arr[s]<=k && k<=arr[mid]){
                    e=mid-1;
                }else {
                    s=mid+1;
                }
            }else {
                if (arr[mid]<=k && k<=arr[e]){
                    s=mid+1;
                }else {
                    e=mid-1;
                }
            }
        }
        return false;
    }

//    Question ==> minimum in rotated sorted array
//    {4,5,6,7,0,1,2,3} mid=3
//    {3,4,5,1,2} mid=2
    public static int minRotatedSortedArr(int[] arr){
        int s=0;
        int e=arr.length-1;
        int mini=Integer.MAX_VALUE;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>=arr[s]){
                mini=Math.min(mini,arr[s]);
                s=mid+1;
            }else {
                mini=Math.min(mini,arr[mid]);
                e=mid-1;
            }
        }
        return mini;
    }

//    Question ===> Find out how many times the array has been rotated
//    {4,5,6,7,0,1,2,3} ==> original array was = {0,1,2,3,4,5,6,7} ==> here array is rotated at index 4 then becomes {4,5,6,7,0,1,2,3}
//    {3,4,5,1,2}
    public static int timesArrRotated(int[] arr){
        int s=0;
        int e=arr.length-1;
        int mini=Integer.MAX_VALUE;
        int min_i=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[s]<=arr[e]){
                min_i=s;
                mini=arr[s];
                break;
            }
            else {
                if (arr[s]<=arr[mid]){
                    if (arr[s]<mini){
                        min_i=s;
                        mini=arr[s];
                    }
                    s=mid+1;
                }else {
                    if (arr[mid]<mini){
                        min_i=mid;
                        mini=arr[mid];
                    }
                    e=mid-1;
                }
            }
        }
        return min_i;
    }

//    Question ==> Search Single Element in a sorted array

    public static int singleElement(int[] arr){
        int xor=0;
        for (int n:arr) {
            xor=xor^n;
        }
        return xor;
    }

//    Question ===> Peak element in Array

    public static int findPeak(int[] arr){
        int n=arr.length;
        if (n==1){
            return 0;
        }
        if (arr[0]>arr[1]){
            return 0;
        }
        if (arr[n-1]>arr[n-2]){
            return n-1;
        }
        int s=1;
        int e=n-2;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (arr[mid]>arr[mid-1]){
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return -1;
    }

    //    Question ===> Finding Sqrt of a number using Binary Search

    public static int findSqrt(int n){
        int sqrt=0;
        int s=1;
        int e=n;
        while (s<=e){
            int mid=s+(e-s);
            if (mid*mid<=n){
                sqrt=mid;
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return sqrt;
    }

//    Question ==> Nth Root of a Number using Binary Search

    public static int nthRoot(int n, int m){
        int s=1;
        int e=m;
        while (s<=e){
            int mid=s+(e-s)/2;
            if ((Math.pow(mid,n))==m){
                return mid;
            } else if ((Math.pow(mid,n))<m) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return -1;
    }

//    Question ==> Koko Eating Bananas

    public static int minBananas(int[] pile, int h){
        long s=1;
        long e=maxOfPile(pile);
        while (s<=e){
            long mid=s+(e-s)/2;
            long totalh = calculateHours(pile,mid);
            if (totalh<=h){
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return (int) s;
    }

    public static int maxOfPile(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int n:arr) {
            if (n>max){
                max=n;
            }
        }
        return max;
    }

    public static long calculateHours(int[] arr, long hourly){
        long total=0;
        for (int n:arr) {
            total+= Math.ceilDiv(n,hourly);
        }
        return total;
    }

//    Question ===> Minimum days to make M bouquets

//    Question ===> Find the Smallest Divisor Given a Threshold

    public static int smallestPositiveDivisor(int[] arr, int limit){
        int s=1;
        int e=findMax(arr);
        while (s<=e){
            int mid=s+(e-s)/2;
            int sum=calculateSum(arr,mid);
            if (sum<=limit){
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return s;
    }
    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int n:arr) {
            if (n>max){
                max=n;
            }
        }
        return max;
    }
    public static int calculateSum(int[] arr, int d){
        int sum=0;
        for (int n:arr) {
            sum+=Math.ceilDiv(n,d);
        }
        return sum;
    }

//    Question ===> Capacity to Ship Packages within D Days

    public static int capToShip(int[] arr, int d){
        int s=findMax(arr);
        int e=sum(arr);
        while (s<=e){
            int mid=s+(e-s)/2;
            int days=findDays(arr,mid);
            if (days<=d){
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return s;
    }
    public static int findDays(int[] weights, int cap){
        int day=1;
        int load=0;
        for (int w:weights) {
            if (load+w>cap){
                day=day+1;
                load=w;
            }else {
                load+=w;
            }
        }
        return day;
    }
    public static int sum(int[] arr){
        int sum=0;
        for (int n:arr) {
            sum+=n;
        }
        return sum;
    }

//    Question ==> Kth Missing Positive Number

    public static int findKthMissingNumber(int[] arr, int k){
        int s=1;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            int missing_num=arr[mid]-(mid+1);
            if (missing_num<k){
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return k+e+1;
    }

//    ------------------------------------------ BS on 2D Arrays---------------------------------------------------------------

//    Find the row with maximum number of 1's

    public static int findRowWithMax1s(int[][] grid, int n, int m){
        int max=-1;
        int indx=-1;
        for (int i = 0; i < n; i++) {
            int fa = findFirstOccurance(grid[i],1);
            int cnt_1=m-fa;
            if (cnt_1>max && cnt_1>0){
                max=cnt_1;
                indx=i;
            }
        }

        return indx;
    }
    public static int findFirstOccurance(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==k){
                ans= mid;
                e=mid-1;
            } else if (arr[mid]<k) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return ans;
    }

//    Question ==> Search in a sorted 2D matrix

    public static boolean soretd2DMatrix(int[][] mat, int target, int n, int m){
        int s=0;
        int e=n*m-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            int row=mid/m;
            int col=mid%m;
            if (mat[row][col]==target){
                return true;
            }else if (mat[row][col]>target) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return false;
    }
//     Question ==> Search in a row and column-wise sorted matrix
//    mat={
//        {1,4,7,11,15},
//        {2,5,8,12,19},
//        {3,6,9,16,22},
//        {10,13,14,17,24},
//        {18,21,23,26,30}
//    };
    public static boolean sorted2DMatrix2(int[][] mat, int target){

        for (int i = 0; i < mat.length; i++) {
             if (binarySearch(mat[i],target)){
                 return binarySearch(mat[i], target);
             }else {
                 continue;
             }
        }
        return false;
    }
    public static boolean binarySearch(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                return true;
            } else if (arr[mid]>target) {
                e=mid-1;
            }else {
                s=mid+1;
            }
        }
        return false;
    }

//    optimal approach

    public static boolean optimalSorted2DMatrix2(int[][] mat, int target){
        int n=mat.length;
        int m=mat[0].length;
        int row=0;
        int col=m-1;
        while (row<n && col>=0){
            if (mat[row][col]==target){
                return true;
            } else if (mat[row][col]>target) {
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
