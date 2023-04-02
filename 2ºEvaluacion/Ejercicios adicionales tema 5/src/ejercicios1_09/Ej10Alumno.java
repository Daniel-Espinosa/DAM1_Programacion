/*10.- Diseñar una clase llamada Alumno con los atributos privados: nombre del alumno y
un array con las 5 notas enteras de ese alumno y los siguientes métodos públicos:
• Un constructor que dimensiona el array e inicialice los atributos con los valores
introducidos por teclado y el nombre se pasa como argumento de entrada.
• Método llamado mayor que devuelve la mejor nota.
• Método llamado menor que devuelve la menor de las notas .
• Método llamado mostrar que devuelve una cadena donde se muestre el nombre
del alumno, en mayúsculas, seguido de su nota media.
Desde la clase principal declarar un objeto de tipo alumno y probar los métodos de la
clase.
*/
package ejercicios1_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej10Alumno {
    //atributos privados: nombre del alumno y un array con las 5 notas enteras de ese alumno
    
    private String alumno;
    private int notas[] = new int[5];
    
    /*• Un constructor que dimensiona el array e inicialice los atributos con los valores
introducidos por teclado y el nombre se pasa como argumento de entrada.*/
    public Ej10Alumno (){
        int cont=0;
        Scanner scA = new Scanner(System.in);
        System.out.println("introduce el nombre del alumno");
        alumno=scA.next();
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce la " + (cont+1) +"º nota");
                notas[cont]=sc.nextInt();
                cont++;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero entero");
            }catch (Exception e){
                System.err.println("Exception");
            }  
        } while (cont<5);
    }

    
    
    
    


}
