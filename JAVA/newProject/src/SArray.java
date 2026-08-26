import java.util.*;

public class SArray {
    public static void main(String[] args) {
        //    {1,2,3,4,5}==>{3,4,5,1,2}
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printSpiralTraversal(matrix);
//        System.out.println(Arrays.deepToString(matrix));
//        int[] arr = {1,0,1,2};
//        System.out.println(LCS(arr));
//        System.out.println(printLeaders(arr));
//        int[] ans = alternateElements(arr, 4);
//        System.out.println(Arrays.toString(ans));
//        int ans = buyAndSellStocks(arr);
//        System.out.println(ans);
//        ArrayList<Integer> ans = printArray(arr);
//        System.out.println(ans);
//        int ans = maxSubArraySum(arr);
//        System.out.println(ans);
//        int ans = findMajorityElement(arr);
//        System.out.println(ans);
//        int[] ans = sortArrayOf012(arr);
//        System.out.println(Arrays.toString(ans));
//        boolean ans = checkArrayIsSortedOrNot(arr);
//        System.out.println(ans);
//        int[] ans = sortArrayOf012(arr);
//        System.out.println(Arrays.toString(ans));
//        int target = 4;
//        int[] ans = twoSum(arr, target);
//        System.out.println(Arrays.toString(ans));
//        int k =6;
//        int ans = longestSubArray(arr,k);
//        System.out.println(ans);
//        int ans = maxConsecutiveOnes(arr);
//        int ans = onceOccurance(arr);
//        System.out.println(ans);
//        int n = 7;
//        int ans = findMissingNumber(arr,n);
//        System.out.println(ans);
//        int[] sortedArray = {1,2,2,2,3,3,3};
//        int ans = findLargest(arr);
//        System.out.println(ans);
//        int ans = findSecondLargest(arr);
//        System.out.println(ans);
//        boolean ans = checkArrayIsSortedOrNot(sortedArray);
//        System.out.println(ans);
//        int ans = removeDuplicate(sortedArray);
//        System.out.println(ans);
//        rotateArray(arr);
//        System.out.println(Arrays.toString(arr));
//        rotateArrayBydPlacesTowardsLeft(arr,2);
//        rotateArrayBydPlacesTowardsRight(arr,2);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
//        int[] ans = moveZeroToEnd(arr);
//        System.out.println(Arrays.toString(ans));
//        int ans = linearSearch(arr,3);
//        System.out.println(ans);
//        int[] arr1 = {1,2,3,3,4,5,5};
//        int[] arr2 = {1,2,3,4,6};
//        List<Integer> ans = unionOfTwoSortedArray(arr1,arr2);
//        System.out.println(ans);
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,4,5,6};
//        List<Integer> ans = findIntersectionOfSortedArray(arr1, arr2);
//        System.out.println(ans);
    }
// 1. given an array find the largest number in the array
    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr){
            if (num  > largest){
                largest = num;
            }
        }
        return largest;
    }

//    2. given an array find the second largest element in the array
//    approach : find the largest one and store it in a variable and then check for the element that is largest but not equal to the
//    largest number
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int n : arr){
            if(n > largest){
                largest = n;
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for(int n : arr){
            if (n  > secondLargest && n != largest){
                secondLargest = n;
            }
        }
        return secondLargest;
    }

    //    {0,1,3,4,8}
//    check if an array is sorted or not:
//    1. approach:
    public static boolean checkArrayIsSortedOrNot(int[] arr) {
//        int s =0;//0,1,
//        int e = arr.length;//5
//        while (s<e){
//            if (s< arr.length-1 && arr[s]<=arr[s+1]){
//                s=s+1;
//            } else if (s==arr.length-1) {
//                return true;
//            }else {
//                return false;
//            }
//        }
//        return true;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    //    {1,2,2,3,4,4}
    // number of unique elements in the array
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void rotateArray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            if (i == arr.length - 1) {
                arr[i] = temp;
            }
        }
    }

    //    {1,2,3,4,5}==>{3,4,5,1,2}
