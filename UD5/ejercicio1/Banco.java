package UD5ejercicio1;

class Banco {
	static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria("David", 2000);
		cuenta1.ingresar(1000);
		cuenta1.retirar(150);
		cuenta1.setTitular("David Real");
		System.out.println("Saldo total: " + cuenta1.getSaldo());
	}
}
