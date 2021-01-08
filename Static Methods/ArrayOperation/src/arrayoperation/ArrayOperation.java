/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperation;

import java.util.Scanner;

/**
 *
 * @author aashish
 */
public class ArrayOperation extends ArrayOperationHandeler {

    static int row1, column1, row2, column2;
    static String Choice;
    static int[][] ResultantArray, Array1, Array2;

    public static void ArrayValueSetterForAdditionAndSubtraction() {
        Array1 = new int[row1][column1];
        Array2 = new int[row2][column2];
        ResultantArray = new int[row1][column1];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the set of values for First matrix\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                Array1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the set of values for Second matrix\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                Array2[i][j] = input.nextInt();
            }
        }
    }

    public static void ArrayValueSetterForProduct() {
        Array1 = new int[row1][column1];
        Array2 = new int[row2][column2];
        ResultantArray = new int[column1][row2];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the set of values for First matrix\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                Array1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the set of values for Second matrix\n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                Array2[i][j] = input.nextInt();
            }
        }
    }

    public static void DisplayForAdditionAndSubtraction() {

        System.out.println("The set of values of First matrix is\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(Array1[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

        System.out.println("The set of values for Second matrix is\n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(Array2[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

        System.out.println("The set of values for Resultant matrix is\n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(ResultantArray[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

    }
    
     public static void DisplayForProduct() {

        System.out.println("The set of values of First matrix is\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(Array1[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

        System.out.println("The set of values for Second matrix is\n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(Array2[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

        System.out.println("The set of values for Resultant matrix is\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(ResultantArray[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

    }
    
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayOperationHandeler Matrix = new ArrayOperationHandeler();

        System.out.println("Enter the size of the first matrix");
        row1 = input.nextInt();
        column1 = input.nextInt();
        System.out.println("Enter the size of the second array");
        row2 = input.nextInt();
        column2 = input.nextInt();
        System.out.println("Enter the type of operation that you want to perform\n 1) Addition\n 2) Difference\n"
                            + " 3) Product2");
        Choice = input.next();   
        switch (Choice.toLowerCase()) {
            case "addition": {

                if (row1 != row2 || column1 != column2) {
                    System.out.println("For performing the Addition operation the size must be same i.e row and column must be same");
                } else {
                    ArrayValueSetterForAdditionAndSubtraction();
                    ResultantArray = Matrix.AdditionArray(Array1, Array2, row1, column1);
                    DisplayForAdditionAndSubtraction();
                }
                break;
            }
            case "difference": {

                if (row1 != row2 || column1 != column2) {
                    System.out.println("For performing the Difference operation the size must be same i.e row and column must be same");
                } else {
                    ArrayValueSetterForAdditionAndSubtraction();
                    ResultantArray = Matrix.DifferenceArray(Array1, Array2, row1, column1);
                    DisplayForAdditionAndSubtraction();
                }
                break;
            }
            case "product": {
                if (column1 != row2) {
                    System.out.println("Multiplication operation could not be performed on these size of the matrices i.e the column of one matrix must be equal to row of another matrix");
                } else {
                    ArrayValueSetterForProduct();
                    ResultantArray = Matrix.ProductArray(Array1, Array2, row1, column1, row2, column2);
                    DisplayForProduct();
                }
                break;
            }
            default: {

                System.out.println("Please Enter the appropriate type of Choice");

            }

        }

    }

}
