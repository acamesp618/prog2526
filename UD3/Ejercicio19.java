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
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int a = sc.nextInt();
        System.out.print("Segundo numero: ");
        int b = sc.nextInt();
        System.out.print("Tercer numero: ");
        int c = sc.nextInt();

        int mayor, medio, menor;

        if (a >= b && a >= c) {
            mayor = a;
            medio = Math.max(b,c);
            menor = Math.min(b,c);
        } else if (b >= a && b >= c) {
            mayor = b;
            medio = Math.max(a,c);
            menor = Math.min(a,c);
        } else {
            mayor = c;
            medio = Math.max(a,b);
            menor = Math.min(a,b);
        }

        System.out.println(mayor + " " + medio + " " + menor);
    }
}
