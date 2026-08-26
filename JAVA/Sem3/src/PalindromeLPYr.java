//write a program to find all the palindrome leap years in a range between y1 and y2 where y1>y2 do not use constructure
import java.util.ArrayList;
public class PalindromeLPYr {
    public static void main(String[] args) {
        ArrayList<Integer> ans = LeapYr(2022,2222);
        System.out.println(ans);
    }
    public static ArrayList<Integer> LeapYr(int y1, int y2){
        ArrayList<Integer> res=new ArrayList<>();
        for (int i = y1; i <=y2 ; i++) {
            if (IsLeapyr(i) && ispalindrome(i)){
                res.add(i);
            }
        }
        return res;
    }
    private static boolean ispalindrome(int year) {
        int original=year;
        int palin=0;
        while (year>0){
            int rem=year%10;
            palin=palin*10+rem;
            year=year/10;
        }
        return palin==original;
    }
    private static boolean IsLeapyr(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
