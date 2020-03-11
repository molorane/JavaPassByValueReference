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
public class CustomObject {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("Before : " + a.name);
        changeA(a);
        System.out.println("After : " + a.name);
    }

    static void changeA(A a) {
        a.name = "Mothusi";
    }

    private static class A {
        String name;
    }

}
