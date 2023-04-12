
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
            
            String insertarCoche = "insert into coche(matricula,modelo,marca,color) values(?,?,?,?)";
            
            PreparedStatement ps = conexion.prepareStatement(insertarCoche);
            
            ps.setString(1, c1.getMatricula());
            ps.setString(2, c1.getModelo());
            ps.setString(3, c1.getMarca());
            ps.setString(4, c1.getColor());
            
            ps.executeUpdate();
            
            System.out.println("datos insertados ;)");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void leerCoches (){
        
        Connection conexion = ConnectionBBDD.getInstance().getConnection();
        try {
            String tablaCoches = "select * from coche";
            
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery(tablaCoches);
        
            while (rs.next()) {
                System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getString(4)+ " "+rs.getString(5));                
            }
            
            
        } catch (SQLException e) {
            System.err.println("ERROR AL LEER");
        }
        
        
        
    }
    
}
