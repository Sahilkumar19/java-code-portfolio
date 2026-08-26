public class Subsets {
    public static void main(String[] args) {
//        System.out.println(SubSeq("" , "abc"));
        String p = " ";
        String up = "abc";
        SubSeq(p , up);
    }
    static void SubSeq(String p , String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubSeq(p , up.substring(1));
        SubSeq(p + ch , up.substring(1));
    }
}
