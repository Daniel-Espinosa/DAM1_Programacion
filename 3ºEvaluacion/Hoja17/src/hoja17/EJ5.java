/*5. Almacenamiento de objetos en ficheros. Serialización.
Crea una clase Alumno que construya alumnos con sus respectivos nombre y calificación.
Implementa en esta clase un método que permita imprimir los datos de estos alumnos. Los
objetos que se construyan con esta clase podrán ser grabados en archivo.
Crea una clase PrincipalAlumnos, que grabe cinco alumnos creados a partir de un listado de
nombres y otro de notas en un archivo de datos “calificaciones.dat”. cambiado a EJ5.dat*/
package hoja17;

import java.io.*;

public class EJ5 {

    public static void main(String[] args) {
        
        String[] nombres = new String[5];
        int[] calificaciones = new int[5];
        
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = (i+1);
            nombres[i] = "Alumno " + (i+1);
            System.out.println(nombres[i]+" "+calificaciones[i]);
        }
        
        //Escribir archivos
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream("EJ5.dat");
            oos = new ObjectOutputStream(fos);
            //creo un objeto de la clase EJ5Alumno a nulo para almacenar en el bucle la info
                       
            for (int i = 0; i < calificaciones.length; i++) {
                EJ5Alumno alumno = new EJ5Alumno(nombres[i],calificaciones[i]);
                // utilizamos WriteObject Para almacenar la informacion
                oos.writeObject(alumno);
            }
            
        } catch (IOException e) {
            System.err.println("IOEX");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    fos.close();
                }
            } catch (IOException e) {
            }
        }
        
    }
    
}
