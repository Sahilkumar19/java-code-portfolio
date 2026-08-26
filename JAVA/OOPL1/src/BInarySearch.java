public class BInarySearch {
    public static void main(String[] args) {
        int[] arr = {3,3,6,7,8,8,9,9,9,9,9,9,9,9,90,890,897,7890};
        int target=897;
//        int ans=CielingOfArray(arr,target);
//        int ans=SearchInInfiniteArray(arr,target);
        int ans=findRange(arr,target);
        System.out.println(ans);
    }
    static int CielingOfArray(int[] array,int target){
        int s=0;
        int e=array.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(array[mid]>target){
                e=mid-1;
            } else if (array[mid]<target) {
                s=mid+1;

            }else {
                return mid;
            }
        }
        return s;
    }
    static int SearchInInfiniteArray(int[] arr,int target){
        int s=0;
        int e=1;
        while (target>arr[e]){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return HelperBInarySearch(arr,target,s,e);
    }
    static int HelperBInarySearch(int arr[],int target, int s, int e){
        int start=s;
        int end=e;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;

            } else if (arr[mid]<target) {
                start=mid+1;

            }
            else {
                return mid;
            }
        }
        return -1;
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

