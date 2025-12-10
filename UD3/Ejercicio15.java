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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero decimal: ");
        double num = sc.nextDouble();

        int redondeado = (int) num;

        System.out.println("Redondeado: " + redondeado);
    }
}
