/*
1. Realiza un programa que controle mediante excepciones la introducción de datos
correctos para una variable de tipo entero y para otra de tipo double, y que se repita
mientras que no se introduzca un dato correcto. La introducción de datos es por teclado
y la excepciones que hay que controlar son (NumberFormatException y Exception)
*/
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
       
        int entero;
        double doble;
        String linea;
        Scanner scNum =new Scanner(System.in);

        boolean contr = true;
        
        System.out.println("metodo 1");
        do {
            
            try {
                System.out.println("introduce un numero entero");
                entero = scNum.nextInt();
                System.out.println("Introduce un numero con decimales");
                doble = scNum.nextDouble();
                contr = false;
            } catch (NumberFormatException e) {
                scNum.next();
                System.err.println("Error de introduccion de dato");
            } catch (Exception e) {
                scNum.next();
                System.err.println("Exception");
            }
            
        } while (contr);
        
        contr = true;
        
        System.out.println("metodo 2");
        do {
            
            try {
                Scanner scTxt =new Scanner(System.in);
                System.out.println("introduce un numero entero");
                linea=scTxt.nextLine();
                entero = Integer.parseInt(linea);
                System.out.println("Introduce un numero con decimales");
                linea=scTxt.nextLine();
                doble = Double.parseDouble(linea);
                contr = false;
            } catch (NumberFormatException e) {
                System.err.println("Error de introduccion de dato");
            } catch (Exception e) {
                System.err.println("Exception");
            }
            
        } while (contr);
        
        
        
        
    }
    
}
