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
public class NumberTest {
    
    public boolean NumbersEqual(String TestNumber) {
        char numTest[];       
        numTest = TestNumber.toCharArray();
        int i;
        
        for(i=0; i<numTest.length; i++) {
            if (numTest[0] != numTest[i] )
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean AdjacentPlusOne(String TestNumber){
    
        return true;
    }
    
    public boolean AdjacentMinusOne(String TestNumber){
    
        return true;
    }
}