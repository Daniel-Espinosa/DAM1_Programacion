package example;

/**
* @see https://www.jc-mouse.net/
* @author mouse
*/

public class MiClase {
    
    public int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
        return a;
        } else if (c > b) {
        return c;
        } else {
        return b;
        }

    }
    
}
