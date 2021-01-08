/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleandsquare;

import java.util.Scanner;

/**
 *
 * @author aashish
 */
public class Square {

    Scanner inputForSquare = new Scanner(System.in);
    double length;

    public void LengthSetter() {
        System.out.println("Enter the length of one of the side of the square");
        length = inputForSquare.nextDouble();
    }

    public void SqaureArea() {
        double area = Math.pow(length, 2);
        System.out.println("The Area of Square is :: " + area);
    }

}
