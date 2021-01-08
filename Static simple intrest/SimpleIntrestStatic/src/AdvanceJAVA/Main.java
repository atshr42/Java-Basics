package AdvanceJAVA;

import java.util.*;

public class Main {

    public static void CalculateIntrest(double principal,double time,double rate){
        double simpleintrest = (principal*time*rate)/100;
        System.out.println("The Simple Intrest is ::" + simpleintrest);
        }

    public static void main(String[] args) {
        double principal,time,rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal ,Time ,Rate ::");
        principal =input.nextDouble();
        time = input.nextDouble();
        rate = input.nextDouble();
        CalculateIntrest(principal,time,rate);
    }
}
