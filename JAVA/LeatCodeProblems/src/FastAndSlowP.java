import java.util.HashSet;

public class FastAndSlowP {
    public static void main(String[] args) {
        Nodep head = new Nodep(7);
        head.next = new Nodep(2);
        head.next.next = new Nodep(4);
        head.next.next.next = new Nodep(5);
//        head.next.next.next.next = new Nodep(10);
//        boolean ans  = detectCycle(head);
//        System.out.println(ans);
//        boolean ans  = isHappy(7);
//        System.out.println(ans);
        int[] arr = {0,1,2,98};
        boolean ans = isContainsDuplicate(arr);
        System.out.println(ans);

    }
    public static boolean detectCycle(Nodep head){
        Nodep slow = head;
        Nodep fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static boolean isHappy(int n) {
        return isHappyHelper(n, n);
    }

    private static boolean isHappyHelper(int current, int original) {
        int sqrd = helper(current);
        if (sqrd == 1) {
            return true; // Happy number
        }
        if (sqrd == original) {
            return false; // Cycle detected
        }
        return isHappyHelper(sqrd, original); // Recursive call
    }

    public static int helper(int n) {
        int num = 0;
        while (n > 0) {
            int rem = n % 10;
            num += rem * rem;
            n = n / 10;
        }
        return num;
    }
    public static boolean findDuplicate(int[] arr){
        if (arr.length<=1){
            return false;
        }
        int slow=arr[0];
        int fast=arr[0];
        while (true){
            slow=arr[slow];
            fast=arr[arr[fast]];
            if (slow==fast){
                break;
            }
            if (fast>=arr.length || arr[fast]>=arr.length){
                return false;
            }
        }
        slow=arr[0];
        while (slow!=fast){
            slow=arr[slow];
            fast=arr[fast];

        }
        return true;

    }
    public static boolean isContainsDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for (int num:arr) {
            if (seen.contains(num)){
                return true;
            }else {
                seen.add(num);
            }
        }
        return false;
    }
}
