
import java.util.LinkedList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
        LinkedList <String> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean control = true;
        
        do {
            System.out.println("Introduce una palabra para almacenar");
            String palabra = sc.next();
            if (palabra.equalsIgnoreCase("END")) {
                control =false;
            } else {
                lista.add(palabra);
                
            }
            
            System.out.println("imprimiendo toda la lista");
            for (String i : lista) {
                System.out.println(i);
            }
            
            
        } while (control);


    }
    
}
