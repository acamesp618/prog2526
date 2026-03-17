package UD5ejercicio13;

import java.util.Scanner;

public class Calculadora {
	private static Scanner sc = new Scanner(System.in);
	private static double resultado;
	
	private static final double PI = 3.14; // La hacemos constante y final
	// El nombre del valor en mayuscula
	
	public static void menu() {
		// El menú para elegir qué operación queremos realizar
		System.out.println("Introducta una opción:");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1 -> resultado = sumar();
		case 2 -> resultado = restar();
		case 3 -> resultado = multiplicar();
		case 4 -> resultado = dividir();
		default -> System.out.println("Error");
		}
	}
	
	// Sumar
    public static double sumar() {
    	System.out.println("Introduzca dos número:");
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	//Invocar a Operaciones
        return Operaciones.sumar(a, b);
    }
    
    // Restar
    public static double restar() {
    	System.out.println("Introduzca dos número:");
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	//Invocar a Operaciones
        return Operaciones.restar(a, b);
    }
    
    // Multiplicar
    public static double multiplicar() {
    	System.out.println("Introduzca dos número:");
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	//Invocar a Operaciones
        return Operaciones.multiplicar(a, b);
    }
    
    //Dividir
    public static double dividir() {
    	System.out.println("Introduzca dos número:");
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	//Invocar a Operaciones
        return Operaciones.dividir(a, b);
    }
    
    public static void resultado() {
    	System.out.println("Resultado: " + resultado);
    }
}
