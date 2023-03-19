
package ejmplomapas;




import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String pais;
        boolean encontrado=false;
        
        HashMap<String, String> h = new HashMap<>();
        h.put("Espana", "Madrid");
        h.put("Francia", "Paris");
        h.put("Grecia", "Atenas");
        h.put("Portugal", "Lisboa");
        h.put("Italia", "Roma");
        
        System.out.println("Escriba el pais del que quiere saber la capital");
        pais = teclado.nextLine();
//        for (String p : h.keySet()) { //recorrido del conjunto de llaves
//            
//            if (pais.equalsIgnoreCase(p)) {
//                System.out.println(h.get(p));
//                encontrado=true;
//            }
//        }
//        if (encontrado==false) {
//            System.out.println("No se encontro el pais");
//        }
        
        if(h.containsKey(pais)){
            System.out.println(h.get(pais));
        }else{
            System.out.println("No se encontró el país.");
        }
    }
}
    

