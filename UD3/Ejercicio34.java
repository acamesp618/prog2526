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
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        int idArbol = 0;        // contador de árboles
        int mayorAltura = -1;   // la altura más alta encontrada
        int idMayor = -1;       // el ID del árbol más alto

        System.out.print("Introduce la altura del árbol 0 (-1 para terminar): ");
        altura = sc.nextInt();

        while (altura != -1) {

            // Comprobar si es el más alto
            if (altura > mayorAltura) {
                mayorAltura = altura;
                idMayor = idArbol;
            }

            // Pasamos al siguiente árbol
            idArbol++;

            System.out.print("Introduce la altura del árbol " + idArbol + " (-1 para terminar): ");
            altura = sc.nextInt();
        }

        System.out.println("\nRESULTADO:");
        if (mayorAltura == -1) {
            System.out.println("No se introdujo ningún árbol.");
        } else {
            System.out.println("El árbol más alto es el de ID " + idMayor +
                               " con una altura de " + mayorAltura + " cm.");
        }
    }
}
