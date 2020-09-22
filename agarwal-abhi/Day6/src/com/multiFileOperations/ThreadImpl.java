/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multiFileOperations;

import java.io.File;

/**
 *
 * @author Abhishek Agarwal
 */
public class ThreadImpl implements Runnable{

    FileOperations fs;
    private File file;
    private String str;
    private boolean read= false;
    
    public ThreadImpl(String str,File file) {
        this.file=file;
        this.str=str;
        fs=new FileOperations();
        read=false;
        
        Thread thread= new Thread()
        {
            public void run()
            {
                fs.writeToFile(str, file);
            }
        };
        thread.start();
    }
    
    public ThreadImpl(File file) {
        this.file=file;
        fs=new FileOperations();
        read=true;
        
        Thread thread= new Thread(){
            public void run()
                {
                    
                   // System.out.println("run ka read ho raha hai, file length hai: "+file.length());
                    
                    fs.readFromFile(file);
                    
                }
        
        };
        thread.start();
    }
    
    @Override
    public void run() {
         
    }
    
    
    
    
}
