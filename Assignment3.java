import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        max();
//        min();
//        IsEvenOrOdd();
//        IsEligible();
//        sum();
//        PeriAre();
//        int ans = product();
//        System.out.println(ans);
//        System.out.println("enter number");
//        int num = in.nextInt();
//        boolean ans = IsPrime(num);
//        System.out.println(ans);
//        grades();
//        System.out.println("enter number:");
//        int num = in.nextInt();
//        factorial(num);
//        System.out.println("enter number:");
//        int num = in.nextInt();
//        boolean ans = isPalindrome(num);
//        System.out.println(ans);
//        System.out.print("enter num1:");
//        int num1 = in.nextInt();
//        System.out.print("enter num2:");
//        int num2 = in.nextInt();
//        System.out.print("enter num3:");
//        int num3 = in.nextInt();
//        boolean ans = isTriplet(num1,num2,num3);
//        System.out.println(ans);
//        System.out.print("enter n:");
//        int num = in.nextInt();
//        int ans = sun(num);
//        System.out.println(ans);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        prime(num1 , num2);



    }
    // 1.Define two methods to print the maximum and minimum number respectively among three numbers entered by the user.
    static void max() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1:");
        int num1 = in.nextInt();
        System.out.println("enter num2:");
        int num2 = in.nextInt();
        System.out.println("enter num3");
        int num3 = in.nextInt();
        int maximum = num1;
        if (num2 > num1) {
            maximum = num2;

        }if (num3 > num1) {
            maximum = num3;
        }
        System.out.println("Maximum number is:" + " " + maximum);

    }
    static void min() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1:");
        int num1 = in.nextInt();
        System.out.println("enter num2:");
        int num2 = in.nextInt();
        System.out.println("enter num3");
        int num3 = in.nextInt();
        int minimum = num1;
        if (num2 < num1) {
            minimum = num2;
        }if (num3 < num1) {
            minimum = num3;
        }
        System.out.println("Minimum number is :"+ " "+ minimum);
    }

    // 2. Define a program to find out whether a given number is even or odd.

    static void IsEvenOrOdd() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }

    // 3. A person is eligible to vote if his/her age is greater than or equal to 18.Define a method to find out if he/she is eligible or not.

    static void IsEligible() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of the candidate :");
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("Eligible");

        }else {
            System.out.println("Not Eligible");

        }
    }

    // 4. Write a program to print the sum of two numbers entered by the user defining your own method.

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number1 :");
        int num1 = in.nextInt();
        System.out.println("enter number2 :");
        int num2 = in.nextInt();
        int ans = num1 + num2;
        System.out.println(ans);
    }

    // 5. Write a program to print the circumference and area of a circle of radius entered by the userby defining your own method.

    static void PeriAre() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius:");
        double R = in.nextInt();
        double perimeter = Math.PI * (2 * R);
        double area = Math.PI * (R * R);
        System.out.print("Circumference is:"+" "+ perimeter + " "  +  "Area is:" + " "+area);

    }

    // 6. Define a method that returns the product of two numbers entered by the user.

    static int product() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number1:");
        int num1 = in.nextInt();
        System.out.println("enter number2:");
        int num2 = in.nextInt();
        int ans = num1 * num2;
        return ans;
    }

    // 7. Define a method to find out if a number is prime or not.

    static boolean IsPrime(int num) {
        int c = 2;
        if (num <= 1) {
            return false;
        }
        if (c * c <= num ) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }

    // 8. Write a program that will ask user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below.
    /*
    Marks                Grade
    91-100                AA
    81-90                 AB
    71-80                 BB
    61-70                 BC
    51-60                 CD
    41-50                 DD
    <=40                  Fail
     */

    static void grades() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter marks:");
        int marks = in.nextInt();
        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        }
        if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        }
        if (marks >= 71 && marks <= 80) {
            System.out.println("BB");
        }
        if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        }
        if (marks >= 51 && marks <= 60) {
            System.out.println("CD");
        }
        if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        }
        if (marks <= 40) {
            System.out.println("Fail");
        }

        }

        // 9. Write a number to print the factorial of a number by defining a method named factorial.

    static void factorial(int num1) {
        int fact = 1;
        for (int i = 1; i <=num1; i++) {
            fact = i * fact;


        }
        System.out.println("Factorial of the given number is:" +" "+ fact);
    }

    // 10.Write a function to find if a number is palindrome or not . take number as parameter.

    static boolean isPalindrome(int num) {
        int original = num;
        int number = 0;
        while (num > 0) {
            int rem = num % 10;
            number = 10 * number + rem;
            num = num / 10;
        }
        return number == original;

    }

    // 11. Write a function to check if a given triplet is pythagoras triplet or not.

    static boolean isTriplet(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        }
        if (a * a + c * c == b * b){
            return true;
        }
        if (b * b + c * c == a * a){
            return true;
        }else {
            return false;
        }

    }

    // 12. Write a function that returns all prime numbers between two given numbers.
    static void prime(int num1 , int num2) {
        for (int i = num1; i < num2 + 1; i++) {
            int c = 2;
            if (c * c < num2) {
                if (i % c == 0) {

                }
                c++;
            }else {
                System.out.println(i);
            }


        }
    }

    // 13. Write a function that returns sum of first n natural numbers.

    static int sun(int num){
        int total = 0;
        for (int i = 1; i <= num ; i++) {
            total = total + i;

        }
        return total;
    }



}
