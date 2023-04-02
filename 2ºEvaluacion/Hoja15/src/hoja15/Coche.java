/*Clase Coche:
Atributos: color y marca
Métodos:
Se espera encontrar en la clase los métodos Constructores necesarios, los métodos
set y get, y aquellos que se consideren oportunos para el trabajo con objetos de tipo
Coche. No hace falta validar los atributos.
Se sugiere sobreescibir el método toString, para que muestre los atributos del
objeto.*/
package hoja15;

public class Coche {
    
    //Atributos: color y marca
    private String color,marca;
    
    //constructores
    public Coche(){
                
    }
    
    public Coche(String color,String marca){
        this.color=color;
        this.marca=marca;
    }
    
    //metodos set

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //metodos get
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    
    //metodo override de toString
    @Override
    public String toString(){
        return "Color " + color + " Marca " + marca;
    }
    
    
    
    
    
    
    
    
    
}
