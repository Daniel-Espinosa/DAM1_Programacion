
import java.sql.*;

public class NewMain {

    public static void main(String[] args) {
        
        // realizamos la coneccion y probamos que funciona.
        // jose realizaba esto de otra manera ya que creaba la coneccion y la pasaba como atributo a los metodos.
        //Connection conexion = ConnectionBBDD.getInstance().getConnection();
        
        //lanzamos el metodo para crear la tabla
        MetodosBBDD.crearTablas();
        
        //añado un coche
        metodosCoche.añadirCocheBBDD();
        
        //leer BBDD e imprimir tuplas.
        metodosCoche.leerCoches();
        
    }
    
}
