public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }
    // Here we are using bitwise operator XOR
    // a^1=a compliment , a^0=a , a^a=0
    // Order does not matter here
    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) {
            unique=unique^n;
        }

        return unique;
    }
}
