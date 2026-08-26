public class first {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1};
        int res=findMissingNumber(arr);
        System.out.println(res);

    }
    public static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = 0;
        for (int num:arr) {
            sum+=num;
        }
        int total = n*(n+1)/2;
        return total-sum;

    }
//    public static boolean checkRotated(String a, String b){
////        HashMap<Character,Integer> hm = new HashMap<>();
////        for (char c:a.toCharArray()) {
////            hm.put()
////        }
//        String r = "";
//        for (int i = 0; i < a.length(); i++) {
//
//        }
//    }
}
