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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Llueve? ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado tareas? ");
        boolean tareas = sc.nextBoolean();

        System.out.print("¿Debes ir a la biblioteca? ");
        boolean biblio = sc.nextBoolean();

        boolean puede = (!llueve && tareas) || biblio;

        System.out.println("¿Puedes salir?: " + puede);
    }
}
