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
public class Computer implements Rent{
    
    @Override
    public int getItemNumber()
    {
        return 123;
    }
    
    @Override
    public double getPrice()
    {
        return 45000.50;
    }
   
    
}
