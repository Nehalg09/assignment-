/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading;

import java.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhishek Agarwal
 */
public class PrintStrings {
    
    
    public synchronized static void print(String str1,String str2) {

        System.out.println(str1);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrintStrings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(str2);
            
    }
    
}
