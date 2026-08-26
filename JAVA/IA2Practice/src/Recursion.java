public class Recursion {
    public static void main(String[] args) {
//        int ans=factorial(5);
//        System.out.println(ans);
//        int ans=nthfibonacci(5);
//        System.out.println(ans);
//        int count = 10; // Or any desired count for the series
//        int n1 = 0, n2 = 1; // Initial values for the series
//        System.out.print(n1 + " " + n2); // Print initial values
//        printfiboseries(count - 2, n1, n2);
//        int num1 = 12;
//        int num2 = 30;
//        int lcm = (num1 > num2) ? findLCM2(num2, num1, num2) : findLCM2(num1, num2, num1);
//        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
//        int lcm = findLCM(num1, num2);
//        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        int n = 20; // Number of terms in the Fibonacci series
        int a = 0, b = 1; // Initial values for the Fibonacci series

        System.out.println("Prime numbers in the Fibonacci series of " + n + " terms:");
        System.out.print("2 "); // 2 is the first prime in the Fibonacci series

        generateFibonacci(n - 1, a, b); // Generate the rest of the series and find primes
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else {
            return n*(factorial(n-1));
        }
    }
    public static int nthfibonacci(int n){
        if (n==0||n==1){
            return n;
        }else {
            return nthfibonacci(n-1)+nthfibonacci(n-2);
        }
    }
    public static void printfiboseries(int count, int n1, int n2){
        if (count > 0){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printfiboseries(count - 1, n1, n2);
        }
    }
    // Function to find the Greatest Common Divisor (GCD) using Euclidean algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // Function to find the Least Common Multiple (LCM) using recursion
    public static int findLCM(int a, int b) {
        // LCM * GCD = Product of two numbers
        // LCM = (Product of two numbers) / GCD
        return (a * b) / findGCD(a, b);
    }
    public static int findLCM2(int a, int b, int multiple) {
        if (multiple % a == 0 && multiple % b == 0) {
            return multiple;
        } else {
            return findLCM2(a, b, multiple + 1);
        }
    }


    // Function to check if a number is prime
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    // Function to generate Fibonacci series and find primes
    public static void generateFibonacci(int n, int a, int b) {
        if (n > 0) {
            int c = a + b;
            if (isPrime(c, 2)) {
                System.out.print(c + " ");
            }
            generateFibonacci(n - 1, b, c);
        }
    }

}
