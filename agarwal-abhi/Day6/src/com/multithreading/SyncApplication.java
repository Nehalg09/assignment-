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
public class SyncApplication {
    
    public static void main(String[] args) {
        
        new UsePrintScreen("idli", "sambar");
        new UsePrintScreen("paratha", "butter");
        new UsePrintScreen("pizza", "coke");
        new UsePrintScreen("tea", "biscuit");
    }
    
}
