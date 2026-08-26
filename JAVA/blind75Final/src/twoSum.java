import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
    }
    public static int[] TwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
            }
            else {
                map.put(arr[i],i);
            }
        }
        return result;
    }

}
