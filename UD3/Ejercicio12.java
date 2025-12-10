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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int n = sc.nextInt();

        System.out.println("Valor absoluto: " + Math.abs(n));
        
        
        /* Con ternario  */
        int absoluto = (n >= 0) ? n : -n;
        System.out.println("Valor absoluto (ternario): " + absoluto);
    }
}
