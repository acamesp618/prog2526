package ejercicio14;

import java.io.Serializable;

public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
	
	private String nombre;
    private double peso;
    private double valor;

    public Item(String nombre, double peso, double valor) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nombre + " | Peso: " + peso + " | Valor: " + valor;
    }
}