
import java.io.BufferedReader;
import java.io.FileReader;

/*9.- Programa que lee un archivo de texto llamado cancion.txt y nos diga cuántas líneas
tiene la canción y cuantas palabras hay en cada línea del archivo.*/

public class Ej9 {

    public static void main(String[] args) {

        BufferedReader br = null;
        String cadena = null;
        int contLineas = 0;
        
        
        try {
            
            br = new BufferedReader(new FileReader("cancion.txt"));
            
            while ((cadena = br.readLine()) != null) {
                contLineas++;
                String [] arrayPalabras = cadena.split(" ");
                System.out.println("La " + contLineas + "º linea tiene " + (arrayPalabras.length) + " palabras");
                System.out.println(cadena);
            }
            
        } catch (Exception e) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
            }
        }

    }
    
}
