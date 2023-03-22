
package ej7;


public class Amigo { // falta serialise
   
    private String nombre;
    private int telefono;

    public Amigo(String nombre, int telefono) {
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
