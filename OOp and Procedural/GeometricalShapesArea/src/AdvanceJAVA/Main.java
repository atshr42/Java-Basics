package AdvanceJAVA;


import java.util.Scanner;

public class Main {
double radiusCircle,radiusSphere,lengthSquare,lengthRectangle,breadthRectangle;

public Main(){
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
}
public   void CircleArea(Double radiusCircle){
    System.out.println("\nThe area of Circle is ::"+ (Math.PI*radiusCircle*radiusCircle));
}

public  void SphereArea(Double radiusSphere){
    System.out.println("\nThe area of Sphere is ::"+ (4*Math.PI*radiusSphere*radiusSphere));
}

public  void RectangleArea(Double lengthRectangle,Double breadthRectangle){
    System.out.println("\nThe area of Rectangle is ::"+ (lengthRectangle*breadthRectangle));
}

public  void SquareArea(Double lengthSquare){
    System.out.println("\nThe area of Square is ::"+(Math.pow(lengthSquare,2)));
}


    public static void main(String[] args) {
        Main obj = new Main();
        obj.CircleArea(obj.radiusCircle);
        obj.RectangleArea(obj.lengthRectangle,obj.breadthRectangle);
        obj.SquareArea(obj.lengthSquare);
        obj.SphereArea(obj.radiusSphere);
    }
}
