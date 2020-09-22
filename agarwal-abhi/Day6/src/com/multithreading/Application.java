/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading;

/**
 *
 * @author Abhishek Agarwal
 */
public class Application {
    
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());
        
        new InvokeNumberService(50,"Fifty addition");
        new InvokeNumberService(500,"Five Hundred addition");
        new InvokeNumberService(5000,"Fifty thousand addition");
        
        
        try {
            System.out.println("Enter a Message");
            int key=(Integer)System.in.read();
            System.out.println(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        

    }
}
