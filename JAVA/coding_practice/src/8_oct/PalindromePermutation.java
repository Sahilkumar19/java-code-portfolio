import java.util.HashMap;
public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "Tact Coa";
        int a =3;
        str=str.toLowerCase();
        boolean check = checkPalindromePermutation(str);
        System.out.println(check);
    }
    public static boolean checkPalindromePermutation(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c: str.toCharArray()) {
            if (c==' '){
                continue;
            }
            if (!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                hm.replace(c,hm.get(c)+1);
            }
        }
        int count_even_char = 0;
        for (char c: hm.keySet()) {
            if (is_even(hm.get(c))){
            }else {
                count_even_char++;
            }
        }
//        System.out.println(hm);
        return count_even_char<=1;
    }
    private static boolean is_even(int num) {
        return num % 2 == 0;
    }
}
