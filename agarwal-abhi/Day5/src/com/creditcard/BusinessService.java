/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcard;
import java.io.*;
/**
 *
 * @author Abhishek Agarwal
 */
public class BusinessService {
    
    public boolean writeObject(CreditCardDetails[] cd)
    {
        boolean persisted= false;
        
        ObjectOutputStream outStream = null;
        
        try {
            
            outStream= new ObjectOutputStream(new FileOutputStream(new File("credit.doc")));
           // System.out.println("idhar tak aaya");
                    
           // for(int i=0;i<cd.length;i++)
            //{
                outStream.writeObject(cd);
            //}
                
            
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
      
     public CreditCardDetails readObject(int number) 
    {
        CreditCardDetails []cd = new CreditCardDetails[10];
        CreditCardDetails cd1=null;
        
        ObjectInputStream inStream =null;
        
        try {
            inStream= new ObjectInputStream(new FileInputStream(new File("credit.doc")));
           
             
                
                while(inStream.read()!=0)
                {
                    //System.out.println("while mai aaya");
                    cd= (CreditCardDetails[])inStream.readObject();
                    
                    //if(cd.getCardNumber()==number)
                    //return cd;
                    
                    for(CreditCardDetails c:cd)
                    {
                        if(c.getCardNumber()==number)
                            return c;
                    }
                        
                        
                }

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
        
        return cd1;
    }
     
     
     public CreditCardDetails delObject(int number) 
    {
        CreditCardDetails cd = null;
        CreditCardDetails cd1=null;
        
        ObjectInputStream inStream =null;
        
        try {
            inStream= new ObjectInputStream(new FileInputStream(new File("credit.doc")));
           
             
                
                while(inStream.read()!=0)
                {
                    System.out.println("while mai aaya");
                    cd= (CreditCardDetails) inStream.readObject();
                    if(cd.getCardNumber()==number)
                    {
                        cd.setCardNumber(0);
                    }
                }

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
        
        return cd;
    }
}
