/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcard;

import java.io.Serializable;

/**
 *
 * @author Abhishek Agarwalmain
 */
public class CreditCardDetails implements Serializable{
    
    private String cardHolderName;
    private int cardNumber;
    private String expiryDate;
    private transient double creditLimit;

    public CreditCardDetails(String cardHolderName, int cardNumber, String expiryDate, double creditLimit) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.creditLimit = creditLimit;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    
    

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return cardHolderName+","+cardNumber+","+expiryDate+","+creditLimit; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
