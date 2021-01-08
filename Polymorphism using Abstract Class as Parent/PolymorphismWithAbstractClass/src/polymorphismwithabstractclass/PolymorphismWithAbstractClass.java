/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismwithabstractclass;

/**
 *
 * @author aashish
 */

abstract class Displayer{
    public void disp(){
        System.out.println("This is the non abstract function");
    }
    abstract public void disp2();
}


public class PolymorphismWithAbstractClass extends Displayer{


    
    @Override
    public void disp2(){
        System.out.println("This is a overridden abstract function");
    }
    
    public static void main(String[] args) {
       PolymorphismWithAbstractClass Object = new PolymorphismWithAbstractClass();
       Object.disp();
       Object.disp2();
    }
    
}
