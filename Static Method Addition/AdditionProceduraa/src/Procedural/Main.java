package Procedural;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int firstNumber,secondNumber;
	Scanner input  = new Scanner(System.in);
        System.out.println("Enter the First number to perform Addition");
        firstNumber = input.nextInt();
        System.out.println("Enetr the Second number to perform Addition");
        secondNumber = input.nextInt();
        System.out.println("The addition of two numbers is " +(firstNumber+secondNumber));
    }
}
