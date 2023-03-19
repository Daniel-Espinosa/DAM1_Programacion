
package ejmplomapas;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio2 {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("burro", "donkey");
        diccionario.put("mono", "monkey");

        Iterator<Map.Entry<String,String>> it = diccionario.entrySet().iterator();
        System.out.println("Diccionario español-ingles");
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("[" + e.getKey() + "   -->   " + e.getValue() + "]");
        }

        System.out.println("Diccionario ingles-español");

        for (Map.Entry<String, String> e : diccionario.entrySet()) {
            System.out.println("[" + e.getValue() + "   -->   " + e.getKey() + "]");
        }

    }

//        for (String p : diccionario.()) {
//
//            System.out.println("[" + diccionario.get(p));
//
//        }
}

    

