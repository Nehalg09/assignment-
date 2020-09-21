package com.ioSerialization.services;

import com.ioSerialization.model.Book;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abhishek Agarwal
 */
public class Application {



    public static void main(String[] args) {
        
        
        File file= new File("book.doc");
        Book headFirst = new Book(100, "Head First Java", "ABC",450);
        
        
        BookService service = new BookService();
        
//        boolean result = service.writeObject(headFirst);
//        
//        if(result)
//        {
//            System.out.println("Book Persisted");
//        }
//        else
//        {
//            System.out.println("Error-check");
//                    
//        }
//        
//        
//        System.out.println(service.readObject());



    boolean result = service.writeWDS(headFirst, file);
    
    if(result)
            System.out.println("Book details written");
    else
            System.out.println("Error");
    
        service.readWDS(file);
    
    
    }
    
}
