
import java.io.*;
import java.sql.*;
import java.util.*;

public class MetodosBBDD {

    public static void crearTablas() {
        Connection conexion = ConnectionBBDD.getInstance().getConnection();
        //sentencia de SQL
        final String createTable = "create table if not exists coche ("
                + "idCoche int (10) auto_increment,"
                + "matricula varchar (6) not null,"
                + "modelo varchar (20),"
                + "marca varchar (20),"
                + "color varchar (15),"
                + "primary key (idCoche)"
                + ");";
        try {
            
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(createTable);
            System.out.println("Tabla creada");
            
        } catch (SQLException e) {
            System.err.println("ERROR AL CREAR LA TABLA");
            System.err.println(e.getMessage());
        }
                        
    }

}
