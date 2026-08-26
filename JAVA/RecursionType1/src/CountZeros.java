public class CountZeros {
    public static void main(String[] args) {
        int n = 900000800;
        int c = 0;
        int ans = ZerosCount(n,c);
        System.out.println(ans);
    }
    static int ZerosCount(int n , int c) {
        if (n == 0) {
            return 0;
        }
        else {
            while (n > 0){
                int rem = n % 10;
                if (rem == 0) {
                    ZerosCount(n / 10 , c++);
                }else {
                    ZerosCount(n / 10 , c);
                }
                n = n / 10;
            }
        }
        return c;
    }
}
