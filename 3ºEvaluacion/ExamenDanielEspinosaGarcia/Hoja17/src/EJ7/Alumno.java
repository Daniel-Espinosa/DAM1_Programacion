package EJ7;

import java.io.Serializable;

public class Alumno implements Serializable{
    private String nombre;
    private double calificacion;

    public Alumno() {
    }

    public Alumno(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Calificacion: " + calificacion);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    
}
