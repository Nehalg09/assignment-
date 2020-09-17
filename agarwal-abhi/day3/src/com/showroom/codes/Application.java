/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.showroom.codes;
import com.showroom.i_faces.Rent;

import java.util.Scanner;

/**
 *
 * @author Abhishek Agarwal
 */
public class Application {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        Agency a_name= new Agency();
        
        int key,quantity;
        double total_rent=0.0;
        
        do
        {
            System.out.println("Enter the item to be rented\n1.Computer\n2.Furniture\n");
            
            key= sc.nextInt();
            
            System.out.println("Enter Quantity");
            quantity= sc.nextInt();
            
                    
            
            Rent selected=a_name.getProduct(key);
            
            total_rent+=a_name.printEstimate(selected,quantity);
                    
            System.out.println("Do you wish to continue?(0 | 1)");
            key= sc.nextInt();
            
            
        }while(key==1);
        
        System.out.println("Your total rent would be:"+total_rent);
        
        
        
    }
    
}
