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
public class NumberService {

    
    public void sumNumbers(int countTo)
    {
        int count =0;

        for(int i=0;i<countTo;i++)
        {
            count=count+i;
        }

        System.out.println("Sum upto = "+countTo+" is = "+count+"Called by: "+Thread.currentThread().getName());
    }    
        

    
}
