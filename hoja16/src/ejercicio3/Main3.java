package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Albano Díez de Paulino
 */
/*3. Realizar un programa que lea por teclado un número y compruebe que se encuentra 
dentro del rango 0-100. En caso de no encontrarse, deberá lanzar una excepción y seguir 
pidiéndolo. Realiza el programa de dos formas distintas. Una función rango que controle 
y trate las excepciones. Otra función rango2 que lance el tratamiento de las excepciones 
al programa en donde es ejecutada.*/
public class Main3 {

    public static void main(String[] args) {

        //FORMA 1
        System.out.println("FORMA 1 DE TRATAMIENTO");
        rango();

        //FORMA 2
        System.out.println("FORMA 2 DE TRATAMIENTO");
        boolean control = false;
        do {
            try {
                rango2();
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

    public static void rango() {
        int x = 0;
        boolean control = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Dime un numero de 0 a 100");
                x = sc.nextInt();
                if (x < 0 || x > 100) {
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

    public static void rango2() throws OutOfRange,Exception {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero de 0 a 100");
        x = sc.nextInt();
        if (x < 0 || x > 100) {
            throw new OutOfRange();
        }
    }

}