//    {1,2,3,4,5}==>{2,1,5,4,3}==>{3,4,5,1,2}
    public static void rotateArrayBydPlacesTowardsLeft(int[] arr, int d) {
//        1. brute force taking O(d) extra space
        //putting all the elements till d in a temp array
//        int[] temp = new int[d];
//        for (int i = 0; i < d; i++) {
//            temp[i]=arr[i];
//        }
        // shifting the elements towards the left
//        for (int i = d; i < arr.length; i++) {
//            arr[i-d]=arr[i];
//        }
        // putting back the elements from temp to the array
//        int j=0;
//        for (int i = arr.length-d; i < arr.length; i++) {
//            arr[i]=temp[j];
//            j++;
//        }


//        2. optimal approach with no extra space

//        {1,2,3,4,5}==>{2,1,5,4,3}==>{3,4,5,1,2}

        d = d % arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    //    1. brute force=> {1,2,3,4,5}==>{1,2,3,.,.}==>{.,.,1,2,3} (temp array will be {4,5}) put these in the front of the array resulting ==> {4,5,1,2,3}
//    2. optimal=> {1,2,3,4,5}==>{1,2,3,5,4}==>{3,2,1,5,4}==>{4,5,1,2,3}
//    {-1,-100,3,99}
    public static void rotateArrayBydPlacesTowardsRight(int[] arr, int d) {
//        1. brute force
        int[] temp = new int[d];
        // storing the d elements in the temp array
        int j = 0;
        for (int i = arr.length - d; i < arr.length; i++) {
            temp[j] = arr[i];
            j++;
        }
        // shifting the elements towards the right
        for (int i = d; i >= 0; i--) {
            arr[i + d] = arr[i];
        }
        //putting the elements from the temp in front of the array so the eventually(other elements pushed towards the right)
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    public static void reverseArray(int[] arr, int s, int e) {
        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    //   arr==> {0,1,0,3,12} ==> 5
//    another array==> {1,3,12,0,0} ==> 5
//    using another array we are taking O(n) extra space
//    in second approach we are not using any extra space
    public static int[] moveZeroToEnd(int[] arr) {
//        int n = arr.length;
//        int[] anotherArray = new int[n];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return arr;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //    arr1 = {1,2,3,3,4,5,5};
//    arr2 = {1,2,3,4,6}
//    result = {1,2,3,4,5,6}
    public static List<Integer> unionOfTwoSortedArray(int[] arr1, int[] arr2) {
//        1. brute force taking O(n) time and O(n) space
//        HashSet<Integer> set = new HashSet<>();
//        for (int n1 : arr1) {
//            set.add(n1);
//        }
//        for (int n2 : arr2) {
//            set.add(n2);
//        }
//        int n = set.size();
//        int[] result = new int[n];
//        int i = 0;
//        for (int e : set) {
//            result[i] = e;
//            i++;
//        }
//        return result;

//        2. optimal approach
//    arr1 = {1,2,3,3,4,5,5};
//    arr2 = {1,2,3,4,6}
//    result = {1,2,3,4,5,6}

        List<Integer> result = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr1[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }

    //    arr1 = {1,2,3,4}
//    arr2 = {1,2,4,5}
//    ans = {1,2,4}
//    1. brute force approach
    public static List<Integer> findIntersectionOfSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> result = new ArrayList<>();
//        int[] visited = new int[n2];
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < n2; j++) {
//                if (arr1[i] == arr2[j] && visited[i] == 0){
//                    result.add(arr1[i]);
//                    visited[i]=1;
//                }
//            }
//        }

        //    2. optimal approach
        //    arr1 = {1,2,3,4}
//            arr2 = {1,2,4,5}
//            ans = {1,2,4}
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }

    //    {1,2,4,5} , n = 5, result = 3
    public static int findMissingNumber(int[] arr, int n) {
//        1. approach sum formula of n numbers ===> n*(n+1)/2
//        int totalSum = (n*(n + 1))/2;
//        int arraySum = 0;
//        for (int num: arr) {
//            arraySum += num;
//        }
//        int missingNumber = totalSum - arraySum;
//        return missingNumber;

        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ n;
        return xor1 ^ xor2;
    }

    //    arr = {0,1,1,0,0,1,1,1,0,1,1}===> 3
    public static int maxConsecutiveOnes(int[] arr) {
        int max = 0;
        int curMax = 0;
        for (int n : arr) {
            if (n == 1) {
                curMax++;
                max = Math.max(curMax, max);
            } else {
                curMax = 0;
            }
        }
        return max;
    }

    public static int onceOccurance(int[] arr) {
        int xor = 0;
        for (int n : arr) {
            xor = xor ^ n;
        }
        return xor;
    }

    //    question - logngest subarray with sum k (positive)
//    {1,2,3,1,1,1,1,4,2,3} , k = 3, result ==>3 {1,1,1}
    public static int longestSubArray(int[] arr, int k) {
        int max = 0;
        int curr = 0;
        int sum = 0;
        for (int n : arr) {
            sum += n;
            if (sum <= k) {
                curr++;
                max = Math.max(curr, max);
            } else {
                sum = 0;
                curr = 0;
            }
        }
        return max;
    }

    //    problem => two sum
//    {1,3,4,6,5,8,2}, target = 14 , result = true
//    ----------------------------------------------------------------------------Meadium----------------------------------------------------------------------------------------
    public static int[] twoSum(int[] arr, int target) {
//        1. brute force using two loops
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]+arr[j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;

//        2. using extra space with O(n)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int differ = target - arr[i];
            if (hm.containsKey(differ)) {
                return new int[]{i, hm.get(differ)};
            }
            hm.put(arr[i], i);
        }
//        for (int n :arr) {
//            int diff = target - n;
//            if (hm.containsKey(diff)){
//                return true;
//            }
//        }
        return new int[]{};
    }

//    question ==> sort an array 0s, 1s and 2s
//    array ==> {0,1,2,0,1,2,2,0,0,0,1,0,1}


    public static int[] sortArrayOf012(int[] arr) {
//        1. approach just sort the array
//        int n = arr.length;
//        for (int i = 0; i <= n-2 ; i++) {
//            int mini = i;
//            for (int j = i; j <= n-1; j++) {
//                if (arr[j]<arr[mini]){
//                    mini = j;
//                }
//            }
//            swap(arr,mini,i);
//        }
//        return arr;

//         better
//        int cnt0 = 0;
//        int cnt1 = 0;
//        int cnt2 = 0;
//        for (int n:arr) {
//            if (n == 0){
//                cnt0++;
//            } else if (n == 1) {
//                cnt1++;
//            }else {
//                cnt2++;
//            }
//        }
//        for (int i = 0; i < cnt0; i++) {
//            arr[i] =0;
//        }
//        for (int i = cnt0; i < cnt0+cnt1; i++) {
//            arr[i] =1;
//        }
//        for (int i = cnt0+cnt1; i < arr.length; i++) {
//            arr[i]=2;
//        }
//        return arr;

//        optimal

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // question find the majority element in the array (that occurs >N/2 times in the array)
//    arr=2,2,1,1,1,2,2
    public static int findMajorityElement(int[] arr) {

//        brute forec
//        int N = arr.length;
//        int key = 0;
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (hm.containsKey(arr[i])){
//                hm.put(arr[i], hm.get(arr[i])+1);
//            }
//            else {
//                hm.put(arr[i],1);
//            }
//        }
//        for (int k: hm.keySet()) {
//            if (hm.get(k)>N/2){
//                return k;
//            }
//        }
//        return 0;

//        optimal

        int count = 0;
        int candidate = 0;
        for (int n : arr) {
            if (count == 0) {
                candidate = n;
            } else if (n == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    // question = kadane's algo maximum subarray sum
    public static int maxSubArraySum(int[] arr) {
        int max = arr[0];
        int sum = 0;
        for (int n : arr) {
            sum += n;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

//    question ==> print max subarray modified version of the above

//    arr = {-2,1,-3,4,-1,2,1,-5,4}

    public static ArrayList<Integer> printArray(int[] arr) {
        int max = arr[0];
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            res.add(arr[i]);
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
                res.removeAll(res);
            }
        }
        return res;
    }

    //    question => buy and sell stocks
//    prices={7,1,5,3,6,4}
    public static int buyAndSellStocks(int[] arr) {
//        1.brute force taking O(n^2) time
//        int maxProfit = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                maxProfit = Math.max(maxProfit,arr[j]-arr[i]);
//            }
//        }
//        return maxProfit;

//        optimal or better approach

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            min = Math.min(n, min);
            maxProfit = Math.max(maxProfit, n - min);
        }
        return maxProfit;
    }

//    question => rearrange elements by sign
//    arr[] = {1,2,-4,-5}, N = 4
//    Output:
//            1 -4 2 -5

    public static int[] alternateElements(int[] arr, int n) {
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg[j] = arr[i];
                j++;
            } else {
                pos[k] = arr[i];
                k++;
            }
        }
        int[] res = new int[n];
        int i = 0;
        int l = 0;
        int m = 0;
        while (i < n) {
            res[i] = pos[l];
            res[i + 1] = neg[m];
            i += 2;
            l++;
            m++;
        }
        return res;
    }

//    question - find next permutation
//    {2,1,3}==>{2,3,1}

    //    question - leader in an array
//    arr={4, 7, 1, 0}
//    ans=7 1 0
    public static ArrayList<Integer> printLeaders(int[] arr) {
//        1. brute force approach

        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            int numToCheck=i+1;
//            int curr =0;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]>arr[j]){
//                    curr++;
//                }else {
//                    break;
//                }
//            }
//            if (curr==arr.length-numToCheck){
//                ans.add(arr[i]);
//            }
//        }
//        return ans;
        //    2. better or optimal

        int max = arr[arr.length - 1];
        ans.add(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }

//    Question - Longest consecutive sequence

    public static int LCS(int[] arr) {
//        1. using brute force ....sorting the array
        for (int i = 0; i <= arr.length - 2; i++) {
            int mini = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            swapping(arr, mini, i);
        }
//        return arr;
//        {1,2,3,4,100,200}
//        {0,1,1,2}
        int max = 1;
        int curr = 0;
        int lastSmaller = Integer.MIN_VALUE;
//        int j=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {
                curr++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                curr = 1;
                lastSmaller = arr[i];
            }
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void swapping(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    Question - set matrix to zero
//    matrix=[[1,1,1],
//            [1,-1,1],
//            [1,1,1]]

    //    {{0,1}}
//    [[0],
//    [1]]
    public static int[][] setMatrixZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    setzero(i, j, matrix);
                }
            }
        }
        return matrix;
    }

    //    matrix=[[1,1,1],
//                [1,-1,1],
//                [1,1,1]]
    public static void setzero(int row, int col, int[][] matrix) {
//        make row zero
        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[row][i] = 0;
        }

//        make column zero
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

//    Question ==> Rotate Image by 90 degree

//    concept ==> make each row corresponding column then reverse each row
//    matrix = {{1,2,3},{4,5,6},{7,8,9}}

    public static void rotateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            reverseRow(matrix[i]);
        }
    }

    //    [[1, 2, 3], [2, 5, 6], [3, 6, 9]]
    public static void reverseRow(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int n = arr.length / 2;
        while (l <= n) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

//    Question ===> Spiral Traversal of Matrix

//    matrix = {{1,2,3},
//              {4,5,6},
//              {7,8,9}}
//            1,2,3,6,9,8,7,4,5

    public static void printSpiralTraversal(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int right = m-1;
        int left = 0;
        int bottom = n-1;
        ArrayList<Integer> list = new ArrayList<>();

        while (top<=bottom && left<=right){
            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top<=bottom){
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left<=right){
                for (int i = bottom; i >=top ; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

//    Question ==> Count Subarray sum Equals K
//    {3, 1, 2, 4}, k = 6 , ans => 2

//    public static int countSubArray(int[] arr, int k){
//        int count=0;
//        int sum=0;
//        for (int n:arr) {
//            sum+=n;
//            if (sum==k){
//                count++;
//                sum=0;
//            }
//        }
//    }
}
