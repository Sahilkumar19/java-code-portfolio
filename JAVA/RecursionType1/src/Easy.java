public class Easy {
    public static void main(String[] args) {
        int n = 5;
        num2(n);
    }
    // print number from 5 to 1
    static void num(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        num(n-1);
    }

    // first all the calls store in the stack then it will reversely print the each value till 5
    static void num2(int n) {
        if (n == 0) {
            return;
        }
        num2(n-1);
        System.out.println(n);

    }
}
