/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exception;

/**
 *
 * @author Abhishek Agarwal
 */
public class RangeCheckException extends Exception{
    
    
    private String message;

    public RangeCheckException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Exception: "+message;   //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
