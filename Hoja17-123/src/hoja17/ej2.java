
package hoja17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej2 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        FileOutputStream fos = null;
        
        try {
            System.out.printf("Nombre: ");
            String nombre = bufferTeclado.readLine();
            System.out.printf("Edad: ");
            int edad = Integer.parseInt(bufferTeclado.readLine());
            System.out.printf("Altura: ");
            double altura = Double.parseDouble(bufferTeclado.readLine());
            String texto = "\nNombre: " + nombre + ", Edad: " + edad + ", Altura: " + altura;
            
            fos = new FileOutputStream("datos personales.txt");
            for (int i = 0; i < texto.length(); i++) {
                fos.write(texto.charAt(i));
            }
            System.out.println("Texto escrito correctamente");
        } catch (FileNotFoundException f) {
            System.out.println("Ruta no válida");
        } catch (IOException e) {
            System.out.println("Ha ocurrido una IOException");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Ha ocurrido una IOException");
            }
        }
        
    }
    
}