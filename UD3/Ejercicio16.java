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
public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);
        
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        
        if (n >= min && n <= max) {
            System.out.println("El numero esta en el rango.");
            System.out.println("a = " + a + ", b = " + b);
        }
        
        System.out.println("Numero introducido: " + n);
    }
}
