
import java.io.*;


//elementos de la tabla coche

public class coche implements Serializable{
      
    //no añado la PK idCoche ya que es autoincremental
    private String matricula;
    private String modelo;
    private String marca;
    private String color;

    public coche() {
    matricula = null;
    modelo = null;
    marca = null;
    color = null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "coche{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + '}';
    }
    
    
    
    
}
