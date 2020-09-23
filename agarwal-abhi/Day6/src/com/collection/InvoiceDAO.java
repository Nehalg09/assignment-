/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.Collection;

/**
 *
 * @author Abhishek Agarwal
 */
public interface InvoiceDAO {


    Collection<Invoice> findAll();
    Collection<Invoice> sortedList();
    Collection<Invoice> sortedByInvoiceNumber();
    Collection<Invoice> sortedBy(String propName);
    
    boolean add(Invoice entity);
    boolean add(Invoice ...invoices);
    Invoice findById(int d);
    boolean remove(Invoice entity);
    
    boolean check(Invoice i1,Invoice i2);
}
