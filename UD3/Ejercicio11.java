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
public class Ejercicio11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int a = sc.nextInt();

        System.out.print("Número 2: ");
        int b = sc.nextInt();

        int mayor = (a > b) ? a : b;

        System.out.println("El mayor es: " + mayor);
    }
}
