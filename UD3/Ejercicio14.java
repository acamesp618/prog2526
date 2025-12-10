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
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota primer trimestre: ");
        int n1 = sc.nextInt();
        
        System.out.print("Nota segundo trimestre: ");
        int n2 = sc.nextInt();
        
        System.out.print("Nota tercer trimestre: ");
        int n3 = sc.nextInt();
        
        double media_decimal = (n1 + n2 + n3) / 3.0;
        // 3.0 para que sea decimal
        
        int media = (n1 + n2 + n3) / 3;
        
        System.out.println("La media es: " + media);
        System.out.println("La media con decimales es: " + media_decimal);
    }
}
