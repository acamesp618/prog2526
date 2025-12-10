/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud3;

/**
 *
 * @author adri_
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println("Tabla del " + i);
            for (int j=1; j<=10; j++)
                System.out.println(i + " x " + j + " = " + (i*j));
            System.out.println();
        }
    }
}
