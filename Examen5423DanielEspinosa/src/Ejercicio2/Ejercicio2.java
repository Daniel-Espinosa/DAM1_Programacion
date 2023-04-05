package Ejercicio2;

import java.io.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        String cadena = "";
        String aux = null;
        do {
            try {
                System.out.println("Introduce un texto para almacenar");
                BufferedReader brTexto = new BufferedReader(new InputStreamReader(System.in));
                aux = brTexto.readLine();
                // mensaje opcional para avisar que lo haces mal
                if (!aux.equalsIgnoreCase(";")) {
                    aux = aux.replaceAll("/", "\n");
                    cadena = cadena + aux;
                }
            } catch (IOException e) {
                System.err.println("IOException lectura texto");
            }
            
        } while (!aux.equalsIgnoreCase(";"));

        // si todo va bien guarda el fichero
        File archivo = new File("fichero.txt");
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(archivo);
            fw.write(cadena);
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
        
    }

}
