/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author aashish
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RunEncapsulation encapculated = new RunEncapsulation();
        encapculated.setName("Aashish");
        encapculated.setAddress("Trishuli");
        encapculated.setAge(21);
        System.out.println("The name is : " + encapculated.getName()
                + ", the address is : " + encapculated.getAddress() + " and age is :" + encapculated.getAge());

    }

}
