public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n) {
        // here we are assuming that n is non-negative
        if (n <= 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}
