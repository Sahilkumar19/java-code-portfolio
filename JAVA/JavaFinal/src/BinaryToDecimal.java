public class BinaryToDecimal {
    public static void main(String[] args) {
        String ans=DecToBin(4);
//        System.out.println(ans);
        BinToDec(100);
    }
    public static String DecToBin(int n){
        StringBuilder Binary=new StringBuilder();
        while (n>0){
            int rem=n%2;
            Binary.insert(0,rem);
            n=n/2;
        }
        return Binary.toString();
    }
    public static void BinToDec(int n){
        int dec=0;
        int rem=0;
        int i=0;
        while (n!=0){
            rem=n%10;
            dec=dec+rem*(int) Math.pow(2,i);
            i++;
            n=n/10;
        }
        System.out.println(dec);
    }
}
