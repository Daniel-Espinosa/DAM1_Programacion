/*
Clase Taller:
Atributo privado:
HashMap que permita almacenar dinámicamente parejas formadas por una
matrícula junto a un objeto de tipo Coche.
Métodos:
anadeElemento: Incluye la petición de datos (color, marca y matrícula), la creación
del objeto de tipo Coche, valida la matrícula, comprueba que no hay ningún
contacto ya en la colección con la misma matrícula y añade la pareja matriculaCoche al mapa.
eliminaElemento: pide matrícula del coche a borrar y lo elimina, informando de la
no existencia del mismo dado el caso.
visualizaMatriculas: Recorre el mapa mostrando el conjunto de matrículas
almacenadas.(Basado en keySet())
visualizaCoches: Recorre el mapa mostrando color, marca de cada coche
almacenado. (Basado en values())
visualizaTaller: Recorre el mapa mostrando color, marca y matricula de cada coche
almacenado. (Basado en entrySet().toString)
En esta clase se podrán incluir aquellos métodos que se consideren oportunos y
estén relacionados con la gestión de elementos del mapa y del mapa en sí.
*/

package hoja15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Taller {
    
    /* Atributo privado:
HashMap que permita almacenar dinámicamente parejas formadas por una
matrícula junto a un objeto de tipo Coche. */
    
    private HashMap <String,Coche> listado = new HashMap<>() ;
    
    //metodos
    /*anadeElemento: Incluye la petición de datos (color, marca y matrícula), la creación
del objeto de tipo Coche, valida la matrícula, comprueba que no hay ningún
contacto ya en la colección con la misma matrícula y añade la pareja matriculaCoche al mapa.*/

    public void anadeElemento(){
        String color,marca,matricula;        
        Scanner sc = new Scanner (System.in);
        System.out.println("Dame un numero de matricula para añadir");
        matricula = sc.next();

        // comprobar que existe, si es asi se sale
        if (listado.containsKey(matricula)) {
            System.out.println("El coche ya existe no se hace nada");
        } else {
            // si no esta en la lista continuar añadiendo coche
            System.out.println("Dame el color del coche");
            color = sc.next();
            System.out.println("Dame la marca del coche");
            marca = sc.next();
            // Creo el objeto coche 
            Coche c = new Coche(color,marca);
            // añado el coche con la matricula
            listado.put(matricula, c);
            System.out.println("coche añadido");
        }
        
    }
    
    /* eliminaElemento: pide matrícula del coche a borrar y lo elimina, informando de la
no existencia del mismo dado el caso.*/
    
    public void eliminaElemento(){
        
        String matricula;        
        Scanner sc = new Scanner (System.in);
        System.out.println("Dame un numero de matricula eliminar");
        matricula = sc.next(); 
        
        if (listado.containsKey(matricula)) {
            System.out.println("coche eliminado");
            listado.remove(matricula);
        } else {
            System.out.println("El coche que desea borra no existe");
        }
        
    }
    
    
    /*visualizaMatriculas: Recorre el mapa mostrando el conjunto de matrículas
almacenadas.(Basado en keySet())*/
    
    public void visualizaMatriculas (){
        System.out.println("matriculas");
        for (String matricula : listado.keySet()) {
            System.out.println(matricula);
        }
    }
    
    /*visualizaCoches: Recorre el mapa mostrando color, marca de cada coche
almacenado. (Basado en values())*/
    public void visualizaCoches (){
        System.out.println("coches");
        for (Coche coche : listado.values()) {
            System.out.println("Color " + coche.getColor() + " Marca " + coche.getMarca());
        }
    }
    
    
    /*visualizaTaller: Recorre el mapa mostrando color, marca y matricula de cada coche
almacenado. (Basado en entrySet().toString)*/
    
    public void visualizaTaller (){
        System.out.println("taller");
        for (Map.Entry <String, Coche> lista : listado.entrySet()) {
            System.out.println("Matricula " + lista.getKey() + " " + lista.getValue().toString());
        }
    }
    
    
    
    
}
