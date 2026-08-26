import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] ans = matrixRotation(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] matrixRotation(int[][] matrix){
        for (int r = 0; r < matrix.length; r++) {
            for (int c = r; c < matrix[r].length; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length/2; c++) {
                int temp = matrix[r][matrix[r].length - 1 - c];
                matrix[r][matrix[r].length - 1 - c] = matrix[r][c];
                matrix[r][c] = temp;
            }
        }
        return matrix;
    }
}
