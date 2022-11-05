package com.consultadd.exercise4;
//4. Write a Java program to add two matrices of the same size.
public class TwoMatrices {
    public int[][] adding(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for(int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1[i].length; j++){
                int number = matrix1[i][j] + matrix2[i][j];
                result[i][j] = number;
            }
        }
        System.out.println("Result");
        print(result);
        return result;
    }
    public void print(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        TwoMatrices obj = new TwoMatrices();
        int[][] matrix1 ={ {9, 4, 8}, {4, 2, 5}};
        System.out.println("Matrix 1");
        obj.print(matrix1);
        int[][] matrix2 ={ {2, 4, 1}, {8, 6, 3}};
        System.out.println("Matrix 2");
        obj.print(matrix2);
        obj.adding(matrix1, matrix2);
    }
}
