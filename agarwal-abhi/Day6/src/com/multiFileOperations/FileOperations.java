/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multiFileOperations;

import java.io.*;

/**
 *
 * @author Abhishek Agarwal
 */
public class FileOperations {
    
    public synchronized void readFromFile(File file)
    {
        
        if(file.length() == 0)
        {
            System.out.println("File is Empty!! Waiting for Write operation..\n");
                    
            try
            {
                wait();
            } 
            catch (Exception ex) {
                ex.getMessage();
            }
        }
        
        BufferedReader br= null;
        String output;
        
        
                
        try
        {
            br= new BufferedReader(new FileReader(file));
            System.out.println("Performing Read Operation");
            System.out.println("Contens of File are:");
                    
            while((output=br.readLine())!= null)
            {
                System.out.println(output);
            }
            
            System.out.println("Read Operation Completed...........\n");
           
        } 
        catch (Exception e) 
        {
            e.getMessage();
        }
        finally
        {
            try 
            {
                    br.close();
            }
            catch (Exception e) 
            {
                e.getMessage();
            }
        }
        
    }
    
    
    public synchronized void writeToFile(String str,File file)
    {
        
        PrintWriter pw= null;
        
        try 
        {
            System.out.println("Performing Write Operation");
            pw = new PrintWriter(new FileWriter(file, true));
            pw.println(str);
            System.out.println("Write Operation Completed......\n");
            notify();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        finally
        {
            
            try 
            {
                pw.close();
            }
            catch (Exception e) 
            {
                e.getMessage();
            }
        }
    }
}
