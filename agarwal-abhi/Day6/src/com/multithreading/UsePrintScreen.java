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
public class UsePrintScreen implements Runnable{

    private String str1;
    private String str2;
    private PrintStrings ps;
    
    public UsePrintScreen(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        
        ps= new PrintStrings();
        Thread thread= new Thread(this);
        thread.start();
    }
    
    
    
    @Override
    public void run() {
        this.ps.print(str1, str2);
    }
    
    
    
}
