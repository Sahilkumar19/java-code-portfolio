import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        // Traditional Pyramid
        System.out.println("Traditional Pyramid:");
        printTraditionalPyramid(numRows);

        // Reverse Pyramid
        System.out.println("\nReverse Pyramid:");
        printReversePyramid(numRows);

        scanner.close();
    }

    // Function to print Traditional Pyramid
    private static void printTraditionalPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print '*' symbols
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Function to print Reverse Pyramid
    private static void printReversePyramid(int numRows) {
        for (int i = numRows; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print '*' symbols
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

