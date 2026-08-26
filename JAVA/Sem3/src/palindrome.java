public class palindrome {
    public static void main(String[] args) {
        System.out.println(ispal(121));
    }
    static boolean ispal(int n){
        int original=n;
        int pal=0;
        while (n>0){
            int rem=n%10;
            pal=pal*10+rem;
            n=n/10;
        }
        return pal==original;
    }
}
