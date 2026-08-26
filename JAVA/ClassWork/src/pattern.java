public class pattern {
    public static void main(String[] args) {
        pat2(4);
    }
    public static void pat(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}