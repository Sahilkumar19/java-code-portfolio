public class MiddleLeapYear {
    public static void main(String[] args) {
        int lowerLimit = 2000;  // Replace with your desired lower limit
        int upperLimit = 2022;  // Replace with your desired upper limit

        int[] leapYears = findLeapYears(lowerLimit, upperLimit);

        if (leapYears.length > 0) {
            int middleLeapYear = leapYears[leapYears.length / 2];
            System.out.println("Number of leap years: " + leapYears.length);
            System.out.println("Middle leap year: " + middleLeapYear);
        } else {
            System.out.println("No leap years found in the specified range.");
        }
    }
    // Function to find leap years in a given range
    private static int[] findLeapYears(int lowerLimit, int upperLimit) {
        int count = 0;
        for (int year = lowerLimit; year <= upperLimit; year++) {
            if (isLeapYear(year)) {
                count++;
            }
        }
        int[] leapYears = new int[count];
        count = 0;
        for (int year = lowerLimit; year <= upperLimit; year++) {
            if (isLeapYear(year)) {
                leapYears[count++] = year;
            }
        }

        return leapYears;
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

