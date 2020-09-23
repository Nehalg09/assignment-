/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;
import java.util.*;
/**
 *
 * @author Abhishek Agarwal
 */
public class UsingMapAPI {


    public static void main(String[] args) {
        
        Invoice ram= new Invoice(107, "Ramesh", 4500);
        Invoice raj= new Invoice(102, "Ajesh", 4000);
        Invoice rak= new Invoice(103, "Bakesh", 4600);
        Invoice ral= new Invoice(104, "Zalesh", 4400);
        
        HashMap<Integer,Invoice> invList = new HashMap<>();
        
        invList.put(new Integer(901), ral);
        invList.put(new Integer(601), raj);
        Invoice response= invList.put(new Integer(901), ram);
        invList.put(new Integer(101), rak);
        
        System.out.println(response);
        System.out.println("size:"+invList.size());
        
        
        
        System.out.println("Mapping");
        
        
                
        Set<Map.Entry<Integer,Invoice>> mylist= invList.entrySet();
        
        for(Map.Entry<Integer,Invoice> eachEntry : mylist)
        {
            System.out.print(eachEntry.getKey());
            System.out.print("\t"+eachEntry.getValue()+"\n");
                    
                    
        }
        
        
        
        
        
        
    }
}
