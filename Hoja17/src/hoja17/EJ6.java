/*6. Recuperación de objetos de un fichero.
Crea una clase PrincipalAlumnos2 que recupere el contenido de los datos almacenados en
“calificaciones.dat”. lo cambio por "EJ5.dat"*/
package hoja17;

import java.io.*;

public class EJ6 {

    public static void main(String[] args) {
        //lector de ficheros
        FileInputStream fis = null;
        //lector de objetos
        ObjectInputStream ois = null;
        
        
        try {
            fis = new FileInputStream("EJ5.dat");
            ois = new ObjectInputStream(fis);
            
            
            // creo un objeto nulo de la clase Alumno, para luego escribirlo dentro del bucle.
            
            EJ5Alumno alumno = null;
            
            // el bucle hace dos cosas, escribe el alumno alamacenado del fichero al objeto alu
            while ((alumno = (EJ5Alumno) ois.readObject()) != null) {                
                System.out.println(alumno.imprimirInfo());
            }
            
        } catch (FileNotFoundException e) {
        } catch (ClassNotFoundException e) { // al leer un objeto de otra clase se tiene que capturar la excepcion por si la clase no existe ;)
        } catch (IOException e) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    fis.close();
                }
            } catch (IOException e) {
            }
        }     
           
    }
    
}
