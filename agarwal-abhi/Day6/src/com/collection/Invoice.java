/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Abhishek Agarwal
 */
public class Invoice implements Serializable,Comparable<Invoice>{
    
    
    private static final long serialVersionUID= 1L;
    
    private int invoiceNumber;
    private String customerName;
    private double amount;

    public Invoice() {
    }

    public Invoice(int invoiceNumber, String customerName, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.invoiceNumber;
        hash = 31 * hash + Objects.hashCode(this.customerName);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Invoice other = (Invoice) obj;
        if (this.invoiceNumber != other.invoiceNumber) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.customerName, other.customerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return invoiceNumber+""+customerName+""+amount; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Invoice o) {
        
        if(this.invoiceNumber < o.invoiceNumber) return -1;
        if(this.invoiceNumber > o.invoiceNumber) return 1;
        return 0;
    }
    
    
    
            
    
}
