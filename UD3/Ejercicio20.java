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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe tu nota: ");
        int nota = sc.nextInt();
        
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("ERROR: Nota no valida");
        }
                
        String notafinal = switch (nota) {
            case 0,1,2,3,4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7,8 -> "Notable";
            case 9,10 -> "Sobresaliente";
            default -> "ERROR_no_valido";
        };
        System.out.println("La nota es: " + notafinal);
        }
    }

