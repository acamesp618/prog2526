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
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de mes: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12 -> System.out.println("31 dias");
            case 4,6,9,11 -> System.out.println("30 dias");
            case 2 -> System.out.println("28 dias (29 en bisiesto)");
            default -> System.out.println("Mes invalido");
        }
    }
}
