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
public class ClassOne {
    
    public int num;
    
    ClassOne(int n){
        num = n;
    }
    
    public int getNum(){
        return num;
    }
    
    public int AddOne(){
        return num += 1;
    }
    
    public int SubOne (){
        return num -= 1;
    }
    
}
