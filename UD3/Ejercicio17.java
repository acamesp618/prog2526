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
public class Ejercicio17 {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero 1: ");
        int a = sc.nextInt();
        
        System.out.print("Numero 2: ");
        int b = sc.nextInt();
        
        if (a==b){
            System.out.print("Son iguales.");
        } else {
            System.out.print("No son iguales.");
            if (a>b)System.out.print("El mayor es: "+ a);
            else System.out.print("El mayor es: "+ b);
        }
    }
}
