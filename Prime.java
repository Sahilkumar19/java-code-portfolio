import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number :");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
//        boolean ans = isPrime(n);
//        System.out.println(ans);

    }
    static boolean isPrime(int n){
        // 1 is neither composite nor prime
        if (n < 2) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
