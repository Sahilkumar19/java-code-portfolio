public class StringCompression {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String ans = Compression(str);
        System.out.println(ans);
    }
    public static String Compressionbad(String str){
        String s = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i+1>=str.length() || str.charAt(i) != str.charAt(i+1)){
                s += ""+ str.charAt(i)+count;
                count=0;
            }
        }
        return s.length()<str.length()?s:str;
    }
    public static String Compression(String str){
        StringBuilder s = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i+1>=str.length() || str.charAt(i) != str.charAt(i+1)){
                s.append(str.charAt(i));
                s.append(count);
                count=0;
            }
        }
        return s.length()<str.length()?s.toString():str;
    }
}