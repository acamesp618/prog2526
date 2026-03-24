package UD6ejercicio3;

public class Motorcycle extends Vehicle{
	private boolean hasSidecar;

	public Motorcycle(String licensePlate, String brand, int year, FuelType fuelType, boolean hasSidecar) {
		super(licensePlate, brand, year, fuelType);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public double calculateSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
