
package ej7;

import java.io.Serializable;


public class Amigo2 implements  Serializable{ // falta serialise
   
    private String nombre;
    private int telefono;

    public Amigo2(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return nombre+" "+telefono;
    }
    
}
