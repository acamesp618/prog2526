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
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();
        
        final double PI = 3.141592; // constante
        
        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;
        
        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);
    }
}