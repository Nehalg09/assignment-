/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ioSerialization.services;


import com.ioSerialization.model.Book;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Abhishek Agarwal
 */
public class BookService {
    
    public boolean writeObject(Book book)
    {
        boolean persisted= false;
        
        ObjectOutputStream outStream = null;
        
        try {
            
            outStream= new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
            outStream.writeObject(book);
            persisted=true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally{
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return persisted;
    }
        
    
    public Book readObject() 
    {
        Book book = null;
        
        ObjectInputStream inStream =null;
        
        try {
            inStream= new ObjectInputStream(new FileInputStream(new File("book.ser")));
            book= (Book) inStream.readObject();
            //System.out.println(inStream);
                    
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
         finally{
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }   
        
        return book;
    }
    
    
    
    public boolean writeWDS(Book bk,File file)
    {
        boolean persisted= false;
        
        
        DataOutputStream outDsStream =null;
        //ObjectOutputStream outStream = null;
        
        try {
            
            outDsStream= new DataOutputStream(new FileOutputStream(file));
            outDsStream.writeInt(bk.getBookNumber());
            outDsStream.writeUTF(bk.getBookName());
            outDsStream.writeUTF(bk.getAuthor());
            outDsStream.writeDouble(bk.getPrice());
                    
            persisted=true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally{
            try {
                outDsStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return persisted;
    }
    
    public Book readWDS(File file)
    {   
        Book book = null;
        
        DataInputStream inDsStream=null;
        //ObjectInputStream inStream =null;
        
        try {
            inDsStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            //inStream= new ObjectInputStream(new FileInputStream(new File("book.ser")));
            //System.out.println(inStream);
            System.out.println(inDsStream.readInt());
            System.out.println(inDsStream.readUTF());
            System.out.println(inDsStream.readUTF());
            System.out.println(inDsStream.readDouble());
                    
                    
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally{
            try {
                inDsStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }  
        }   
        
        return book;
        
    } 
        
        
}
