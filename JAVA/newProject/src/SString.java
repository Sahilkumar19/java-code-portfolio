import java.util.Arrays;
import java.util.Stack;

public class SString {
    public static void main(String[] args) {
        String s="1234";
        System.out.println(largestOddNumber(s));
    }
//    Question ===> Reverse Words in a String

    public static String reverseWords(String str){
        String[] strArr = str.trim().split("\\s+");
        Stack<String> stack = new Stack<>();
        for (String w:strArr) {
            stack.push(w);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
            if (!stack.isEmpty()){
                ans.append(" ");
            }
        }
        return ans.toString();
    }

//    Question ===> 1021. Remove Outermost Parentheses
//for example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

    public static String reverseOutermostParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='('){
                if (stack.size()>0){
                    sb.append(str.charAt(i));
                }stack.push(str.charAt(i));
            }else {
                stack.pop();
                if (stack.size()>0){
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.toString();
    }

//    Question ===>  Largest Odd Number in String
//"35427"
    //"52", "1234"
    public static String largestOddNumber(String num){
        for (int i = num.length()-1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i))%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
