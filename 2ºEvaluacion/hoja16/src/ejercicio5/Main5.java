package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Albano Díez de Paulino
 */
/*5. Realizar un programa que tenga un método estático dividir (en la propia clase 
Principal), que reciba dos parámetros (dividendo y divisor) y devuelva el resultado de la 
división. Este método podrá lanzar una excepción del tipo ArithmeticException.
Después, desde el método main, pedir 2 números y llamar al método dividir pasando 
estos datos como parámetros. Debéis capturar las posibles excepciones que se 
produzcan en el lugar donde se produce la llamada, no en los propios métodos*/
public class Main5 {

    public static void main(String[] args) {
        int divisor = 0, dividendo = 0;
        boolean control = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Dime el dividendo");
                dividendo = sc.nextInt();
                System.out.println("Dime el divisor");
                divisor = sc.nextInt();
                System.out.println("La divison es :" + dividir(dividendo,divisor));
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
    
    public static double dividir(int dividendo,int divisor){
        return dividendo/divisor;
    }
    
}
