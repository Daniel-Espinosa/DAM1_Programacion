
package ejmplomapas;


import java.util.*;


public class Ejer2 {

    public static void main(String[] args) {
        /*Realizar un programa  que nos proporcione un diccionario ESPAÑOL/INGLES e 
        INGLES/ESPAÑOL, utilizando mapas. Haz que se visualice el diccionario.*/
        
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("Coche", "Car");
       

        diccionario.put("Vaca", "Cow");
     

        diccionario.put("Perro", "Dog");
      
        
        diccionario.put("Gato", "Cat");
    

        System.out.println("Diccionario  Español/Inglés ");
          for (Map.Entry<String, String> e : diccionario.entrySet()) {
            System.out.println("[" +e.getKey() + "   -->   " + e.getValue()  + "]");
        } System.out.println("Diccionario  Inglés/Español");
            for (Map.Entry<String, String> e : diccionario.entrySet()) {
            System.out.println("[" + e.getValue() + "   -->   " + e.getKey() + "]");
        }
        
        System.out.println("Introduce una palabra");
        String palabra = teclado.nextLine();

        if (diccionario.containsKey(palabra)) {
            System.out.println(diccionario.get(palabra));
            
        } else
        if (diccionario.containsValue(palabra)){
        for (Map.Entry<String, String> e : diccionario.entrySet()) {
            if (e.getValue().equalsIgnoreCase(palabra))
                  System.out.println(  e.getKey() );
        }
        }
        else {
            System.out.println("No se encontro esa palabra en el diccionario");
            
        }
    }
}