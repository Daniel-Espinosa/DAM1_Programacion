/*
5. Realizar un programa que tenga un método estático dividir (en la propia clase
Principal), que reciba dos parámetros (dividendo y divisor) y devuelva el resultado de la
división. Este método podrá lanzar una excepción del tipo ArithmeticException.
Después, desde el método main, pedir 2 números y llamar al método dividir pasando
estos datos como parámetros. Debéis capturar las posibles excepciones que se
produzcan en el lugar donde se produce la llamada, no en los propios métodos.*/
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int divd = 0, divs = 0;
        boolean contr = true;
        
        do {
            try {
                System.out.println("Introduce el Dividendo");
                divd = pedirNum();
                contr = false;
            } catch (NumberFormatException e) {
                System.err.println("Formato numero incorrrecto");
            } catch (Exception e) {
                System.err.println("Exception");
            }
        } while (contr);
        
            contr = true;
        do {
            try {
                System.out.println("Introduce el Divisor");
                divs = pedirNum();
                contr = false;
            } catch (NumberFormatException e) {
                System.err.println("Formato numero incorrrecto");
            } catch (Exception e) {
                System.err.println("Exception");
            }
        } while (contr);
        
        try {
            System.out.println(dividir(divd, divs));
        } catch (ArithmeticException e) {
            System.err.println("no se puede dividir entre 0");
        } catch (Exception e) {
            System.err.println("Exception2");
        }

        
    }
    
    public static int pedirNum() throws NumberFormatException{
        Scanner sc =new Scanner(System.in);
        String linea;
        int num;
        
        linea = sc.next();
        num = Integer.parseInt(linea);     
        
        return num;
    }
    
    
    
    public static double dividir (int a, int b) throws ArithmeticException{
        
        return a/b;
    }
    
}
