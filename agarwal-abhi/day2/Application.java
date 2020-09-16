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
public class Application {

    public static void main(String[] args) {
        
        InsurancePolicy hold1= new InsurancePolicy(451, "Abhishek", 22,1000);
        
        
        double calculatePremium= hold1.getPolicyAmount();
        
        System.out.println(hold1.getPolicyHolderName()+"--"+hold1.getPolicyNumber()+"--"+calculatePremium);
        
        
        
        VehicleInsuarance vh1= new VehicleInsuarance(700, "Abhishek", 22, 8000, "TWO", 2019, 90000);
        
        System.out.println("Total Cost"+vh1.getPolicyAmount());
        
    }
    
}
