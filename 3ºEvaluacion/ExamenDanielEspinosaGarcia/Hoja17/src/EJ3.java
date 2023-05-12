
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*3. Lectura secuencial de un archivo con la clase FileInputStream
Lee los datos almacenados en el archivo “datos personales”.
*/

public class EJ3 {

    public static void main(String[] args) {
        
        FileInputStream fis = null;
        String textoInput = "";
        char c = 0;
        try {
            fis = new FileInputStream("datos_personales.txt");
            int longitud = fis.available();
            for (int i = 0; i < longitud; i++) {
                c=(char)fis.read();
                textoInput = textoInput + c;
            }
            System.out.println(textoInput);
        } catch (FileNotFoundException e) {
            System.err.println("");
        } catch (IOException e){
            System.err.println("");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.err.println("IOException");
            }
        }
        
    }
    
}
