/*5. Almacenamiento de objetos en ficheros. Serialización.
Crea una clase Alumno que construya alumnos con sus respectivos nombre y calificación.
Implementa en esta clase un método que permita imprimir los datos de estos alumnos. Los
objetos que se construyan con esta clase podrán ser grabados en archivo.
Crea una clase PrincipalAlumnos, que grabe cinco alumnos creados a partir de un listado de
nombres y otro de notas en un archivo de datos “calificaciones.dat”. cambiado a EJ5.dat*/

package hoja17;

import java.io.Serializable;

public class EJ5Alumno implements Serializable{
    private String nombre;
    private int calificacion;

    public EJ5Alumno(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    public String imprimirInfo () {
        return "Nombre: " + nombre + ", Calificacion: " +calificacion;
    }    
    
}
