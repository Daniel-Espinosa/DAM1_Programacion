
import java.io.*;
import java.sql.*;
import java.util.*;


public class metodosCoche {
    
    public static void añadirCocheBBDD(){
        
        Connection conexion = ConnectionBBDD.getInstance().getConnection();
        try {
            //creo coche metodo rudimentario
            coche c1 = new coche();
            c1.setMatricula("ABC123");
            c1.setMarca("Seat");
            c1.setModelo("Ibiza");
            c1.setColor("Rojo");
            
            String insertarCoche = "insert into coche values(?,?,?,?,?)";
            
            PreparedStatement ps = conexion.prepareStatement(insertarCoche);
            
            ps.setString(1, "DEFAULT" ); // primary Key auto incremental no se la quiero pasar.. eso o modifico el insert values y le digo que campos...
            ps.setString(2, c1.getMatricula());
            ps.setString(3, c1.getModelo());
            ps.setString(4, c1.getMarca());
            ps.setString(5, c1.getColor());
            
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        
    }
    
}
