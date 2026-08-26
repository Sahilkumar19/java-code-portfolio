import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number:");
        int number= input.nextInt();
        boolean ans=IsPalindrome(number);
        System.out.println(ans);

    }
    static boolean IsPalindrome(int n){
        int original=n;
        int num=0;
        while (n>0){
            int rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        return num==original;
    }
}
