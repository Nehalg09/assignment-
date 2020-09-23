/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Abhishek Agarwal
 */
public class Application {

    public static void printList(Collection<Invoice> invList)
    {
        Iterator<Invoice> itr= invList.iterator();
         
        while(itr.hasNext())
        {
            Invoice inv = itr.next();
            System.out.println(inv);
                    
        }
    }
        
    public static void main(String[] args) {
        Invoice ram= new Invoice(107, "Ramesh", 4500);
        Invoice raj= new Invoice(102, "Ajesh", 4000);
        Invoice rak= new Invoice(103, "Bakesh", 4600);
        Invoice ral= new Invoice(104, "Zalesh", 4400);
        
        
        InvoiceDAO dao= new InvoiceDAOImpl();
        
        dao.add(ram);
        dao.add(raj,rak,ral);
        
        
        Collection<Invoice> invList = dao.findAll();
        printList(invList);
        
        System.out.println("\n\n\n");
                
        
        invList.remove(ral);
        
        printList(invList);
        
        Invoice newRal= new Invoice(104,"Ralesh", 4500);
        //dao.check(ral, newRal);
        
        //printList(invList);
        
        
        System.out.println("Sorted List");
        //printList(dao.sortedList());
        printList(dao.sortedByInvoiceNumber());
        
        System.out.println("Decending Order");
       
        printList(dao.sortedBy("customerName"));
    }
}
