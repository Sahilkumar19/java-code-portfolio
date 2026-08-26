public class InfiniteArraySearch {
    public static void main(String[] args) {

    }
    static int findRange(int[] arr, int target){
        // Initially we start with a box size of length 2
        int start = 0;
        int end = 1;
        /*
        We go on increasing the size of the search box until we find a value of end which if greater than or equal to target
        Here we use try-catch block to handle case where the calculated 'end' exceeds arr.length - 1
        */
        try {
            while(arr[end] < target){
                int tempStart = end + 1;
                end = end + (end - start + 1);
                start = tempStart;
            }
        }
        catch(Exception e) {
            //  Block of code to handle errors
            end = end - 1;
        }

        // Calling the binary search method once we find the range
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int [] arr, int target, int start, int end){
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}

