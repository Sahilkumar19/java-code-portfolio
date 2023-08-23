import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();

        // Q. find the largest of the three numbers.
        // calculator program

//        int large = a;
//        if (b > large) {
//            large = b;
//
//        }if (c > large) {
//            large = c;
//
//        }
//        System.out.println(large);

        // Q. find nth fibonacci numbers.
//        int num = input.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count <= num) {
//            int temp = b;
//            b = a + b;
//            a = temp;
//            count += 1;
//        }
//        System.out.println(b);

        //  find the occurrence of particular digit in a given number (counting occurrence).
        int num = input.nextInt();
        System.out.println("please enter digit whose occurrence you want to find :");
        int digit = input.nextInt();
        int count = 0;
        while (0 < num) {
            if (num % 10 == digit) {
                count += 1;
            }
            num = num / 10;
        }
        System.out.println(count);

        // Q. take a number input from the user and print it in reverse order.

//        int num = input.nextInt();
//        int reverse = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            reverse = reverse*10 + rem;
//            num = num / 10;
//
//        }
//        System.out.println(reverse);







    }
}
