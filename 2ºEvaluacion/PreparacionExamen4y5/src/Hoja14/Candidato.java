
package Hoja14;

public class Candidato {

private String nombre;
private int numero;

    public Candidato() {
    }

    public Candidato(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + numero;  
    }

    
    
}
