/*
Implementa la clase Concesionario, cuyos atributos serán la marca, modelo, precio y kilómetros del coche.
Incluye un constructor con parámetros, los métodos set y get y un método que muestre por pantalla el valor de los atributos.
 */

/**
 *
 * @author Daniel Espinosa Garcia
 */
public class Concesionario {
    
    String marca;
    String modelo;
    int precio;
    int kilometros;

    public Concesionario(String marca, String modelo, int precio, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return("Marca: " + marca + ", Modelo: " + modelo + ", Precio: " + precio + " €, Kilometros: " + kilometros);
    }
    
    
    
    
}
