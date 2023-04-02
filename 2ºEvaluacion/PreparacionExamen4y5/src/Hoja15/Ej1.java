/*1. Elige 10 series de televisión que hayan comenzado a emitirse en años diferentes. Crea
una HashMap donde almacenes el título de cada serie (su clave será el año de emisión).
Recorre el HashMap usando un iterador y un bucle for-each e imprime por pantalla el
título y el año de emisión de cada serie en ambos casos*/
package Hoja15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Ej1 {

    public static void main(String[] args) {
        
        HashMap <Integer,String> series = new HashMap<>();
        
        int cont =1990;
        
        for (int i = 0; i < 10; i++) {
            series.put((cont + i), ("Serie " + (i+1)));
        }
        
        //bucle for-each
        for (Map.Entry<Integer, String> i : series.entrySet()) {
            System.out.println("Titulo: " + i.getValue()+ " anno: " + i.getKey()); 
        }
        
        // bucle iterator
        Iterator <Map.Entry<Integer,String>> it = series.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<Integer, String> next = it.next();
            System.out.println("Titulo: " + next.getValue() +  " anno: " + next.getKey()); 
        }
                
        
        
        
    }
    
}
