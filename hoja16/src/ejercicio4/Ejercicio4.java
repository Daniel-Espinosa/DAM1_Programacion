/*
4. Realizar un programa que controle que lea de teclado un número y compruebe que
se encuentra dentro del rango 0-100. En caso de no encontrarse, deberá lanzar una
excepción y seguir pidiéndolo. Indicar el número de intentos utilizados.
*/
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    
    static int contador;

    public static void main(String[] args) {

        boolean contr = true;
        int num;
        
        do {
            
            try {
                num = rango();
                contr = false;
            } catch (NumberFormatException e) {
                System.err.println("Formato incorrecto introduce un numero entero");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            
        } while (contr);

        System.out.println("conteo: " + contador);
        
    }
    
    public static int rango  () throws Exception, NumberFormatException{
        
        Scanner sc = new Scanner(System.in);
        String linea;
        int numero;
        contador++;
        
        System.out.println("introduce un numero");
        linea = sc.next();
        numero = Integer.parseInt(linea);
        
        if (numero <0 || numero >100) {
            throw new Exception ("Fuera de rango");
        }
        
        
        return numero;
    }
    
}
