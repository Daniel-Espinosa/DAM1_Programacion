import java.io.*;

public class File_Output_Stream {

    public static void main(String[] args) {

        // se utiliza para crear ficheros .dat y almacenar objetos.
        // se necesita el FileOutputStream y el ObjectOutputStream.
        // podemos utilizar como en File_Reader_Writer la clase File para los ficheros.
        
        //IMPORTANTE LA CLASE DONDE SE CREAN LOS OBJETOS TIENE QUE TENER IMPLEMENTS SERIALIZABLE
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            //se le pasa la ruta del archivo
            fos = new FileOutputStream("fosEjemploDAT.dat");
            //se le pasa el fos como parametro
            oos = new ObjectOutputStream(fos);
            
            //creo 2 objetos de prueba para poder almacenarlos
            ObjetoPrueba objeto1 = new ObjetoPrueba("Caracola", 5);
            ObjetoPrueba objeto2 = new ObjetoPrueba("Perros", 3);
            
            //utilizamos el metodo oos.writeObject para pasarle el objeto
            //podemos utilizar este metodo tantos objetos tengamos
            oos.writeObject(objeto1);
            oos.writeObject(objeto2);
            
            //si es el mismo Objeto como el array de alumnos de la tarea lo sobre escribe
            
            
        } catch (IOException e) {
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    fos.close();
                }
            } catch (IOException e) {
            }
            
        }
        
        
        // para escribir un TXT se puede hacer pero es mejor usar el FileWriter.
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;
        
        try {
            // le pasamos la ruta del archivo
            fos2 = new FileOutputStream("fosEjemploTXT.txt");
            
            //le podemos pasar una cadena de texto y caracter por caracter la guardara.
            String cadena = "Probando Texto Suelto a lo loco \n otra linea";
            
            //el bucle recorre la cadena y le pasa 1 a 1 el caracter
            for (int i = 0; i < cadena.length(); i++) {
                fos2.write(cadena.charAt(i));
            }
            
        } catch (IOException e) {
        } finally {
            try {
                if (oos2 != null) {
                    oos2.close();
                    fos2.close();
                }
            } catch (IOException e) {
            }
        }


    }
    
}
