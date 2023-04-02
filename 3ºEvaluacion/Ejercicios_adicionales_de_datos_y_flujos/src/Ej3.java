
import java.io.*;

/*
 3.- Escribir en un fichero. Recoger del buffer del teclado hasta que introduzca un $ para
finalizar la lectura.
 */
public class Ej3 {

    public static void main(String[] args) {
        // TODO code application logic here
        // para escribir el txt.
        FileWriter fw = null;
        // leer consola
        InputStreamReader isr = null;
        BufferedReader br = null;
        String cadena = null;

        try {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            fw = new FileWriter("EJ3.txt");

            do {
                cadena = br.readLine();
                if (!"$".equalsIgnoreCase(cadena)) {
                    fw.write(cadena + "\n");
                }
            } while (!"$".equalsIgnoreCase(cadena));

        } catch (IOException ex) {
            System.err.println("IOException1");
        } finally {
            try {
                if (br != null) {
                    br.close();
                    fw.close();
                    isr.close();
                }
            } catch (IOException e) {
                System.err.println("IOEX2");
            }
        }

    }

}
