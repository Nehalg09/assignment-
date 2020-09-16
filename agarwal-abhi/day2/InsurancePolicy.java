/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Abhishek Agarwal
 */
public class InsurancePolicy {
    
    
    private int policyNumber;
    private String policyHolderName;
    private int policyHolderAge;
    private int insuaredAmount;
    
    public InsurancePolicy()
    {
        super();
    }
    
    
    public InsurancePolicy(int policyNumber, String policyHolderName,int policyHolderAge,int insuaredAmount){
        super();
        this.policyNumber= policyNumber;
        this.policyHolderName= policyHolderName;
        this.policyHolderAge= policyHolderAge;
        this.insuaredAmount= insuaredAmount;
    }

    
    
    
    
    
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void setPolicyHolderAge(int policyHolderAge) {
        this.policyHolderAge = policyHolderAge;
    }
    
    public double getPolicyAmount(){
        
        double premium=0;
        
        if(policyHolderAge<25)
            premium = 0.6*insuaredAmount;
        else
            premium= 0.7* insuaredAmount;
        
        return premium;
        
    }
    
    
    
}
