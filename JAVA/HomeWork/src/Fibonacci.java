import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number:");
        int number=input.nextInt();
        int ans=FibonacciOfNumber(number);
        System.out.println("the"+" "+ number+" "+"fibonacci number is:"+ " "+ans);

    }
    static int FibonacciOfNumber(int n){
        if(n<2){
            return n;
        }
        else{
            return FibonacciOfNumber(n-1)+FibonacciOfNumber(n-2);
        }
    }

}
