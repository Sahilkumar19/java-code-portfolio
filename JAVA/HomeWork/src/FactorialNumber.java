import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number:");
        int number=input.nextInt();
        int ans=Factorial(number);
        System.out.println("the factorial of the"+" "+number+" "+"is:"+ans);
    }
    //Recursive program to find the factorial of a number
    static int FactorialOfNumber(int n){
        if (n<2){
            return 1;
        }
        else {
            return n*FactorialOfNumber(n-1);
        }
    }
    //iterative program to find the factorial of a number
    static int Factorial(int n){
        if (n<2){
            return n;
        }
        int facto=1;
        for (int i = 1; i <=n; i++) {
            facto=i*facto;

        }
        return facto;
    }
}
