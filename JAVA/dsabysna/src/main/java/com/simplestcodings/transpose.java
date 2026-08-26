package com.simplestcodings;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix={ { 1, 2 }, { 3, 4 } };
        matrixtrans(matrix);
//        System.out.println(3/2);
    }
    public static void matrixtrans(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }
}
