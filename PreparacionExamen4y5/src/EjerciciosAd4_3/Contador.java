/*Crea una clase llamada Contador que contenga un único atributo entero
llamado cont.*/
package EjerciciosAd4_3;

public class Contador {
    
    private int cont;

    public Contador() {
    }

    /*Constructor con parámetros para inicializar el contador con un valor no negativo.
    Si el valor inicial que se recibe es negativo el contador tomará el valor cero como
    valor inicial. */    
    public Contador(int cont) {
        if (cont<0) {
            this.cont=0;
        } else{
        this.cont = cont;
        }
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    //Metodos
    //incrementar: incrementa el contador en una unidad.
    
    public void incrementa(){
        cont++;
    }
    
    /*decrementar: decrementa el contador en una unidad. El contador nunca
    podrá tener un valor negativo. Si al decrementar se alcanza un valor
    negativo el contador toma el valor cero*/

    public void decrementa (){
        cont --;
        if (cont <0) {
            cont =0;
        }
        
    }

}

