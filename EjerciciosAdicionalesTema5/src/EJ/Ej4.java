/*
4.- Crear un array con 10 elementos e invertirlo en otro array. Muestra el array invertido.
*/
package EJ;

public class Ej4 {

    public static void main(String[] args) {
        
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int array2[] = new int[10];
        int cont = array2.length-1;
        
        for (int i : array) {
            array2[cont]=i;
            cont--;
        }
        
        
        for (int i : array2) {
            System.out.println(i);
        }
    }
    
}
