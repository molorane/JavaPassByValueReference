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
public class StringValueChange {

    public static void main(String[] args) {
        String name = "Java";
        changeName(name);
        System.out.println(name);
    }
    
    static void changeName(String name){
        name.replace('a', 'x');
    }
}
