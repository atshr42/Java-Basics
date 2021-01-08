/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismusinginterface;

/**
 *
 * @author aashish
 */
interface Displayer {

    public void disp1();

    public void disp2();

}

public class PolymorphismUsingInterface implements Displayer {
    @Override
    public void disp1() {
        System.out.println("I am from the first Displayer");
    }

    @Override
    public void disp2() {
        System.out.println("I am from the second Displayer");
    }

    public static void main(String[] args) {
        PolymorphismUsingInterface Object = new PolymorphismUsingInterface();
        Object.disp1();
        Object.disp2();
    }

}
