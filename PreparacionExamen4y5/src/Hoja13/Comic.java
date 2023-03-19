
package Hoja13;

public class Comic {
    
    //con los atributos Titulo, Guionista, Dibujante, los tres de tipo String y Numero (tipo Int)
    public String titulo,guionista,dibujante;
    public int numero;
    
    /* y los métodos –aparte del constructor-son: getTitulo,
getGuionista, getDibujante, getNumero, setTitulo, setGuionista, setDibujante,
setNumero y un método mostrarInformacion que muestre toda la información del
objeto */
    
    public Comic (String titulo, String guionista, String dibujante, int numero){
        this.titulo= titulo;
        this.guionista=guionista;
        this.dibujante=dibujante;
        this.numero=numero;     
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGuionista() {
        return guionista;
    }

    public String getDibujante() {
        return dibujante;
    }

    public int getNumero() {
        return numero;
    }
    
    //un método mostrarInformacion que muestre toda la información del objeto
    public void mostrar_informacion (){
        System.out.println("Titulo: " + titulo + " Guionista: " + guionista 
        + " Dibujante: " + dibujante + " Numero: " + numero);
    }
    
}
