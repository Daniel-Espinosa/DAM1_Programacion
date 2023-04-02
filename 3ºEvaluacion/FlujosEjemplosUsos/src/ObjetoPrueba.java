
import java.io.Serializable;

public class ObjetoPrueba implements Serializable{
    
    private String nombre;
    private int numero;

    public ObjetoPrueba(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Numero: " + numero;
    }
    
}
