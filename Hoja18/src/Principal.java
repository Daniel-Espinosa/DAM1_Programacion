
import java.io.*;
import java.util.*;

public class Principal implements Serializable {

    public static void main(String[] args) {
        
        //LECTURA
        //Para leer un fichero FileInputStream;
        //Para leer de un fichero los Objetos ObjectInputStream;
        
        //ESCRITURA
        //Para escribir un fichero FileOutputStream
        //Para escribir objetos en un fichero ObjectOutputStream
        
        
        // Cargando en el arrayList el archivo.dat con la info anterior
        ArrayList <Articulo> listaArticulos = new ArrayList<>();    
        // no se si valdra esta o la siguiente
        //listaArticulos = leer_fichero();
        //listaArticulos.addAll(leer_fichero());
        leer_fichero();
        
        //Pruebas Crear objetos a mano y añadirlos a la linkedList
        // comento despues de guardar el fichero para probar la lectura
        /*
        Articulo a = new Articulo("asd", "a", 10);
        Articulo b = new Articulo("sdf", "b", 11);
        listaArticulos.add(a);
        listaArticulos.add(b);
        */
        
        //Prueba de guardar Fichero Parece que guardo ;)
        //guardar_fichero(listaArticulos);
        
        // comprobando que el linkedList tiene info
        for (Articulo i : listaArticulos) {
            System.out.println(i.toString());
        }
  
    }
    
    public static ArrayList leer_fichero(){
        //ArrayList <Articulo> lectura = new ArrayList<>();
        ArrayList <Articulo> lectura = null;
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("almacen.dat");
            ois = new ObjectInputStream (fis);
            
            // METODO FACIL
            // ArrayList people2 = (ArrayList<Person>) readStream.readObject();
            System.out.println("llego aqui?");
            lectura = (ArrayList<Articulo>) ois.readObject();
            //no llega
            System.out.println("llego aqui2?");
            
            /*
            while (fis.available()>0) {
                System.out.println("lectura Objetos");
                Articulo a = (Articulo)ois.readObject();
                System.out.println(a.toString());
                //lectura.add(a);
                //lectura.add((Articulo)ois.readObject());
            }
            */
            
        } catch (FileNotFoundException e){
            System.err.println("No se puede cargar el archivo ya que no existe");
        } catch (IOException e) {
            System.err.println("IOException ");
        } catch (Exception e){
            System.err.println("Exeption");
        } finally {
            try {
                if (ois != null) {
                ois.close();
                fis.close();
                }
            } catch (IOException e) {
                System.err.println("Finally IOException");
            }
        }
        
        return lectura;
    }
    
    public static void guardar_fichero(ArrayList<Articulo> lista){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream (new FileOutputStream("almacen.dat"));
            oos.writeObject(lista);
            
            /*
            for (int i = 0; i < lista.size(); i++) {
                oos.writeObject(lista.get(i));
            }*/
        } catch (IOException e) {
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.err.println("Finally IOException");
            }
        }
        
        
    }
    
}
