
package taller;


public class Coche {
    
    //Atributos
    private String color;
    private String marca;

    //Constructor con parámetros
    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    //Set y get
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "El color del coche es " + color + " y su marca es " + marca +".";
    }
    
}
