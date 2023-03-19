
package ejmplomapas;

import java.util.HashMap;


public class EjmploMapas {

   
    public static void main(String[] args) {

        /*Declaración de un HashMap,
        hay que importar la clase*/
        HashMap<String, Integer> t = new HashMap<>();
        //Se añaden elelmentos al mapa con put (clave (o llave), valor)
        t.put("hola", 4);
        t.put("¿que tal?", 9);
        t.put("adios", 5);
        /*No almacena llaves repetidas; 
        la llave sigue siendo hola, y el valor será 6*/
        t.put("hola", 6);
        //Vemos el mapa
        System.out.println(t);
        //Obtenemos el valor asociado a una llave
        System.out.println(t.get("adios"));
        // Quitamos por llave y valor
        t.remove("hola", 6);
        //Quitamos por llave
        t.remove("hola");
        System.out.println("El mapa sin el elemnto de llave hola");
        System.out.println(t);
        System.out.println("¿El mapa contiene la llave hasta luego?");
        System.out.println(t.containsKey("hasta luego"));
        System.out.println("¿El mapa cntiene el valor 10?");
        System.out.println(t.containsValue(10));
        //Añadimos un nuevo elemento
        t.put("aloha", 5);
        System.out.println("Vemos el mapa");
        System.out.println(t);
        System.out.println("¿El mapa contiene el valor 5?");
        System.out.println(t.containsValue(5));
        System.out.println("Tamaño del mapa");
        System.out.println(t.size());
        System.out.println("¿Esta vacio?");
        System.out.println(t.isEmpty());
        //System.out.println(t.clear()); error porque clear es void
        t.clear();
        System.out.println("¿Esta vacio despues del clear?");
        System.out.println(t.isEmpty());

        t.put("hola", 4);
        t.put("¿que tal?", 9);
        t.put("adios", 5);
        t.put("aloha", 5);
        System.out.println(t.keySet());
        
    
        
        for(String s: t.keySet()){
            
            if(s.startsWith("a")){
                System.out.println(s);
            }
            
        }
        System.out.println(t.values());
        for(Integer i: t.values()){
            
            if(i>6){
                System.out.println(i);
            }
            
        }
        System.out.println(t.entrySet());
        
    }

}
