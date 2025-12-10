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
public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Año actual: ");
        int actual = sc.nextInt();
        
        System.out.print("Año de nacimiento: ");
        int nacimiento = sc.nextInt();
        
        int edad = actual - nacimiento;
        
        System.out.println("Tu edad es: " + edad);
    }
}
