import java.util.Scanner;

//write a program to enter a number through keybord and perform any of the following operations
//binary to decimal
//binary to decimal
//prime or not
//armstrong or not
//leap year or not
//
public class Template {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=in.nextInt();
        if (num==1){
            System.out.print("Calling BinToDec function, enter a number: ");
            int n= in.nextInt();
            BinarytoDecimal(n);
        } else if (num==2) {
            System.out.print("Calling DecToBin function, enter a number: ");
            int n= in.nextInt();
            String ans=DecimaltoBinary(n);
            System.out.println(ans);
        } else if (num==3) {
            System.out.print("Calling IsPrime function, enter a number: ");
            int n= in.nextInt();
            Isprime(n);
        } else if (num==4) {
            System.out.print("Calling function to check armstrong number, enter a number: ");
            int n= in.nextInt();
            boolean ans = Isarmstrong(n);
            System.out.println(ans);
        } else if (num==5) {
            System.out.print("Calling function to leap year, enter a number: ");
            int n= in.nextInt();
            boolean ans = Isleapyr(n);
            System.out.println(ans);
        }
    }

    private static boolean Isleapyr(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static boolean Isarmstrong(int num) {
        int original=num;
        int dgcnt = countdigit(num);
        int armsnum=0;
        while (num>0){
            int rem=num%10;
            armsnum+=Math.pow(rem,dgcnt);
            num=num/10;
        }
        return armsnum==original;
    }

    private static int countdigit(int num) {
        int dgcnt=0;
        while (num>0){
            num=num/10;
            dgcnt++;
        }
        return dgcnt;
    }

    private static void Isprime(int num) {
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num%i==0){
                System.out.println("not prime");
            }
        }
        System.out.println("prime");
    }

    public static String DecimaltoBinary(int n){
        StringBuilder Binary=new StringBuilder();
        while (n>0){
            int rem=n%2;
            Binary.insert(0,rem);
            n=n/2;
        }
        return Binary.toString();
    }
    public static void BinarytoDecimal(int n){
        int dec=0;
        int rem=0;
        int i=0;
        while (n!=0){
            rem=n%10;
            dec=dec+rem*(int) Math.pow(2,i);
            i++;
            n=n/10;
        }
        System.out.println(dec);
    }
}
