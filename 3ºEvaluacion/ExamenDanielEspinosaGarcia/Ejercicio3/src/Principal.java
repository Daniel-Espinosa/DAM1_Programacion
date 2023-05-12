
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


public class Principal {


    public static void main(String[] args) {

        int array[] = new int [30];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        
        System.out.println("impresion del ARRAY");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("imprimiendo array sin for each");
        System.out.println(Arrays.toString(array));
        
        HashMap <Integer,Integer> lista= new HashMap<>();
        
        int contador = 0;
        
        do {
            int cuenta = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i]==contador) {
                        cuenta++;
                    }
                }
            if (cuenta >= 1) {
                lista.put(contador, cuenta);
            }
                        
            contador++;
        } while (contador < 10);
        
        System.out.println("impriendo Hasmap sin for each");
        System.out.println(lista);
        
        System.out.println("impresion del HASHMAP con for each");
        for (Map.Entry<Integer, Integer> entry : lista.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " +value);
        }
        
    }
    
}
