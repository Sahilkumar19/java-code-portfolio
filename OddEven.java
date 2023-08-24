public class OddEven {
    public static void main(String[] args) {
        int n = 65;
        System.out.println(isOdd(n));
    }
    // for odd it return true and false for even
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
