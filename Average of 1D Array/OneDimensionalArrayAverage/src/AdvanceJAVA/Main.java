package AdvanceJAVA;

import java.util.Scanner;

public class Main {

    public static void ArraySum(int[] array) {
        double sum = 0;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        sum = sum/5;
        System.out.println("The Average of the elements in the Array that you have made is ::" + sum);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Array ::");
        size = input.nextInt();
        System.out.println("Now enter the elements of the Array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        ArraySum(array);
    }
}