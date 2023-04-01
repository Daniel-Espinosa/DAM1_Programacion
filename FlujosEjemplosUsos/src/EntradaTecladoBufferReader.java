
import java.io.*;

public class EntradaTecladoBufferReader {

    public static void main(String[] args) {

        //si es por entrada de teclado no es necesario cerrar el flujo
        //se puede declarar todo en una sola linea
        
        //paratexto
        //almaceno en una variable tipo String
        String cadena = null;
        // si quiero comprobar que el texto tiene lo que se pide lo meto dentro de un do while con una condicion
        do {
            try {
                System.out.println("ponga su mensaje aqui para introducir TEXTO");
                BufferedReader brTexto = new BufferedReader(new InputStreamReader(System.in));
                cadena = brTexto.readLine();
                // mensaje opcional para avisar que lo haces mal
                if (cadena.equalsIgnoreCase("") || cadena==null) {
                    System.out.println("la cadena no puede estar vacia");
                }
            } catch (IOException e) {
                System.err.println("IOException lectura texto");
            }
            //si cadena es vacio o nulo lo vuelve a pedir
        } while (cadena.equalsIgnoreCase("") || cadena==null);

        //para numeros
        //almaceno la variable en un INT
        int numero = -1;
        do {
            try {
                System.out.println("ponga su mensaje aqui para introducir NUMERO");
                BufferedReader brNum = new BufferedReader(new InputStreamReader(System.in));
                // toca hacer un parse para recastear el numero
                numero = Integer.parseInt(brNum.readLine());
                // mensaje opcional para avisar que lo haces mal
                if (numero <0 || numero >10) {
                    System.out.println("el valor tiene que estar entre 0 y 10");
                }
            } catch (NumberFormatException e) {
                System.err.println("Introdusca un numero correcto");
            } catch (IOException e) {
                System.err.println("IOException lectura numero");
            }
            //si el numero no esta dentro de los rangos requeridos
        } while (numero <0 || numero >10);
        
        
    }

}
