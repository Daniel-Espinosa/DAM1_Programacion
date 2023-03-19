/*7.- Realizar una clase que se componga de:
• Un array como atributo de cinco elementos de tipo entero
• Constructor por defecto que solicite los valores correspondientes a cada
elemento.
Y al menos los siguientes métodos:
• Método que multiplique cada elemento por dos.
• Método que muestre el contenido del array por pantalla
• Método que devuelva la suma de todos los elementos del array que se
encuentran en posiciones pares.
En el programa principal, prueba todos los métodos desarrollados*/
package EJ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7Class {
    //• Un array como atributo de cinco elementos de tipo entero
    int array[]=new int[5];
    
    //• Constructor por defecto que solicite los valores correspondientes a cada elemento.
    public void Ej7Class(){
        int conta = 0;
        
        do {
            try {
                System.out.println("introduce un numero");
                Scanner sc = new Scanner (System.in);
                array[conta]=sc.nextInt();
                conta++;
                
            } catch (InputMismatchException e) {
                System.err.println("introduce un valor de tipo entero");
            } catch (Exception e){
                System.err.println("Exception");
            }
        } while (conta<array.length);
        
    }
    
    
    //• Método que multiplique cada elemento por dos.
    public void multiplicaXdos(){
        for (int i : array) {
            System.out.println("valor " + i + " x 2 = " + (i*2));
        }
    }
    
    //• Método que muestre el contenido del array por pantalla
    public void muestra(){
        for (int i : array) {
            System.out.println(i);
        }
    }
    //• Método que devuelva la suma de todos los elementos del array que se encuentran en posiciones pares.
    
    public void sumaPar(){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            if (i%2==0) {
                suma = suma + array[i];
            }
        }
        System.out.println("la suma de las posiciones pares es " + suma );
        
        
    }
    
    
    
}
