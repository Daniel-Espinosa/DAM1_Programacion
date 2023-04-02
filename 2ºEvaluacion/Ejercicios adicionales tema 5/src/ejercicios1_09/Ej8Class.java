/*8.- Realizar una clase que se componga:
• Un array de cinco elementos de tipo entero.
• Constructor que solicite al usuario los valores correspondientes a cada elemento.
• Método que devuelva el valor menor del array.
• Método que devuelva el valor mayor del array.
• Método que devuelva la media de todos los valores del array.
Haz un programa principal que pruebe todos los métodos probados.*/
package ejercicios1_09;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej8Class {
    
    // Un array de cinco elementos de tipo entero.
    public int array[] = new int[5];
    
    //• Constructor que solicite al usuario los valores correspondientes a cada elemento.
    public void Ej8Class(){
        int cont = 0;
        
        do {
            try {
                System.out.println("dame el " + (cont+1) +"º numero");
                Scanner sc = new Scanner(System.in);
                array[cont]= sc.nextInt();
                cont++;
            } catch (InputMismatchException e) {
                System.err.println("introduce un numero entero");
            } catch (Exception e){
                System.err.println("Exception");
            }
        } while (cont<array.length);
    }
    
    //• Método que devuelva el valor menor del array.
    public int menor(){
        int men = array[0];
        for (int i : array) {
            if (men>i) {
                men=i;
            }
        }
        return men;
    }
    
    //• Método que devuelva el valor mayor del array.
    public int mayor(){
        int may = array[0];
        for (int i : array) {
            if (may<i) {
                may=i;
            }
        }
        return may;
    }
    
    //• Método que devuelva la media de todos los valores del array.
    public double media(){
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum/array.length;
    }
    
    
    
}
