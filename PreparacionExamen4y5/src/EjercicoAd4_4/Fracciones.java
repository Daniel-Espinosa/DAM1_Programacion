/*Ejercicio 4. Escribe una clase para representar fracciones. La clase tendrá dos atributos
de tipo int: num (numerador) y den (denominador). La clase debe contener los
constructores y métodos adecuados para que este método main funcione de forma
correcta.*/
package EjercicoAd4_4;


public class Fracciones {
    int num, den;

    public Fracciones() {
    }

    public Fracciones(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    
}
