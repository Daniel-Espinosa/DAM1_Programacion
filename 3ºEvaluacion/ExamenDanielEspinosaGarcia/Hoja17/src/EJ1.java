
import java.io.*;

/*1. Utilizando las clases de flujo para la lectura de teclado
Crea un programa que pida por teclado nombre, edad y altura en metros de un niño menor de
10 años, y devuelva los datos de la persona dentro de 10 años, suponiendo que ha crecido 70
centímetros.*/

public class EJ1 {

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

            System.out.println("nombre: " + nombre);   
            System.out.println("edad: " + (edad + 10));
            System.out.println("altura: " + (altura + 0.70));

        
    }
    
}
