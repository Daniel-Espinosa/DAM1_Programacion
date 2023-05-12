
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerConBufferedReader {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bufferedTeclado = new BufferedReader(isr);
            System.out.println("introduce un entero");
            String cadena = bufferedTeclado.readLine();
            Integer.parseInt(cadena);
            System.out.println("gracias por introducir: " + cadena);
        } catch (IOException e) {
            System.err.println("bla");
        } catch (NumberFormatException e){
            System.err.println("bla2");
        }
        
        
        
    }
    
}
