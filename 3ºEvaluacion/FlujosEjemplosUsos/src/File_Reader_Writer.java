
import java.io.*;

public class File_Reader_Writer {

    public static void main(String[] args) {
        
        //utilizaremos File para comprobar la existencia del archivo
        //si el archivo esta en la misma carpeta del proyecto
        File archivo = new File("F_W_R_ejemplo.txt");
        //si el archivo esta en otra ruta podemos llegar con la absoluta
        File fichero = new File("C:\\carpeta\\carpeta\\ejemplo.txt");
        /* los metodos para comprobar que existen y estan
        fichero.exists();
        fichero.isDirectory()
        */
        
        //con estos File podemos dar ruta a los readers y los writers
        //estos tenemos que cerrar los flujos.
        
        //file Writer
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(archivo);
            fw.write("se le pasa una cadena como entrada");
            fw.write("\nsi se quiere ir añadiendo mas de una linea toca poner un salto de linea\n");
            fw.write("otra linea");
        } catch (IOException e) {
            System.err.println("IOException");
        } finally {
            try {
                if (fw!=null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.err.println("IOException cierre flujo");
            }
        }
        
        //file reader
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(archivo);
            
//bucle para leer la informacion caracter a caracter
//se necesita almacenar esta informacion en un int
            int caracter;
            String cadena = "";
            while ((caracter = fr.read())>0) {                
                //recasteo el valor a un char para imprimirlo lo almaceno en un String
                cadena += (char)caracter;
            }
            System.out.println(cadena);
            
            String cadena2;
//bucle para leer linea a linea se necesita introducir un BufferReader se le pasa como parametro el FileReader
            br = new BufferedReader(new FileReader(archivo));
            while ((cadena2 = br.readLine()) != null) {                
                System.out.println(cadena2);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("el archivo no existe");
        } catch (IOException e) {
            System.err.println("IOException");
        } finally {
            try {
                if (fr !=null) {
                    fr.close();
                }
                if (br !=null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("IOException cierre flujo");
            }
        }
        


    }
    
}
