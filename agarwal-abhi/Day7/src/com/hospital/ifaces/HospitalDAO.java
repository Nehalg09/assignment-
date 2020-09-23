/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.ifaces;

import com.hospital.application.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Abhishek Agarwal
 */
public interface HospitalDAO {
    
    
    boolean addDoctor(DoctorDetails doctorDetails);
    Collection<DoctorDetails> getAllDoctorDetails();
    
    
    boolean addPatient(PatientDetails patientDetails);
    Collection<PatientDetails> getAllPatientDetails();
    
    HashMap<DoctorDetails, List<PatientDetails>> addAppointment(DoctorDetails doc, PatientDetails pat);
    HashMap<DoctorDetails, List<PatientDetails>> del(DoctorDetails doc,PatientDetails pat);
}
