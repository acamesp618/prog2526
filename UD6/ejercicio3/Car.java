package UD6ejercicio3;

public class Car extends Vehicle {
	
	private int numberOfDoors;
	
	//Constructor
	public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
		super(licensePlate, brand, year, fuelType);
		this.numberOfDoors = numberOfDoors;
	}

	//Getter y Setter numberOfDoors
	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	//Metodos
	@Override
	public double calculateSpeed() {
		return 0;
	}


	
	
	
}
