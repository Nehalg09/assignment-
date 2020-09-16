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
public class VehicleInsuarance extends InsurancePolicy{
    
    
	private String vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
        
        public VehicleInsuarance(){
            super();
        }

    public VehicleInsuarance(int policyNumber,String policyHolderName,int policyHolderAge,int insuaredAmount,String vehicleModel, int yearOfManufacture, double costOfVehicle) {
        
        super(policyNumber,policyHolderName,policyHolderAge,insuaredAmount);
        this.vehicleModel = vehicleModel;
        this.yearOfManufacture = yearOfManufacture;
        this.costOfVehicle = costOfVehicle;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getCostOfVehicle() {
        return costOfVehicle;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setCostOfVehicle(double costOfVehicle) {
        this.costOfVehicle = costOfVehicle;
    }
    
    
    @Override
    
    public double getPolicyAmount(){
    
        double totalAmount=0.0;
        
        if(getVehicleModel().equals("TWO"))
        {
            if(getYearOfManufacture() > 2016)
                totalAmount = (50*getCostOfVehicle())/100;
            else
                totalAmount = (60*getCostOfVehicle())/100;
        }
        
        return totalAmount;
    }
}
