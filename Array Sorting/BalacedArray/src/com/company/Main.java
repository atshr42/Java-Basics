package com.company;

import java.util.Scanner;

public class Main {

    public int balanced(int[] array) {
        int size = array.length;
        boolean isBalanced = false;
        for (int i = 1; i <= (size-1); i++) {
            if (i % 2 != 0) {
                if (array[i] % 2 != 0.0)
                    isBalanced = true;
                else
                    isBalanced = false;
            } else if (i % 2 == 0) {
                if (array[i] % 2 == 0)
                    isBalanced = true;
                else
                    isBalanced = false;
            }
        }

        if (isBalanced == true)
            return 1;
        else
            return 0;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of your Array\n");
        int size = input.nextInt();
           size = size + 1;
        int[] array = new int[size];

        System.out.println("Enter the elements in your Array");
        for (int i = 1; i <= (size-1); i++) {
            array[i] = input.nextInt();
        }

        Main m = new Main();

        int a = m.balanced(array);
        System.out.println("This output from the function is\n");
        System.out.println(a);
        if (a == 1)
            System.out.println("\nHence,the array is Balanced");
        else
            System.out.println("\nHence,the array doses not  happened to be Balanced ");


    }
}
