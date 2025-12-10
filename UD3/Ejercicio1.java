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
public class Ejercicio1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); //crea el nuevo escaner
    
    System.out.print("Introduce un número: ");
    int numero = sc.nextInt(); // declaramos la variable numero
    //escribimos un numero en el area de output y pulsamos intro
    //ahora disponemos del valor introducido, a traves de la variable numero
    System.out.println("Ha escrito: " + numero);
    }
}
