
import java.io.*;

/*6.- Realizar un programa que pide por teclado el nombre de un fichero de texto y nos
muestre por pantalla su contenido, pero cada palabra en una línea. Al lado de cada
línea escribirá cuantos caracteres tiene. Al final visualizará la longitud total del fichero
y la ruta absoluta.*/

public class Ej6 {

    public static void main(String[] args) {
        // variable para el archivo archivo
        File archivo = null;
        // lector de fichero
        FileReader fr = null;
        BufferedReader brfile =null;
        // String para guardar las lineas
        String cadena = null;
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" introduce el nombre del fichero, no es necesario introducir la extencion");
            archivo = new File(br.readLine()+".txt");
            fr = new FileReader(archivo);
            brfile = new BufferedReader(fr);
            
            while ((cadena = brfile.readLine()) != null) {                
                String array [] = cadena.split(" ");
                for (String i : array) {
                    System.out.println("la palabra: " + i + "\ttiene " + i.length() + " caracteres" );
                }
            }
            
            /*Al final visualizará la longitud total del fichero y la ruta absoluta.*/
            System.out.println("El tamaño del fichero es");
            System.out.println(archivo.length());
            System.out.println("la ruta absoluta es");
            System.out.println(archivo.getAbsoluteFile());

        } catch (FileNotFoundException e) {
            System.err.println("el archivo no existe, pa fuera!");
        } catch (IOException e) {
        } finally{
            try {
                if (brfile != null) {
                    fr.close();
                    brfile.close();
                }
            } catch (IOException e) {
            }
        }
        
    }
    
}
