/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud3.actividades;

import java.util.Scanner;

/**
 *
 * @author 07_1DAW_Alum
 */
public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        int edadSiguiente = edad + 1;
        
        System.out.println("El año que viene tendrás: " + edadSiguiente);
    }
}
