/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperation;



/**
 *
 * @author aashish
 */
public class ArrayOperationHandeler {

    static int sum = 0;
    static int[][] ResultArray;

    public static int[][] AdditionArray(int[][] Array1, int[][] Array2, int row, int column) {
        ResultArray = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ResultArray[i][j] = Array1[i][j] + Array2[i][j];
            }
        }
        return ResultArray;
    }

    public static int[][] DifferenceArray(int[][] Array1, int[][] Array2, int row, int column) {
        ResultArray = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ResultArray[i][j] = Array1[i][j] - Array2[i][j];
            }
        }
        return ResultArray;
    }

    public static int[][] ProductArray(int[][] Array1, int[][] Array2, int row1, int column1, int row2, int column2) {
        ResultArray = new int[row1][column2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < row2; k++) {
                    sum = sum + Array1[i][k] * Array2[k][j];
                }
                ResultArray[i][j] = sum;
                sum = 0;
            }

        }
        return ResultArray;
    }

}
