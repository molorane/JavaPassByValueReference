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
public class MutableObjectReference {

    public static void main(String[] args) {
        StringBuilder java = new StringBuilder("Java ");
        StringBuilder spring = new StringBuilder("Java ");

        System.out.println("Java before call: " + java);
        addJava(java);
        System.out.println("Java after call: " + java);

        System.out.println("Spring before call: " + spring);
        addSpring(java);
        System.out.println("Spring after call: " + spring);
    }

    static void addJava(StringBuilder java) {
        java.append("Java Fanatic");
    }

    static void addSpring(StringBuilder spring) {
        spring = new StringBuilder("Spring Fantatics");
    }
}
