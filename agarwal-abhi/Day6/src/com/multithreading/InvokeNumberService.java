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
public class InvokeNumberService implements Runnable{ 

    
    
    
    private int countUpTo;
    private String threadName;
    private NumberService service;
    
    InvokeNumberService(int countUpTo, String threadName) {
        super();
        
        
        this.countUpTo = countUpTo;
        this.threadName = threadName;
        
        service= new NumberService();
        
        Thread thread= new Thread(this, threadName);
        thread.start();
        
    }
    
    
    
    
    @Override
    public void run() {
        
        
        this.service.sumNumbers(countUpTo);
    }
    
}
