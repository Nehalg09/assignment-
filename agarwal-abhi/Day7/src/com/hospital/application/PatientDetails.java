/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.application;

import java.util.Objects;

/**
 *
 * @author Abhishek Agarwal
 */
public class PatientDetails {
    
    
    private String patName;
    private double patNumber;
    private int patAge;

    public PatientDetails(String patName, double patNumber, int patAge) {
        this.patName = patName;
        this.patNumber = patNumber;
        this.patAge = patAge;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public double getPatNumber() {
        return patNumber;
    }

    public void setPatNumber(double patNumber) {
        this.patNumber = patNumber;
    }

    public int getPatAge() {
        return patAge;
    }

    public void setPatAge(int patAge) {
        this.patAge = patAge;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.patName);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.patNumber) ^ (Double.doubleToLongBits(this.patNumber) >>> 32));
        hash = 73 * hash + this.patAge;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PatientDetails other = (PatientDetails) obj;
        if (Double.doubleToLongBits(this.patNumber) != Double.doubleToLongBits(other.patNumber)) {
            return false;
        }
        if (this.patAge != other.patAge) {
            return false;
        }
        if (!Objects.equals(this.patName, other.patName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PatientDetails{" + "patName=" + patName + ", patNumber=" + patNumber + ", patAge=" + patAge + '}';
    }
    
    
    
    
    
    
}
