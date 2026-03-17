package UD5ejercicio1;

class CuentaBancaria {
	// Atributos
	private String titular;
	private double saldo;
	
	
	// Constructor
	CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	//Metodos
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0)
			saldo = saldo + cantidad;
	}
	
	public void retirar(double cantidad) {
		if (cantidad <= saldo) 
			saldo = saldo - cantidad;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
}
