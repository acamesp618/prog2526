package UD6ejercicio3;

public class main {

	public static void main(String[] args) {
		Vehicle car1 = new Car("23656P", "Toyota", 2010, FuelType.GASOLINE, 5);
		Vehicle car2 = new Car("92148P", "Citroen", 2004, FuelType.DIESEL, 3);
		Vehicle moto1 = new Motorcycle("12485O", "Yamaha", 2018, FuelType.GASOLINE, true);
		Vehicle moto2 = new Motorcycle("56952L", "Yamaha", 2006, FuelType.GASOLINE, false);
		
		System.out.println(car1.getVehicleInfo());
		System.out.println(moto1.getVehicleInfo());
		System.out.println(Vehicle.getTotalVehicles());
		System.out.println(car1); //Llamada toString()
		car1.equals(car2); //Comparar con equals coche1 con coche 2
		
	}
	
	
	
}
