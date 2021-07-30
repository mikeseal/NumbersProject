/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sealpoint.numberproject;

/**
 *
 * @author mikeseal
 */
public class NumberTestApp {
    
    
    public static void main(String[] args)
    {
        String TestNumber = "";
        
        NumberGenerator numGen = new NumberGenerator();
        numGen.setNumberOfDigits(2);
        
        TestNumber = numGen.GenerateNumber();
        
        
        
        
    }
    
}
