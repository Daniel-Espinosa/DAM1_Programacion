/*Ejercicio 3: Vamos a guardar cadenas en una colección con el fin de borrar
posteriormente la que empiecen por b
“hola”
“buenos días”
“buenas tardes”
“hasta luego”*/
package Hoja14;

import java.util.Iterator;
import java.util.LinkedList;

public class Ejercico3 {

    public static void main(String[] args) {

        LinkedList <String> lista = new LinkedList<>();
        
        
        lista.add("hola");
        lista.add("buenos dias");
        lista.add("buenas tardes");
        lista.add("hasta luego");
        
        Iterator <String> it = lista.iterator();
        
        while (it.hasNext()) {
            if (it.next().startsWith("b")) {
                it.remove();
            }
        }
        
        for (String i : lista) {
            System.out.println(i);
        }

    }
    
}
