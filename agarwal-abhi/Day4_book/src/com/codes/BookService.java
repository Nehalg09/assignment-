/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codes;

import java.util.NoSuchElementException;

/**
 *
 * @author Abhishek Agarwal
 */
public class BookService {

    private static int count= 0;
    Book[] bookDetails= new Book[10];
    
    public void add(Book b){
        
        bookDetails[count]= b;
        count++;
    }
    
    public void getOne(int bookId)
    {
        boolean status = true;
        for(Book bcheck : bookDetails)
        {
            if(bcheck.getBookId() == bookId)
            {
                System.out.println("The details of the book with id "+bookId+"is:\n");
                
                System.out.println("Name:"+bcheck.getBookName());
                System.out.println("\nAuthor Name:"+bcheck.getAuthorName());
                System.out.println("\nPrice:"+bcheck.getPrice());
                status = false;
                break;
                
            }
        }
        if(status)
            throw new NoSuchElementException();
        
    }
    
    public void getAll()
    {
         System.out.println("The details of the books are:\n");
        for(int i=0;i<bookDetails.length;i++)
        {        
                System.out.println("Name:"+bookDetails[i].getBookName());
                System.out.println("\nAuthor Name:"+bookDetails[i].getAuthorName());
                System.out.println("\nPrice:"+bookDetails[i].getPrice());
                System.out.println("");
                        
                
        }
    }
    
    
    
}
