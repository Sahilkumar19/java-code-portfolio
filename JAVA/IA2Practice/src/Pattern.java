/*
N
  A
    M
      E
    M
  A
N

print the above pattern
 */
public class Pattern {
    public static void main(String[] args) {
        printDiamondPattern("NAME");
    }

    public static void printDiamondPattern(String text) {
        int size = text.length();

        for (int row = 0; row < size; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            System.out.println(text.charAt(row));
        }
        for (int row = size - 2; row >= 0; row--) {
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            System.out.println(text.charAt(row));
        }
    }

    /*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
     */
    static void pattern1(int num) {
        for (int row = 1; row <= num ; row++) {
            // for every row run the column
            for (int col = 1; col <= num ; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a new line
            System.out.println();

        }
    }
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    public static void pattern2(int num){
        for (int row = 1; row <=num ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void pattern3(int num){
        for (int row = 1; row <=num ; row++) {
            for (int col = 1; col <=num+1-row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    public static void pattern4(int num){
        for (int row = 1; row <=num; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void pattern5(int num){
        for (int row = 0; row <=2*num ; row++) {
            int totaocolinrow;
            if (row>num){
                totaocolinrow=2*num-row;
            }
            else{
                totaocolinrow=row;
            }
            for (int col = 0; col < totaocolinrow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    /*

     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

     */
    public static void pattern6(int num){
        for (int row = 0; row < 2*num; row++) {
            int totalcolinrow;
            if (row>num){
                totalcolinrow=2*num-row;
            }else{
                totalcolinrow=row;
            }
            int spaces=num-totalcolinrow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolinrow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
