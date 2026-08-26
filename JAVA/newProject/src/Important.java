import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Important {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,1,-9,5,4};
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
        int ans = maxSubArraySum(arr);
        System.out.println(ans);
//        int ans = removeDuplicate(arr);
//        System.out.println(ans);
//        int[] ans = twoSum(arr,4);
//        System.out.println(Arrays.toString(ans));
//        LinkedNode head=new LinkedNode(1);
//        head.next=new LinkedNode(2);
//        head.next.next=new LinkedNode(3);
//        LinkedNode ans = reverseList(head);
//        System.out.println(ans.data);

    }
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static int maxSubArraySum(int[] arr){
        int max = arr[0];
        int curSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curSum=curSum+arr[i];
            max=Math.max(max,curSum);
        }
        return max;
    }
    public static int removeDuplicate(int[] arr){
        if (arr.length==0){
            return 0;
        }
        int i=0;
        for (int j=1; j<arr.length; j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static int[] twoSum(int[] arr, int sum){
        HashMap<Integer,Integer> lookup = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i];
            if (lookup.containsKey(target)){
                result[0]=lookup.get(target);;
                result[1]=i;
                return result;
            }else {
                lookup.put(arr[i],i);
            }
        }
        return new int[]{-1, -1};
    }
    // 1->2->3
    public static LinkedNode reverseList(LinkedNode head){
        LinkedNode prev=null;
        LinkedNode curr=head;
        while (curr!=null){
            LinkedNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
class LinkedNode{
    int data;
    LinkedNode next;

    // Constructor
    public LinkedNode(int data) {
        this.data = data;
        this.next = null;
    }
}
