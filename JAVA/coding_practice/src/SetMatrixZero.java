import java.util.Arrays;
public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,0},
                {0,6,9},
                {1,2,3}
        };
        setToZero(matrix);
    }
    public static void setToZero(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i]){
                nullyfyRow(matrix,i);
            }
        }
        for (int j = 0; j < col.length; j++) {
            if (col[j]){
                nullyfyCol(matrix,j);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    private static void nullyfyRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }
    private static void nullyfyCol(int[][] matrix, int i) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][i] = 0;
        }
    }
}
