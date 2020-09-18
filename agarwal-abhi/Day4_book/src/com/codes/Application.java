/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codes;

import com.exception.RangeCheckException;
import java.util.Scanner;

/**
 *
 * @author Abhishek Agarwal
 */
public class Application {
    
   
    public static void main(String[] args) {
        
        int key;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("------Book Service--------");
        
        Book b;
        BookService bs = new BookService();
        do
        {
            System.out.println("Select one option\n");
            System.out.println("1.Add\n2.Get Detail of one book\n3.Get Details of all book\n");
            key= sc.nextInt();
            
            switch(key){
                
                case 1:
                        System.out.println("Enter ID:");
                        key= sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("\nEnter Name:");
                        String bookName= sc.nextLine();
                        
                        System.out.println("\nEnter Author Name");
                        String authorName = sc.nextLine();
                        
                        System.out.println("Enter price");
                        double price=sc.nextDouble();
                                
                        try{
                            b =new Book(key, bookName, authorName, price);
                            bs.add(b);
                        }
                        catch(RangeCheckException r)
                        {
                            System.err.println(r.getMessage());
                        }
                        
                        break;
                case 2:
                    System.out.println("Enter the book Id of the book");
                    key=sc.nextInt();
                    bs.getOne(key);
                    break;
                    
                case 3:    
                    if(bs.bookDetails.length!= 0 )
                        bs.getAll();
                    break;
                
            }
                
            
            
        }while(true);
        
      
                
        
    }
    
    
    
    
}
