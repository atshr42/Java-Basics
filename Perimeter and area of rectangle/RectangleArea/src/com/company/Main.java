package com.company;

import java.util.Scanner;

public class Main {
    int length, breadth, area,perimeter;

    public Main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle\n");
        length = input.nextInt();
        breadth = input.nextInt();
    }

    public int AreaCalculate() {
        area = length * breadth;
        return area;
    }

    public int periMeter(){
        perimeter = 2*(length+breadth);
        return perimeter;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        int areaOfRectangle = obj.AreaCalculate();
        int perimeterOfRectangle =obj.periMeter();
        System.out.println("The area of rectangle is " + areaOfRectangle);
        System.out.println("The Perimeter of rectangle is " + perimeterOfRectangle);
    }
}
