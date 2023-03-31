
import java.io.*;

/*4.- Copiar un fichero en otro (byte a byte). Utilizando el fichero generado en el punto
anterior crea otro que sea copia leyendo byte a byte.*/

public class EJ4 {

    public static void main(String[] args) {
        
        // declaro el lectore de ficheros
        FileInputStream fis = null;
        //declaro el escritor de ficheros
        FileOutputStream fos = null;
        
        try {
            
            fis = new FileInputStream("EJ3.TXT");
            fos = new FileOutputStream("COPIA_EJ3.txt");
            
            while (fis.available()>0) {
                fos.write(fis.read()); 
            }
            
            
        } catch (IOException e) {
        } finally {
            try {
                if (fos != null) {
                fos.close();
                fis.close();
            }
                
            } catch (IOException e) {
            }

        }
        
    }
    
}
