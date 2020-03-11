/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapassbyvaluereference;

/**
 *
 * @author User
 */
public class JavaPassByValueReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myAge = 30;
        changeAge(myAge);
        System.out.println(myAge);
    }

    static void changeAge(int myAge) {
        myAge = 35;
    }

}
