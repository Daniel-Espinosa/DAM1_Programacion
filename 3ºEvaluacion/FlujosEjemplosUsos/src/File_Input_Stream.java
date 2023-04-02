
import java.io.*;


public class File_Input_Stream {

    public static void main(String[] args) {

        // se utiliza para leer ficheros .dat y leer objetos.
        // se necesita el FileOutputStream y el ObjectOutputStream.
        // podemos utilizar como en File_Reader_Writer la clase File para los ficheros.
        FileInputStream fis = null;
        ObjectInputStream ois = null;

           try {
               fis=new FileInputStream("fosEjemploDAT.dat");
               ois=new ObjectInputStream(fis);

               //se utiliza el available del FIS para saber el tamaño del fichero y que lo recorra.
                while (fis.available()>0) {
                    ObjetoPrueba a = (ObjetoPrueba) ois.readObject();
                    System.out.println(a.toString());
                }
                
                //OJO SOLO SE PUEDE UTILIZAR EL READ Y EL AVAILABLE UNA SOLA VES ES MEJOR USARLO COMO METODOS. ya que estos los abren y los cierran los Flujos.
                //como en la tarea 6_7 de alumnos.
                //RECUERDA QUE ES MEJOR QUE LEER OBJETOS ES ALMACENARLOS EN UN ARRAYLIST O LINKED LIST COMO EN LA TAREA 6_7
                
        } catch (FileNotFoundException fnf) {
            System.err.println("Fichero no encontrado" + fnf);
        } catch (IOException ioe) {
            System.err.println("Se ha producido una IoException" + ioe);
        } catch (ClassNotFoundException ex) {
               System.err.println("No se ha podido leer el objeto porque me falta la clase");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                    ois.close();
                }
            } catch (IOException ioe) {
                System.err.println("Ha ocurrido una IOException");
            }

        }

        
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
