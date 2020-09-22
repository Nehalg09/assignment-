/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Abhishek Agarwal
 */
public class InvoiceDAOImpl implements InvoiceDAO{
    
    
    private List<Invoice> invList;

    public InvoiceDAOImpl() {
        
        super();
        invList= new ArrayList<Invoice>();
    }

    
    
    
    
    
    

    @Override
    public Collection<Invoice> findAll() {
        return this.invList;
    }

    @Override
    public boolean add(Invoice entity) {
        return this.invList.add(entity);
    }
    
    
    @Override
    public boolean add(Invoice ...invoices) {
        
        boolean result= false;
        
        for(Invoice eachInvoice: invoices)
        {
            add(eachInvoice);
            result=true;
        }
        return result;
            
        
    }

    @Override
    public Invoice findById(int d) {
        return null;
    }

    @Override
    public boolean remove(Invoice entity) {
        return this.invList.remove(entity);
    }

    @Override
    public boolean check(Invoice i1, Invoice i2) {
        
        int index= this.invList.indexOf(i2);
        System.out.println(i1);
        invList.add(index, i2);
        
        return true;
        
        
        
    }



    
}
