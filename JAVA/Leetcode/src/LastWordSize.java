public class LastWordSize {
    public static void main(String[] args) {
       String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int cnt=0;
        for (int i = s.length(); i >0; i--) {
            if (s.charAt(i)!=' '){
                cnt++;
            }else {
                break;
            }
        }
        return cnt;
    }
}
