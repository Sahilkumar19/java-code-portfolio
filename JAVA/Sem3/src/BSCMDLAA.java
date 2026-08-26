import java.util.Scanner;

public class BSCMDLAA {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        // Check if enough command line arguments are provided
        if (args.length < 1) {
            System.out.println("Usage: java BinarySearch <array>");
            System.exit(1);
        }

        // Parse command line arguments
        int[] array = parseArray(args[0]);

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for target input
        System.out.print("Enter the target: ");
        int target;

        // Validate target input
        while (true) {
            try {
                target = Integer.parseInt(scanner.nextLine());
                break;  // Exit the loop if parsing is successful
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid integer for the target: ");
            }
        }

        // Perform binary search
        int result = binarySearch(array, target);

        // Display the result
        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result + ".");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

        // Close the Scanner
        scanner.close();
    }

    private static int[] parseArray(String input) {
        String[] elements = input.split(",");
        int[] array = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        return array;
    }
}
