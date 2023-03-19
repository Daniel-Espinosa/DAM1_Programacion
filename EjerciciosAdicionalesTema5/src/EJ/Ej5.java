/*5.- Crear un array con 10 números e invertirlo en el mismo array. Muestra el array
obtenido*/
package EJ;


public class Ej5 {


    public static void main(String[] args) {
        
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        int cont = array.length-1;
        int posA;
        
        for (int i = 0; i < ((int)array.length/2); i++) {
            posA =array[i];
            array[i]=array[cont];
            array[cont]=posA;
            cont--;
        }
        
        
        for (int i : array) {
            System.out.println(i);
        }
    
    
    }
    
}
