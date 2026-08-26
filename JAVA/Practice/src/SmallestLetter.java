public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','d','g','j'};
        char target = 'j';
        char ans = Smallestletter(arr , target);
        System.out.println(ans);
    }
    // find the smallest letter > target
    // same approach as ceiling but here we wil ignore the case of =
    // and also here letter are wrap around means that if arr = {'a','d','g','j'} if target is 'j' then our
    // answer will be a (because there is no element which is greater than the target)
    static char Smallestletter(char[] arr , char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return  arr[start % arr.length];
    }
}
