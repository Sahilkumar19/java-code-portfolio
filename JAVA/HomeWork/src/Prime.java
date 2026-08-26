import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int number= input.nextInt();
        boolean ans=IsPrime(number);
        System.out.println(ans);

    }
    static boolean IsPrime(int n){
        int c=2;
        if(n<2){
            return false;
        }
        if(c*c<n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
