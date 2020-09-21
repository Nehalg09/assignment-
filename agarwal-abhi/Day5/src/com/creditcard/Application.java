/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcard;

import java.util.Scanner;

/**
 *
 * @author Abhishek Agarwalasfad
 */
public class Application {
    
    
    public static void main(String[] args) {
        
        CreditCardDetails [] cda=new CreditCardDetails[10];
        BusinessService bs= new BusinessService();
        Scanner sc =new Scanner(System.in);
        int choice,number;
        String name,expiry;
        double limit;
        
        System.out.println("Credit Card Application");
        do{
            System.out.println("Enter your choice:\n1.Store Data\n2.Retrieve Data\n3.Delete Data\nEnter your choice:");
            choice= sc.nextInt();
            
            switch(choice)
            {
                case 1:
                        System.out.println("Enter how do you wish to enter the data\n1.Byte Stream\n2.Character Stream\nEnter your choice:");
                        int choice1;
                        choice1= sc.nextInt();
                        
                        switch(choice1)
                        {
                            case 1:
                                    System.out.println("How many records do you wish to enter??");
                                    int k= sc.nextInt();
                                    System.out.println(k);
                                    //cd1= new CreditCardDetails[k];
                                    int i=0;
                                    do
                                    {
                                        sc.nextLine();
                                        System.out.println("\nEnter Card holder Name:");
                                        name = sc.nextLine();
                                        //cd1[i].setCardHolderName(name);

                                        System.out.println("Enter Card Number:");
                                        number= sc.nextInt();
                                        //cd1[i].setCardNumber(number);

                                        sc.nextLine();
                                        System.out.println("Enter expiry date");
                                        expiry= sc.nextLine();
                                        //cd1[i].setExpiryDate(expiry);

                                        System.out.println("Enter credit limit");
                                        limit= sc.nextDouble();
                                        //cd1[i].setCreditLimit(limit);
                                        CreditCardDetails cd= new CreditCardDetails(name, number, expiry, limit);
                                        cda[i]=cd;
                                        i++;

                                        //System.out.println(name+" "+number+" "+expiry+" "+limit);
                                    }while(i<k);
                        }
                        
                        boolean result=bs.writeObject(cda);
                        
                        if(result)
                            System.out.println("Write Successfull");
                        else
                            System.out.println("Error");
                            
                        break;
                
                case 2:
                        System.out.println("Enter the card number of person whose record has to be retrieved");
                        
                        sc.nextLine();
                        int check= sc.nextInt();
                        
                        try{
                            System.out.println(bs.readObject(check));
                        }
                        catch(NullPointerException e)
                        {
                            System.err.println(e.getMessage()+"Please enter valid number");
                        }
                         
                        break;
                
                case 3:
                        System.out.println("Enter the card number of person whose record has to be deleted:");
                        
                        sc.nextLine();
                        int c= sc.nextInt();
                        
                        try{
                            System.out.println(bs.delObject(c));
                        }
                        catch(NullPointerException e)
                        {
                            System.err.println(e.getMessage()+"Please enter valid number");
                        }
                         
                        break;
                        
                            
            }
           
            
        }while(true);
        
    }
    
}
