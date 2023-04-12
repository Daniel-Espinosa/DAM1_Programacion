
import java.sql.*;

public class ConnectionBBDD {

    static Connection con;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // esto por lo que entiendo utiliza el driver que bajamos (el jar)
    static final String USER = "root"; 
    static final String PASS = "1234";
    static final String BD = "PruebaCoches"; // nombre de la base de datos
    //la direccion para conectar a la bbdd se le pasa como parametro "BD"
    static final String DB_URL = "jdbc:mysql://localhost:3306/"+BD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
    private static ConnectionBBDD INSTANCE;

    private ConnectionBBDD() {

        try {
            Class.forName(JDBC_DRIVER).newInstance();
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            if (con != null) {
                System.out.println("coneccion realizada");
            }

        } catch (SQLException | InstantiationException | IllegalAccessException ex) {
            System.err.println("problemas de coneccion\n" + ex.toString());
        } catch (ClassNotFoundException e) {
            System.err.println(e.toString());
        }
    }

    public static ConnectionBBDD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionBBDD();
        }
        return INSTANCE;
    }

    public Connection getConnection() {
        return con;
    }

}
