/*
Una clase abstracta (con al menos un método abstracto).
 */
package tarea4;

import java.util.Scanner;


public abstract class abstracta {
    
    //atriburos
    int resultado; //atributo3
    short valor = -1; // atributo4
    Scanner lecturaShort = new Scanner (System.in);
    
    //Método abstracto
    public abstract void suma();
    
    //pedir valores por teclado
    
    
    public short pedirDatos(){
        do {
            try{ //inicializamos el try catch si al introducir el valor da error nos lo vuelve a pedir.
                System.out.println("introduce un numero para sumar: ");
                valor = lecturaShort.nextShort();
            }catch (Exception e) {
                lecturaShort.next();
                valor = -1;
                System.out.println("introduce un numero entre 0 y 32767");
            }
        } while (valor<0); // el valor introducido tiene que ser mayor que 0
        
        return valor;
    }
        
}
