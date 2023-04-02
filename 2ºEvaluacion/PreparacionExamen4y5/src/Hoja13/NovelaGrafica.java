/*Creamos una clase NovelaGrafica, que hereda de la clase Comic, pero tiene
además un dato entero numPag. */
package Hoja13;

public class NovelaGrafica extends Comic{
    
    int numPag;

    public NovelaGrafica(int numPag, String titulo, String guionista, String dibujante, int numero) {
        super(titulo, guionista, dibujante, numero);
        this.numPag = numPag;
    }

    @Override
    public void mostrar_informacion() {
        System.out.println("Titulo: " + titulo + " Guionista: " + guionista 
        + " Dibujante: " + dibujante + " Numero: " + numero + " Numero Paginas: " + numPag);
        
    }
    
    

}
