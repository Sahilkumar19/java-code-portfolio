public class Algorithms {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 13};
        int target = 13;
//        search obj1 = new search();
//        obj1.linearSearch(arr, target);
        search obj1=new search();
        int ans=obj1.BinarySearch(arr,target);
        System.out.println(ans);
    }
}

class search {
    public void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public int BinarySearch(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=(s+e)/2;
            if (arr[mid]>target){
                e=mid-1;
            }if (arr[mid]<target) {
                s=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

