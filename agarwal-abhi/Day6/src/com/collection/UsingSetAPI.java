/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Abhishek Agarwal
 */
public class UsingSetAPI {
    
    public static void main(String[] args) {
        Invoice ram= new Invoice(107, "Ramesh", 4500);
        Invoice raj= new Invoice(102, "Ajesh", 4000);
        Invoice rak= new Invoice(103, "Bakesh", 4600);
        Invoice ral= new Invoice(104, "Zalesh", 4400);
        
        HashSet<Invoice> hashEx = new HashSet<>();
        
        hashEx.add(ral);
        hashEx.add(ram);
        hashEx.add(raj);
        hashEx.add(rak);
        
        hashEx.add(ral);
        
        for(Invoice eachInvoice: hashEx)
            System.out.println(eachInvoice);
        
        
        TreeSet<Invoice> treeEx = new TreeSet<Invoice>(new CustomerNameComparator());
        
        treeEx.add(ral);
        treeEx.add(ram);
        treeEx.add(raj);
        treeEx.add(rak);
        
        System.out.println("Tree wala eg.");
                
        for(Invoice eachInvoice: treeEx)
            System.out.println(eachInvoice);
    }
    
    
    
    
    
   
    
    
    
    
    
}
