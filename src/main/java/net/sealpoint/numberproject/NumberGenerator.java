/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sealpoint.numberproject;

import static java.lang.Math.random;

/**
 *
 * @author mikeseal
 */
public class NumberGenerator {

    static final int DEFAULTDIGITS = 2;
    private int NumberOfDigits;

    public void NumberGenerator(int NumberOfDigits) {
        this.NumberOfDigits = NumberOfDigits;
    }

    public void NumberGenerator() {
        this.NumberOfDigits = DEFAULTDIGITS;
    }
    
    /**
     * @return the NumberOfDigits
     */
    public int getNumberOfDigits() {
        return NumberOfDigits;
    }

    /**
     * @param NumberOfDigits the NumberOfDigits to set
     */
    public void setNumberOfDigits(int NumberOfDigits) {
        this.NumberOfDigits = NumberOfDigits;
    }

    public String GenerateNumber() {
        int i;
        String returnStr = "";

        for (i = 0; i < NumberOfDigits; i++) {
            returnStr += String.valueOf(random() * (9 - 0 + 1) + 0).substring(0,1);
        }
        return returnStr;
    }
    
    public String GenerateNumber(int Digits) {
        setNumberOfDigits(Digits);
        return GenerateNumber();
    }
}
