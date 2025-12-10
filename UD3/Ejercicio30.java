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
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elementos de lado: ");
        int n = sc.nextInt();

        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
