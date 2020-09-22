/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhishek Agarwal
 */
public class ThreadJoinExample {


    public static void main(String[] args) {
        
        System.out.println("Main Thread Starts");
        
        Thread t= new Thread(){
            @Override
            public void run() {
                
                System.out.println("Joining thread starts execution");
                        
                try {
                    System.in.read();
                } catch (Exception e) {
                    
                    e.getMessage();
                }
                
                System.out.println("Joining thread completes execution");
            }
            
            
            
            
        };
        t.start();
        
        
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadJoinExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        System.out.println("Main Thread ends");
                
    }
    
}
