/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ioSerialization.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Abhishek Agarwal
 */
public class Book implements Serializable{
    
    private int bookNumber;
    private String bookName;
    private String author;
    private double price;
    private static final long serialVersionUID=13L;
    
    public Book(int bookNumber, String bookName, String author, double price) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return bookNumber+","+bookName+","+author+","+price; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.bookNumber;
        hash = 97 * hash + Objects.hashCode(this.bookName);
        hash = 97 * hash + Objects.hashCode(this.author);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Book other = (Book) obj;
        if (this.bookNumber != other.bookNumber) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    
    
    
}   
