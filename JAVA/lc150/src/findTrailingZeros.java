import java.util.HashMap;

public class findTrailingZeros {
    public static void main(String[] args) {
//        int ans = tralingZeros(13);
//        System.out.println(ans);
//        System.out.println(f);
//        System.out.println(25/5);
//        System.out.println(2^10);
//        double ans  = calculatePower(2.0000,10);
//        System.out.println(ans);
        int[] arr = {6,5,5};
//        int ans = removeVal(arr,3);
//        System.out.println(ans);
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int tralingZeros(int n){
        int count=0;
        while (n>0){
            int tem=n/5;
            count+=tem;
            n=tem;
        }
        return count;
    }
    public static double calculatePower(double x, int n){
        double result = x;
        for (int i = 1; i < n; i++) {
            result=result*x;
        }
        return result;
    }
    public static int removeVal(int[] arr, int val){
        int countVal=0;
        for (int num:arr) {
            if (num!=val){
                arr[countVal++]=num;//post increment
            }
        }
        return countVal;
    }
    public static int majorityElement(int[] arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int num:arr) {
//            if (map.containsKey(num)){
//                map.put(num,map.get(num)+1);
//            }else {
//                map.put(num,1);
//            }
//        }
//        for (int num:arr) {
//            int val=map.get(num);
//            if (val>arr.length/2){
//                return num;
//            }
//        }
//        return 0;

        int count=0;
        int candidate=-56;
        for (int num:arr) {
            if (count==0){
                candidate=num;
//                count++;
            }if (num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
