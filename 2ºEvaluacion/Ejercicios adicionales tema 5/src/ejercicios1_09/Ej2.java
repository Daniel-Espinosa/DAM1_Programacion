/*
2.- Realizar un programa que lea por teclado la temperatura de 10 ciudades y muestre
la temperatura media de todas ellas.*/
package ejercicios1_09;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class Ej2 {

    public static void main(String[] args) {
        
        
        LinkedList<Double> lista = new LinkedList<Double>();
        int cont = 0;
        
        do {
            try {
            Scanner sc = new Scanner (System.in);
            System.out.println("introduce la temperatura de una ciudad " + (cont+1));
            lista.add(sc.nextDouble());
            
            cont ++;
            } catch (InputMismatchException e) {
                System.err.println("introduce un numero valido");  
            } catch (Exception e){
                System.err.println("Exception");
            }
            
            
        } while (cont < 10);
        
        double suma=0;
        for (Double double1 : lista) {
            suma = suma+double1;
        }

        System.out.println("temperatura media " + (suma/lista.size()) );

    }
    
}
