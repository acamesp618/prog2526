/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud3.actividades;

import java.util.Scanner;

/**
 *
 * @author 07_1DAW_Alum
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        float n1 = sc.nextFloat();
        
        System.out.print("Nota 2: ");
        float n2 = sc.nextFloat();
        
        double media = (n1 + n2) / 2.0;
        // 2.0 para que sea decimal
        
        System.out.println("La media es: " + media);
    }
}
