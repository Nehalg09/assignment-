/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multiFileOperations;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Abhishek Agarwal
 */
public class Appication {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
                
        File file = new File("myFile.txt");
        FileOperations fo = new FileOperations();
        Thread t1=new Thread(){
         
            public void run()
            {
                fo.readFromFile(file);
            }
                
        };
        t1.start();
        
        Thread t2=new Thread(){
         
            public void run()
            {
                fo.writeToFile("hello",file);
            }
                
        };
        t2.start();
        
//        ThreadImpl t1 = new ThreadImpl(file);
//        
//       ThreadImpl t2 = new ThreadImpl("hello", file);
        
        
    }
    
}
