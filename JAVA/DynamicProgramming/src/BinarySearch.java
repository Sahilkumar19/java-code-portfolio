public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target=23;
        int s=0;
        int e=arr.length;
        int ans=BSR(arr,s,e,target);
        System.out.println(ans);
    }
    public static int BS(int[] arr,int target){
        int s=0;
        int e=arr.length;
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
    public static int BSR(int[] arr,int s,int e, int target){
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                return BSR(arr,s,mid-1,target);
            }else {
                return BSR(arr,mid+1,e,target);
            }
        }
        return -1;
    }
}
