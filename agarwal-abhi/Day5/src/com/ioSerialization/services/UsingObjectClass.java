/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ioSerialization.services;

import com.ioSerialization.model.Book;

/**
 *
 * @author Abhishek Agarwal
 */
public class UsingObjectClass {
    
    public static void main(String[] args) {
        
        Book hf1= new Book(100, "HFJ", "ABC", 500);
        Book hf2= new Book(100, "HFJ", "ABC", 500);
        
        
        System.out.println(hf1.equals(hf2));
    }
}
