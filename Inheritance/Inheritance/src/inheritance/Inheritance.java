/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author aashish
 */

class Level{
    String level = "Bachelors"; 
}

public class Inheritance extends Level {
String name = "Aashish";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Inheritance example = new Inheritance();
        System.out.println("My name is " + example.name + " and I am a " + example.level + " level Student");
    }
    
}
