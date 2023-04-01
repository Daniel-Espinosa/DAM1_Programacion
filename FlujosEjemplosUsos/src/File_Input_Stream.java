
import java.io.*;

public class File_Input_Stream {

    public static void main(String[] args) {

        // se utiliza para leer ficheros .dat y leer objetos.
        // se necesita el FileOutputStream y el ObjectOutputStream.
        // podemos utilizar como en File_Reader_Writer la clase File para los ficheros.
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        
        
        
        
        
        // PARA TXT ES MEJOR USAR EL FILE READER
        FileInputStream fis2 = null;
        
        //declaro dos variables tipo char y String para poder almacenar los datos;
        String cadena = "";
        char caracter = 0;
        try {
            //declaramos el fis y le pasamos la ruta del archivo
            fis2 = new FileInputStream("fosEjemploTXT.txt");
            //es necesario almacenar la longitud del FIS para poder recorreclo con el bucle
            int longitud = fis2.available();
            
            //recorro el fichero con un bucle a medida que lo leo
            for (int i = 0; i < longitud; i++) {
                //lee el caracter y lo almacena en la variable caracter es necesario recastearlo.
                caracter = (char) fis2.read();
                // se almacena caracter a caracter en la CADENA
                cadena = cadena + caracter;
            }
            System.out.println(cadena);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            try {
                if (fis2 != null) {
                    fis2.close();
                }
            } catch (IOException e) {
                System.out.println("IOException en el cirre del flujo");
            }
        }

    }

}
