
import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

/*2. Escritura secuencial en un archivo con la clase FileOutputStream
Crea un programa que guarde en un archivo llamado “datos personales” el nombre, la edad y
la altura que introduce un único usuario por teclado en una única cadena de caracteres.*/

public class EJ2 {

    public static void main(String[] args) {
        
        boolean control = false;
        String nombre= "";
        int edad = -1;
        double altura = -1;
        
        // nombre
            do {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader buffTeclado = new BufferedReader(isr);
                try {
                   
                    System.out.println("Introce el nombre");
                    nombre = buffTeclado.readLine();
                control = true;
                } catch (IOException e) {
                    System.err.println("IOexception");
                } catch (Exception e) {
                    System.err.println("Exception");
                }finally{
                    /*try {
                    buffTeclado.close();
                    } catch (IOException e) {
                    }*/
                }
            } while (control == false);

            control = false;
            // edad
            do {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader buffTeclado = new BufferedReader(isr);
                try {
                    System.out.println("Introce la edad");
                    String cadena = buffTeclado.readLine();
                    edad = Integer.parseInt(cadena);
                    if (edad > 10) {
                        System.out.println("la edad es mayor que 10, vuelve a intentarlo");
                    } else {
                        control = true;
                    } 
                } catch (NumberFormatException e) {
                    System.err.println("Numbre Format Exception");
                } catch (IOException e) {
                    System.err.println("IOexception");
                } catch (Exception e) {
                    System.err.println("Exception");
                } finally {
                    /*try {
                    buffTeclado.close();    
                    } catch (IOException e) {
                    }*/
                }
            } while (control == false);

            control = false;
            // altura
            do {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader buffTeclado = new BufferedReader(isr);
                try {
                    System.out.println("Introce la altura en metros");
                    String cadena = buffTeclado.readLine();
                    altura= Double.parseDouble(cadena);
                    control = true; 
                } catch (NumberFormatException e) {
                    System.err.println("Numbre Format Exception");
                } catch (IOException e) {
                    System.err.println("IOexception");
                } catch (Exception e) {
                    System.err.println("Exception");
                } finally {
                   /*try {
                    buffTeclado.close();
                    } catch (IOException e) {
                    }*/
                }
            } while (control == false);

            // Crear y Sacar el archivo.
        String textoAlmacenar = ("Nombre: " + nombre + " Edad en 10 años: " + (edad + 10) + " y altura: " + (altura + 0.70));

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("datos_personales.txt");
            for (int i = 0; i < textoAlmacenar.length(); i++) {
                fos.write(textoAlmacenar.charAt(i));
            }
            System.out.println("texto introducido correctamente");

        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
        } catch (IOException e) {
            System.err.println("IOException");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
            }
        }

        
    }
    
}
