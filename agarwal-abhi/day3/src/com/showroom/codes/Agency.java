/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.showroom.codes;
import com.showroom.i_faces.Rent;
/**
 *
 * @author Abhishek Agarwal
 */
public class Agency {
    
     public Rent getProduct(int key){
        
        switch(key)
        {
            case 1:
                return new Computer();
            case 2:
                return new Furniture();
            default:
                return null;
        }
    }
    
    
    public double printEstimate(Rent rent, int quantity)
    {
        double estimate=0.0;
        
        
        estimate= rent.getPrice()*quantity;
        
        return estimate;
        
       
    }
    
}
