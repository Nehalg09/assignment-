/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital;

import com.hospital.application.DoctorDetails;
import com.hospital.application.PatientDetails;
import com.hospital.ifaces.HospitalServicesImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author Abhishek Agarwal
 */
public class Application {
    
    
    public static void printList(Collection<?> invList)
    {
        Iterator<?> itr= invList.iterator();
         
        while(itr.hasNext())
        {
            System.out.println(itr.next());
                    
        }
    }
    
    public static void printAppointment(Set<Map.Entry<DoctorDetails,List<PatientDetails>>> setList)
            
    {
        for(Map.Entry<DoctorDetails,List<PatientDetails>> eachEntry : setList)
        {
            System.out.print(eachEntry.getKey());
            System.out.print("\t"+eachEntry.getValue()+"\n");
                    
                    
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        Collection<DoctorDetails> docList= null;
        Collection<PatientDetails> patList= null;
        
        HospitalServicesImpl hosp =new HospitalServicesImpl();
        
        
        System.out.println("------------Hospital Management System----------------");
        System.out.println("");
                
        DoctorDetails doc = new DoctorDetails(123, "Abhishek", 88885555, "Paleantologist");
       boolean result= hosp.addDoctor(doc);
        System.out.println(result);
        
        docList= hosp.getAllDoctorDetails();
        printList(docList);
        
        PatientDetails pat1 = new PatientDetails("Agarwal", 88888888, 22);
        PatientDetails pat2 = new PatientDetails("Raj", 88888888, 52);
        result= hosp.addPatient(pat1);
        hosp.addPatient(pat2);
        System.out.println(result);
        
        patList= hosp.getAllPatientDetails();
        printList(patList);
               
       
        HashMap<DoctorDetails, List<PatientDetails>> ht;
        hosp.addAppointment(doc, pat1);
        ht= hosp.addAppointment(doc, pat2);
        System.out.println("Appointment:"+result);
        
        
        Set<Map.Entry<DoctorDetails,List<PatientDetails>>> mylist= ht.entrySet();
        printAppointment(mylist);
//        for(Map.Entry<DoctorDetails,List<PatientDetails>> eachEntry : mylist)
//        {
//            System.out.print(eachEntry.getKey());
//            System.out.print("\t"+eachEntry.getValue()+"\n");
//                    
//                    
//        }
        
        System.out.println("After Delete\n\n");
                
        ht= hosp.del(doc, pat2);
        mylist= ht.entrySet();
        printAppointment(mylist);
//        for(Map.Entry<DoctorDetails,List<PatientDetails>> eachEntry : mylist)
//        {
//            System.out.print(eachEntry.getKey());
//            System.out.print("\t"+eachEntry.getValue()+"\n");
//                    
//                    
//        }
        
        
    }
    
}
