/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosud3;

import java.util.Scanner;

/**
 *
 * @author adri_
 */
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero decimal: ");
        double n = sc.nextDouble();
        
        boolean casiCero = Math.abs(n) < 1 && n != 0;
        
        System.out.println("¿Es casi-cero?: " + casiCero);
    }
}
