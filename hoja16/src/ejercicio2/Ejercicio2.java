/*
2. Se desea implementar un programa que calcule la división de dos números enteros,
pero en él se debe controlar mediante excepciones, que la división es correcta, es decir,
que no se divide por cero (ArithmeticException). También se deberá controlar que no se
introduzcan datos de tipo erróneo. Se debe crear una función división que realice el
cálculo. La función no tiene parámetros y se piden los valores por teclado.
*/
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        
        int dividendo,divisor;
        String linea;
        boolean cont = true;
        
        do {
            try {
                Scanner sc =new Scanner(System.in);
                System.out.println("introduce el dividendo (numero entero)");
                linea = sc.next();
                dividendo = Integer.parseInt(linea);
                System.out.println("introduce el divisor (numero entero)");
                linea = sc.next();
                divisor = Integer.parseInt(linea);
                System.out.println("la el resultado de dividir " + dividendo + " entre " + divisor + " es: " +(dividendo/divisor));
                cont = false;
            } catch (ArithmeticException e) {
                System.err.println("No se puede dividir entre 0");    
            }catch (NumberFormatException e) {
                System.err.println("Introduce un numero entero");  
            }catch (Exception e) {
                System.err.println("Exception");
            } 
            
        } while (cont);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
