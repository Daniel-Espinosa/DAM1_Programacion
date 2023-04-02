/*9.- Se pretende diseñar una clase llamada Invierno que tiene como atributo privado un
array de temperaturas (double) en grados Celsius y como métodos públicos:
• Un constructor que recibe como argumento un numero n, dimensiona el array
con n elementos y pide las n temperaturas por teclado
• Un método llamado temp_media que nos devuelve la temperatura media.
• Un método llamado fahrenheit que devuelve un nuevo array con todas las
temperaturas en grados Fahrenheit. Para pasar temperaturas de grados Celsius a
Fahrenheit utilizar la fórmula: F=C*1.8+32;
• Un método llamado mostrar que devuelve una cadena que contiene los valores
de un array. Como parámetro de entrada al método es el array.
Desde una función principal declarar objetos de la clase Invierno y probar los métodos
de la clase. Por ejemplo, si declaramos un objeto Invierno y le pasamos como argumento
5, el constructor dimensiona el array con 5 elementos y nos pide las 5 temperaturas.*/
package ejercicios1_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9Invierno {
    //tributo privado un array de temperaturas (double) en grados Celsius
    private double array[];

    
    public Ej9Invierno(){
        
    }
    
    /*• Un constructor que recibe como argumento un numero n, dimensiona el array
    con n elementos y pide las n temperaturas por teclado*/
    public Ej9Invierno(int n){
        this.array = new double[n];
        int cont = 0;
        do {
            try {
                System.out.println("introduce la " + (cont+1) +"º temperatura");
                Scanner sc = new Scanner(System.in);
                array[cont] = sc.nextDouble();
                cont++;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un valor correcto");
            } catch (Exception e){
                System.err.println("Exception");
            } 
        } while (cont<n);  
    }
    
    //• Un método llamado temp_media que nos devuelve la temperatura media.
    public double temp_media(){
        double suma=0;
        for (double d : array) {
            suma += d;
        }
        return suma/array.length;  
    }
    
    /*• Un método llamado fahrenheit que devuelve un nuevo array con todas las
temperaturas en grados Fahrenheit. Para pasar temperaturas de grados Celsius a
Fahrenheit utilizar la fórmula: F=C*1.8+32;*/
   public double[] fahrenheit(double[] a){
       this.array = new double[a.length];
       for (int i = 0; i < array.length; i++) {
           array[i]=a[i]*1.8+32;
       }
       return array;
   }
   
    public double[] fahrenheit2(){
       double[] array2 = new double[array.length];
       for (int i = 0; i < array.length; i++) {
           array2[i]=array[i]*1.8+32;
       }
       return array2;
   } 
   
   /*• Un método llamado mostrar que devuelve una cadena que contiene los valores
de un array. Como parámetro de entrada al método es el array.*/
   /*public String mostrar(){
       String linea = "";
       for (double d : array) {
           linea = linea + " " + d;
       }
       return linea;
   }*/
   
   public String mostrar(double[] array){
       String linea = "";
       for (double d : array) {
           linea = linea + " " + d;
       }
       return linea;
   }
       
   
    
    
}
