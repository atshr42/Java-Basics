package AdvanceJAVA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radiusCircle,radiusSphere,lengthSquare,lengthRectangle,breadthRectangle;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle\n");
        radiusCircle = input.nextDouble();
        System.out.println("Enter the radius of the Sphere\n");
        radiusSphere = input.nextDouble();
        System.out.println("Enter the length of a side of the Square\n");
        lengthSquare = input.nextDouble();
        System.out.println("Enter the length of the Rectangle\n");
        lengthRectangle = input.nextDouble();
        System.out.println("Enter the breadth of the Rectangle\n");
        breadthRectangle =input.nextDouble();
        System.out.println("\nThe area of Circle is ::"+ (Math.PI*radiusCircle*radiusCircle));
        System.out.println("\nThe area of Circle is ::"+ (Math.PI*radiusCircle*radiusCircle));
        System.out.println("\nThe area of Rectangle is ::"+ (lengthRectangle*breadthRectangle));
        System.out.println("\nThe area of Square is ::"+(Math.pow(lengthSquare,2)));
    }
}
