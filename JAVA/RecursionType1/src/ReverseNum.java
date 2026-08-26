public class ReverseNum {
    public static void main(String[] args) {
        int n = 656;
        int ans = rev2(n);
        System.out.println(ans);
        System.out.println(isPalindrome(n));
//        System.out.print(rev2(6754));

    }
    // method 1 (basic method)
    static int rev1(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return sum;
    }
    // method 2 using pure recursion (not using any counter(sum=0))
    static int rev2(int n) {
        // calculating number of the digits in the given number
        int digit = (int) (Math.log10(n)) + 1;
         return helper(n , digit);
    }

    static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        else {
            return (int) ((n % 10 * Math.pow(10 , digit - 1)) + helper(n / 10 , digit - 1));
        }
    }

    // check number is palindrome or not
    static boolean isPalindrome(int n) {
        return n == rev2(n);
    }

}
