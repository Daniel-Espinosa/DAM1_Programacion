/*
Implementa la clase Producto, cuyos atributos serán el nombre, categoría, precio y stock del producto.
Incluye un constructor con parámetros, los métodos set y get, y un método que muestre por pantalla el valor de los atributos.
*/

/**
 *
 * @author Daniel Espinosa Garcia
 */
public class Producto {
    
    private String nombre;
    private String categoria;
    private int precio;
    private int stock;

    public Producto(String nombre, String categoria, int precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Categoria: " + categoria + ", Precio: " + precio + " €, Stock: " + stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    
}
