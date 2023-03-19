package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Albano Díez de Paulino
 */
/*1. Realiza un programa que controle mediante excepciones la introducción de datos 
correctos para una variable de tipo entero y para otra de tipo double, y que se repita 
mientras que no se introduzca un dato correcto. La introducción de datos es por teclado 
y la excepciones que hay que controlar son (NumberFormatException y Exception)*/
public class Main1 {

    public static void main(String[] args) {
        int x = 0;
        double y = 0;
        boolean control = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Dime un numero entero");
                x=sc.nextInt();
                System.out.println("Dime un numero decimal");
                y=sc.nextDouble();
                control=false;

            } catch(NumberFormatException f){//Salta en el parse,no en la lectura
                System.err.println("Formato de numero incorrecto");
                sc.next();
                control=true;
                
            } catch (Exception e) {
                System.err.println("Error de formato");
                sc.next();
                control=true;
            }

        } while (control);

    }

}
