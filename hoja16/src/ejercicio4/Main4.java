package ejercicio4;

import ejercicio3.OutOfRange;
import java.util.Scanner;

/**
 *
 * @author Albano Díez de Paulino
 */
/*4. Realizar un programa que controle que lea de teclado un número y compruebe que 
se encuentra dentro del rango 0-100. En caso de no encontrarse, deberá lanzar una 
excepción y seguir pidiéndolo. Indicar el número de intentos utilizados.*/

public class Main4 {

    public static void main(String[] args) {
        int contador=0;
        boolean control = false;
        do {
            try {
                int x = 0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Dime un numero de 0 a 100");
                x = sc.nextInt();
                if (x < 0 || x > 100) {
                    contador++;
                    throw new OutOfRange();
                  
                }
                control = false;
            } catch (OutOfRange e) {
                System.err.println("Numero fuera de rango");
                System.err.println("Tiene que ser entre 0 y 100");
                control = true;
            } catch (Exception e) {
                System.err.println("Excepcion generica");
                control = true;
            }
        } while (control);
    }
}

