public class SumOfDigits {
    public static void main(String[] args) {
        int n = 567;
        int ans = DigitProd(n);
        System.out.println(ans);
    }
    static int DigitSum(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) + (DigitSum(n/10));

    }

    // same for the product of the digits
    static int DigitProd(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (DigitProd(n/10));

    }
}
