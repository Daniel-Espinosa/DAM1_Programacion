/*
Clase Estudiante:
- Atributos (privados):
o Nombre (String).
o DNI (String).
o Nota (int).
*/
package Practica;

public class Estu {
    
    private String nombre;
    private String dni;
    private int nota;

    public Estu(String nombre, String dni, int nota) {
        this.nombre = nombre;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Nota: " + nota;
    }

    
    
    
}
