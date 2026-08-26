import java.util.Scanner;
public class MaxIncConsecutiveatr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = findMaxConsecutiveOrderedSubstring(input);
        System.out.println("Maximum consecutive increasingly ordered substring: " + result);

    }
    public static String findMaxConsecutiveOrderedSubstring(String input) {
        String currentSubstring = String.valueOf(input.charAt(0));
        String maxSubstring = String.valueOf(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) >= input.charAt(i - 1)) {
                currentSubstring += input.charAt(i);
            } else {
                currentSubstring = String.valueOf(input.charAt(i));
            }

            if (currentSubstring.length() > maxSubstring.length()) {
                maxSubstring = currentSubstring;
            }
        }

        return maxSubstring;
    }


}
