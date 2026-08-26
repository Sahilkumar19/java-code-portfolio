package com.simplestcodings;

public class diagonaltraversal {
    public static void main(String[] args) {
        System.out.println(7/2);
    }
    public static void printDiagonal(int r, int c, int[][] mat){
        for (int i = 0; i < r+c-1; i++) {
            if (i<c){
                for (int j = 0; j <=i ; j++) {
                    System.out.println(mat[i][j]);
                }

            }
        }
    }
}
