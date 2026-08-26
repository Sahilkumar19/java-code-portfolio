import java.util.ArrayList;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n=17;
        int rem=0;
        ArrayList<Integer> al=new ArrayList<>();
        while (n>=1){
            rem=n%2;
            al.add(rem);
            n=n/2;
        }
        for (int i = al.size()-1; i>=0; i--) {
            System.out.print(al.get(i));
        }
//        String ans=Binary(8);
//        System.out.println(ans);
    }
//    public static String Binary(int n){
//        StringBuilder binary=new StringBuilder();
//        while (n>0){
//            int rem=n%2;
//            binary.insert(0,rem);
//            n=n/2;
//        }
//        return binary.toString();
//    }
}
