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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        System.out.print("Manzanas Semestre 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Manzanas Semestre 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Peras Semestre 1: ");
        double p1 = sc.nextDouble();
        System.out.print("Peras Semestre 2: ");
        double p2 = sc.nextDouble();

        double total = (m1+m2)*PRECIO_MANZANA + (p1+p2)*PRECIO_PERA;

        System.out.println("Beneficio total: " + total+'€');
    }
}
