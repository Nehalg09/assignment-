/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcard;
import java.io.*;
/**
 *
 * @author Abhishek Agarwalsadsa
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
     
     
     public CreditCardDetails[] delObject(int number) 
    {
        CreditCardDetails cd[] = new CreditCardDetails[10];
        CreditCardDetails cd1[]=null;
        int i=0;
        ObjectInputStream inStream =null;
        
        try {
            inStream= new ObjectInputStream(new FileInputStream(new File("credit.doc")));
           
             
                
                   System.out.println("while mai aaya");
                    cd1= (CreditCardDetails[]) inStream.readObject();
                    
                   System.out.println("cd1 ka length"+cd1.length);
                    
                    for(CreditCardDetails c:cd1)
                    {
                        System.out.println("for mai aaya");
                        if(c.getCardNumber()!=number)
                        {
                            cd[i]=c;
                            i++;
                        }
                    }
                    File file= new File("credit.doc");
                            file.delete();

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
        System.out.println("length is"+cd.length);
                
        return cd;
    }
}
