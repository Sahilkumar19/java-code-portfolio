import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix_15 {
    public static void main(String[] args) {
        int[][] ans = squareMatrix15();
        printEle(ans);
    }
    public static int[][] squareMatrix15(){
        int[][] sqrmtrx = new int[3][3];
        List<Integer> n = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            n.add(i);
        }
        while (true){
            Collections.shuffle(n);
            int ni = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sqrmtrx[i][j] = n.get(ni);
                    ni+=1;
                }
            }
            if (isSquareMatrix15(sqrmtrx)){
                break;
            }
        }
        return sqrmtrx;
    }
    public static boolean isSquareMatrix15(int[][] sqrmtrx) {
        int[] s = new int[8];

//      putting the sum of elements of each rows in s
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += sqrmtrx[i][j];
            }
            s[i] = sum;
        }
        
//      putting sum of elements of each columns in s
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += sqrmtrx[i][j];
            }
            s[j + 3] = sum;
        }
        
//      putting the sum of elements of both diagonal elements

//      the sum of the main diagonal elements
        for (int i = 0; i < 3; i++) {
            s[6] += sqrmtrx[i][i];
        }

//      the sum of the other than main diagonal elements
        for (int i = 0; i < 3; i++) {
            s[7] += sqrmtrx[i][2 - i];
        }

//      checking whether each number in s is 15 or not
        for (int num : s) {
            if (num != 15){
                return false;
            }
        }
        return true;
    }

//    method to print all the element in desired way
    public static void printEle(int[][] sqmqtrx_15){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+sqmqtrx_15[i][j]+"]"+" ");
            }
            System.out.println();
        }
    }
}