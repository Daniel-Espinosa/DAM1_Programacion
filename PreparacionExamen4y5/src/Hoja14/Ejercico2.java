/*Ejercicio 2: Realiza una aplicación que pida diferentes nombres con el fin de visualizarlos
en el orden que se insertaron y en orden contrario. Para saber si el usuario quiere
insertar más nombres se pregunta
¿Quiere insertar otro nombre? s/n*/
package Hoja14;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercico2 {

    public static void main(String[] args) {

        Scanner scT = new Scanner(System.in);
        boolean control = true;
        LinkedList <String> nombres = new LinkedList<>();
        
        
        do {
            System.out.println("desea introducir nombre S/N");
            String opc =scT.next();
            opc = opc.toUpperCase();
            switch (opc) {
                case "S":
                    System.out.println("introduce un nombre");
                    nombres.add(scT.next());
                    break;
                case "N":
                    System.out.println("Adios!");
                    control = false;
                    break;
                default:
                    System.err.println("introduce una opcion valida!");
            }
            
        } while (control);
        
        
        System.out.println("listado al derecho");
        for (String i : nombres) {
            System.out.println(i);
        }
        
        System.out.println("listado a la contra");
        for (int i = nombres.size()-1; i > -1; i--) {
            System.out.println(nombres.get(i));
        }
        



    }
    
}
