/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codes;

import com.exception.MyCustomException;
import com.exception.RangeCheckException;

/**
 *
 * @author Abhishek Agarwal
 */
public class Book {
    
    
    private int bookId;
    private String bookName;
    private String authorName;
    private double price;

    public Book(int bookId, String bookName, String authorName, double price) throws RangeCheckException{
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        
        if(price<100 || price>500)
            throw new RangeCheckException("The price of book should be between 100-500.");
       this.price = price;
        
        
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) throws MyCustomException{
        
        try {
            
            if(bookName.equals(" "));
            
        } catch (NullPointerException e) {
         
            throw new MyCustomException("Book Name not entered",e);
        }
        
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) throws RangeCheckException{
        
        if(price<100 || price>500)
            throw new RangeCheckException("The price of book should be between 100-500.");
        
        this.price = price;
    }


    
    
    
    
}
