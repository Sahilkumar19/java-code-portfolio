import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter string to check:");
        String str = input.next();
        boolean ans=IsPalindrome(str);
        System.out.println(ans);

    }
    static boolean IsPalindrome(String name){
//        String original=name;
//        String ans="";
        for (int i = 0; i < name.length()/2; i++) {
            if (name.charAt(i)==name.charAt(name.length()-1-i)){
                return true;
            }
        }
        return false;
    }
}
