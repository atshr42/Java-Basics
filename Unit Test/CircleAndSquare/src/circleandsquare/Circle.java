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
public class Circle extends Square{
    double radius;
    Scanner inputForCircle = new Scanner(System.in);
    
    public void  RadiusSetter(){
        System.out.println("Enter the radius of the Circle");
        radius = inputForCircle.nextDouble() ;
    }
    
    public void CircleArea(){
    double area = Math.PI* Math.pow(radius, 2);
        System.out.println("The Area of Circle is :: "+area);
    }
    
    
    
}
