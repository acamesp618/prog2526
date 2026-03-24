package UD6ejercicio3;

public abstract class Vehicle implements Maintenance {
	private String licensePlate;
	private String brand;
	private int year;
	private FuelType fuelType;
	static int vehicleCount;

	//Constructor
	public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.year = year;
		this.fuelType = fuelType;
		vehicleCount ++;
	}
	
	
	//Getter y Setter
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public static int getVehicleCount() {
		return vehicleCount;
	}
	public static void setVehicleCount(int vehicleCount) {
		Vehicle.vehicleCount = vehicleCount;
	}
	
	//Metodos
	public abstract double calculateSpeed();
	
	public String getVehicleInfo() {
		return "License:"  + licensePlate + ", Brand:" + brand + "Year:" + year + "Fuel type:" + fuelType;
	}
	
	public String nextMaintenanceDate() {
		return String.valueOf(year); //Ejemplo para pasar el año a String
	}
	
	public static int getTotalVehicles() {
		return vehicleCount;
	}
	
	@Override
	public boolean equals(Object obj) {
       if (this == obj) 
    	   return true;
       else if (this.licensePlate.equals(((Vehicle)obj).licensePlate)) 
    	   return true;
       else {
    	   return false;
       }
    }


	@Override
	public String toString() {
		return "Vehicle [licensePlate=" + licensePlate + ", brand=" + brand + ", year=" + year + ", fuelType="
				+ fuelType + "]";
	}
	

	
}
