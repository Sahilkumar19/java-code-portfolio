public class CharStram {
    public static void main(String[] args) {
//        skip(" " , "bcaddad");
        String up = "bcaddappled";
        System.out.println(skip2(up));

    }
    // Q. delete all the a's from the string
    // method 1 : passing the both the string (1. which is in the process and 2. which is the original one (up)) in the argument

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') { // char ko '' (single quotes ke andar rakhate h aur string ko ""(double quote ke inside))
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // method 2 : not passing both the str as arg but creating a new string which will be the our answer in the body of the method
    static String skip2(String up) {
        if (up.isEmpty()) {
            return up;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        }
        return ch + skip2(up.substring(1));
    }

//    //Q. skip apple
//    static String skipApple(String up) {
//        if (up.isEmpty()) {
//            return up;
//        }
////        boolean ch = up.startsWith('apple');
////        if (ch) {
//        return skipApple(up.substring(5));
//    }
}


