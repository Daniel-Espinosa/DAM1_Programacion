/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini.juego;

import java.util.Scanner;

/**
 *
 * @author produccion
 */
public class MiniJuego {

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        //Declaramos las variables
        String letra;
        Scanner lectura = new Scanner(System.in);
        
        //Do para hacer un bucle con un menu que se repita hasta que se introduzca la letra d
	do {
            System.out.println("\nElige un juego:");
            System.out.println("a- Juego 1");
            System.out.println("b- Juego 2");
            System.out.println("c- Juego 3");
            System.out.println("d- Salir");

            System.out.println("\nIntroduce una letra");
            letra=lectura.next();

            //Switch para enlazar cada letra del menu con un caso que realiza una derterminada operacion
            switch (letra) {
                case "a":
                    System.out.println("Este es el primer juego:");
                    Juego1.JuegoPalabras();
                    break;
                case "b":
                    System.out.println("Black Jack");
                    Juego2.blackJack();
                    break;
                case "c":
                    Cartas.asignarValores();
                    break;
                     
                case "d":
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Este opcion no existe");
                    break;
            }
        //Bucle while para cuando pongamos la letra d, el menu se cierre
        } while (!letra.equals("d"));
    }
    
}
