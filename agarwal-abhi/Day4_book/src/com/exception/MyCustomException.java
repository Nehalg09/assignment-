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
public class MyCustomException extends Exception{
    
    
    private String defaultMessage;
    private String customMessage;

    public MyCustomException(String message, Throwable cause) {
        
        super();
        this.defaultMessage=message;
        this.customMessage="Please enter valid Range.";
        
        
    }

    

    @Override
    public String getMessage() {
        return defaultMessage+customMessage; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
