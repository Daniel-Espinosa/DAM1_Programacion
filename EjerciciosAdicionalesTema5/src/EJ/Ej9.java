/*Desde una función principal declarar objetos de la clase Invierno y probar los métodos
de la clase. Por ejemplo, si declaramos un objeto Invierno y le pasamos como argumento
5, el constructor dimensiona el array con 5 elementos y nos pide las 5 temperaturas.*/
package EJ;

import java.util.Scanner;


public class Ej9 {

    public static void main(String[] args) {
        Ej9Invierno listaC;
        Ej9Invierno listaF = new Ej9Invierno();
        
        System.out.println("Introduce cuantas temperaturas quieres almacenar");
        Scanner sc = new Scanner (System.in);
        listaC = new Ej9Invierno(sc.nextInt());
        
        System.out.println("Temperatura media " + listaC.temp_media());
        //System.out.println("Temperaturas almacenadas " + listaC.mostrar(listaC));
        
        System.out.println(listaC.mostrar(listaC.fahrenheit2()));
        
        
    }
    
}
