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
public class DoctorDetails {
    
    private int docId;
    private String docName;
    private double docNumber;
    private String docDesignation;

    public DoctorDetails(int docId, String docName, double docNumber, String docDesignation) {
        this.docId = docId;
        this.docName = docName;
        this.docNumber = docNumber;
        this.docDesignation = docDesignation;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public double getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(double docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDesignation() {
        return docDesignation;
    }

    public void setDocDesignation(String docDesignation) {
        this.docDesignation = docDesignation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.docId;
        hash = 29 * hash + Objects.hashCode(this.docName);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.docNumber) ^ (Double.doubleToLongBits(this.docNumber) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.docDesignation);
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
        final DoctorDetails other = (DoctorDetails) obj;
        if (this.docId != other.docId) {
            return false;
        }
        if (Double.doubleToLongBits(this.docNumber) != Double.doubleToLongBits(other.docNumber)) {
            return false;
        }
        if (!Objects.equals(this.docName, other.docName)) {
            return false;
        }
        if (!Objects.equals(this.docDesignation, other.docDesignation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor{" + "docId=" + docId + ", docName=" + docName + ", docNumber=" + docNumber + ", docDesignation=" + docDesignation + '}';
    }
    
    
    
    
    
}
