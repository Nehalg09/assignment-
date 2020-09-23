/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.Comparator;

/**
 *
 * @author Abhishek Agarwal
 */
public class InvoiceNumberComparator implements Comparator<Invoice>{

    @Override
    public int compare(Invoice o1, Invoice o2) {
        if(o1.getInvoiceNumber()< o2.getInvoiceNumber()) return -1;
        if(o1.getInvoiceNumber()> o2.getInvoiceNumber()) return 1;
        return 0;
    }
    
    
    
}
