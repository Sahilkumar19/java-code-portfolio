public class Main {
    public static void main(String[] args) {


        Pattern30(5);
    }
    static void Pattern1(int num) {
        for (int row = 1; row <= num ; row++) {
            // for every row run the column
            for (int col = 1; col <= num ; col++) {
                System.out.print("* ");

            }
            // when one row is printed we need to add a new line
            System.out.println();

        }
    }
    static void Pattern2(int num) {
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void Pattern3(int num) {
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= num-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int num) {
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int num) {
        for (int row = 0; row <= 2 * num ; row++) {
            int totalcolinrow;
            if (row > num){
                totalcolinrow = 2 * num - row;
            }
            else {
                totalcolinrow = row;
            }
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern28(int num){
        for (int row = 0; row <= 2 * num ; row++) {
            int totalcolinrow;
            if (row > num) {
                totalcolinrow = 2 * num - row;
            }
            else{
                totalcolinrow = row;
            }
            int spaces = num - totalcolinrow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern30(int num) {
        for (int row = 1; row <= num ; row++) {
            for (int spaces = 0; spaces < num - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void Pattern17(int num) {
        for (int row = 1; row <= 2 * num ; row++) {
            int c = row > num ? 2 * num - row : row;
            for (int spaces = 0; spaces < num - c; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void Pattern31(int num) {
        int original = num;
        num = num * 2;
        for (int row = 0; row <= num; row++) {
            for (int col = 0; col <= num; col++) {
                int atEveryIndex = original - Math.min(Math.min(row,col) , Math.min(num-row,num-col));
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();
        }

    }
    /**
     * 1.4 (Print a table) Write a program that displays the following table:
     * a a^2 a^3
     * 1 1 1
     * 2 4 8
     * 3 9 27
     * 4 16 64
     */
    static void pat1(int num){
        for (int row = 1; row <=num; row++) {
            System.out.println(row + " " + row*row + " " + row*row*row);
        }
    }
    /*
    N
      A
        M
          E
        M
      A
    N
     */
//    static void patternIA2()



}