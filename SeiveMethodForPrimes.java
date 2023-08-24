public class SeiveMethodForPrimes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n + 1];
        seieve(n , arr);
    }
    // all the values in the array are initially false.
    // false in array means number is prime
    // complexity = O(n(log(logn)))
    static void seieve(int n , boolean[] arr) {
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }

        }
        for (int i = 2; i <=n ; i++) {
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }

    }
}
