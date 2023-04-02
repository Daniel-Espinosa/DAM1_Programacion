package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Albano Díez de Paulino
 */
/*2. Se desea implementar un programa que calcule la división de dos números enteros, 
pero en él se debe controlar mediante excepciones, que la división es correcta, es decir, 
que no se divide por cero (ArithmeticException). También se deberá controlar que no se 
introduzcan datos de tipo erróneo. Se debe crear una función división que realice el 
cálculo. La función no tiene parámetros y se piden los valores por teclado.
 */
public class Main2 {

    public static void main(String[] args) {
        double divisor = 0, dividendo = 0;
        boolean control = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Dime el dividendo");
                dividendo = sc.nextDouble();
                System.out.println("Dime el divisor");
                divisor = sc.nextDouble();
                System.out.println("La divison es :" + (dividendo/divisor));
                control = false;

            } catch (ArithmeticException e) {
                System.err.println("Entre 0 no se puede dividir picha");
                sc.next();
                control = true;

            }catch (Exception e) {
                System.err.println("Error de formato");
                sc.next();
                control = true;
            }

        } while (control);

    }

}
