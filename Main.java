/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author larab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        
        ClassOne number = new ClassOne(4);
        
        System.out.println("Number is: " + number.getNum());
        number.AddOne();
        System.out.println("After adding 1: " + number.getNum());
        
    }
    
}
