/*
3. Realizar un programa que lea por teclado un número y compruebe que se encuentra
dentro del rango 0-100. En caso de no encontrarse, deberá lanzar una excepción y seguir
pidiéndolo. Realiza el programa de dos formas distintas. Una función rango que controle
y trate las excepciones. Otra función rango2 que lance el tratamiento de las excepciones
al programa en donde es ejecutada.
*/
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    
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

        System.out.println("fin mentodo 1 \n");
        System.out.println("inicio metodo 2 \n");
        rango2();
        
    }
    
    public static int rango  () throws Exception, NumberFormatException{
        
        Scanner sc = new Scanner(System.in);
        String linea;
        int numero;
        
        System.out.println("introduce un numero entre 0 y 100");
        linea = sc.next();
        numero = Integer.parseInt(linea);
        
        if (numero <0 || numero >100) {
            throw new Exception ("Fuera de rango");
        }
                
        return numero;
    }
    
    
    public static void rango2() {
        
        boolean contr = true;
        int num;
        String linea;
        
        do {
            try {
                System.out.println("introduce un numero entero entre 0 y 100");
                Scanner sc = new Scanner (System.in);
                linea= sc.next();
                num= Integer.parseInt(linea);
                
                if (num <0 || num > 100) {
                    throw new Exception ("Fuere de Rango");
                }
                contr=false;
            
            } catch (NumberFormatException e) {
                System.err.println("Introduce un numero entero");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
 
            
        } while (contr);
      
        
    }
    
}
