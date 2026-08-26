import java.awt.*;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <=3 ; i++) {
            bb:
            for (int j = 1; j <=3 ; j++) {
                if (i==2&&j==2){
                    break aa;
                }
//                System.out.println(i+" "+j);
            }
        }
//        for (; ;){
//            System.out.println("hjg");
//        }
        int i=1;
        do{
//            System.out.println(i);
            i++;
        }while (i<10);
        int n=10;
        String teropt=(n%2==0)? n+" "+"is an even number": n + "is an odd number";
//        System.out.println(teropt);
        Scanner input=new Scanner(System.in);
        System.out.println("enter year");
        int year=input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                }
                else {
                    System.out.println(year + " is not a leap year.");
                }
            }
            else {
                System.out.println(year + " is a leap year.");
            }
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
