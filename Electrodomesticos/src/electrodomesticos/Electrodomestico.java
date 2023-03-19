
package electrodomesticos;


public class Electrodomestico {
  
    //Atributos
    private String numSerie, marca;
    private double precio;
    
    //Constructores
        //Constructor por defecto
    public Electrodomestico(){
        numSerie = "pendiente de asignar";
        marca="LG";
        precio=120.99;
        
    }
        //Constructor con argumentos de la clase
    public Electrodomestico(String numSerie, String marca, double precio){
        this.numSerie=numSerie;
        this.marca=marca;
        this.precio=precio;
        
    }
    
    //Metodos:

        //Metodos Set
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
        //Metodos get

    public String getNumSerie() {
        return numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
    
        //Metodo para aplicar el incremento del IVA 21%
    public void aplicarIva(){
        precio = (precio * 0.21)+precio;
    } 
        //metodo para aplicar una rebaja
    public void rebajarPrecio(double rebaja){
        if (precio <= 10) {
            precio = 10; 
        } else {
            if (precio-(precio*(rebaja/100))<=10) {
                precio = 10;
            }   else {
                precio = precio-(precio*(rebaja/100));
            }
            
        }
                
    }
    
    
    
}
