/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.ifaces;

import com.hospital.application.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Abhishek Agarwal
 */
public class HospitalServicesImpl implements HospitalServices{
    
    
    
    private List<DoctorDetails> docList;
    private List<PatientDetails> patList;
    private List<PatientDetails> temp;
    private HashMap<DoctorDetails,List<PatientDetails>> appointment;

    public HospitalServicesImpl() {
        
        docList= new ArrayList<>();
        patList= new ArrayList<>();
        appointment= new HashMap<>();
    }
    
    
    

    @Override
    public boolean addDoctor(DoctorDetails doctorDetails) {
        return this.docList.add(doctorDetails);
    }

    @Override
    public Collection<DoctorDetails> getAllDoctorDetails() {
        return this.docList;
    }

    @Override
    public boolean addPatient(PatientDetails patientDetails) {
        return this.patList.add(patientDetails);
    }

    @Override
    public Collection<PatientDetails> getAllPatientDetails() {
        return this.patList;
    }

    @Override
    public HashMap<DoctorDetails, List<PatientDetails>> addAppointment(DoctorDetails doc, PatientDetails pat) {
       
        temp = new ArrayList<>();
        if(!docExist())
        {
           temp.add(pat);
           appointment.put(doc, temp);
        }
        else
        {
            temp = appointment.get(doc);
            temp.add(pat);
            appointment.put(doc, temp);
        }
        return appointment;
    }
    
    public boolean docExist()
    {
       for(DoctorDetails d: docList)
            if(appointment.containsKey(d))
                return true;
            
        return false;
    }

    @Override
    public HashMap<DoctorDetails, List<PatientDetails>> del(DoctorDetails doc,PatientDetails pat) {
        
        temp = new ArrayList<>();
        
        temp = appointment.get(doc);
        
        temp.remove(pat);
        appointment.remove(doc, pat);
        
        return appointment;
       
    }
    
}
