public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter = {'a' , 'b' , 'd' , 'g' , 'j'};
        char target = 'j';
        char ans = Letter(letter , target);
        System.out.println(ans);



    }
    // find the smallest letter greater than the target or smallest number greater than the target
    static char Letter(char[] letter , char target) {
        int start = 0;
        int end = letter.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letter[mid]) {
                end = mid - 1;

            }else {
                start = mid + 1;
            }

        }
        return  letter[start % letter.length];
    }
}
