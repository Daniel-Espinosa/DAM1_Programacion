
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.File;

/*
A partir de la clase Empleados, cuyos atributos son el nombre, estudios, edad y antigüedad:
Genera 20 empleados. Debe haber al menos tres nombres repetidos. 
Los estudios serán: ASIR, DAM o DAW. 
El rango de edad de los empleados será entre 24 y 50 años (ambos incluidos). 
La antigüedad estará entre 1 y 20 años (ambos incluidos).
Añade los 20 empleados a una base de datos orientada a objetos.
Realiza una consulta que muestre todos los empleados.
Modifica el nombre de todos los empleados con menos de 2 años de antigüedad.
Cambia los estudios de todos los empleados mayores de 30 años a ASIR.
Elimina todos los empleados que tengan menos de 25 años.
Elimina todos los empleados que tengan más de 18 años de antigüedad.
Realiza una consulta que muestre todos los empleados.
 */
/**
 *
 * @author damt108
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Asignamos el fichero donde almacenaremos la informacion.
        File fichero = new File("Concesionario");
        //Borramos el fichero para no duplicar la informacion con cada inicio del programa
        fichero.delete();

        //Preparamos el Contenedor donde almacenaremos la informacion de nuestra BBDD
        ObjectContainer bd = Db4oEmbedded.openFile(fichero.getName());

        // creamos los 20 Empleados
        String[] nombre = {"Albano", "Carmen", "Ramiro", "Daniel", "Javier"};
        String[] estudios = {"ASIR", "DAM", "DAW"};

        for (int i = 0; i < 20; i++) {

            int n = (int) (Math.random() * 5);
            int e = (int) (Math.random() * 3);
            int edad = (int) ((Math.random() * 26) + 24);
            int antiguedad = (int) ((Math.random() * 20) + 1);

            Empleados em = new Empleados(nombre[n], estudios[e], edad, antiguedad);
            //System.out.println(n + " " + e + " " + edad + " " + antiguedad);
            //System.out.println(em.toString());

            //añado los Empleados
            bd.store(em);

        }

        ObjectSet os;

        System.out.println("");
        System.out.println("1. Realiza una consulta que muestre todos los empleados.");
        Query query1 = bd.query();
        query1.constrain(Empleados.class);
        os = query1.execute();
        while (os.hasNext()) {
            Empleados e = (Empleados) os.next();
            System.out.println(e.toString());
        }

        System.out.println("");
        System.out.println("2. Modifica el nombre de todos los empleados con menos de 2 años de antigüedad.");
        System.out.println("SI EXISTEN SE LLAMARAN PEPE");
        Query query2 = bd.query();
        query2.constrain(Empleados.class);
        query2.descend("antiguedad").constrain(2).smaller();
        os = query2.execute();
        while (os.hasNext()) {
            Empleados e = (Empleados) os.next();
            System.out.println("SE MODIFICARA EL NOMBRE DE: " + e.toString());
            e.setNombre("PEPE");
            bd.store(e);
        }

        System.out.println("");
        System.out.println("3. Cambia los estudios de todos los empleados mayores de 30 años a ASIR.");
        Query query3 = bd.query();
        query3.constrain(Empleados.class);
        query3.descend("edad").constrain(30).greater();
        os = query3.execute();
        while (os.hasNext()) {
            Empleados e = (Empleados) os.next();
            e.setEstudios("ASIR");
            System.out.println(e.toString());
            bd.store(e);
        }

        System.out.println("");
        System.out.println("4. Elimina todos los empleados que tengan menos de 25 años.");
        Query query4 = bd.query();
        query4.constrain(Empleados.class);
        query4.descend("edad").constrain(25).smaller();
        os = query4.execute();
        while (os.hasNext()) {
            Empleados e = (Empleados) os.next();
            System.out.println("SE ELIMINARA: " + e.toString());
            bd.delete(e);
        }

        System.out.println("");
        System.out.println("5. Elimina todos los empleados que tengan más de 18 años de antigüedad.");
        Query query5 = bd.query();
        query5.constrain(Empleados.class);
        query5.descend("antiguedad").constrain(18).greater();
        os = query5.execute();
        while (os.hasNext()) {
            Empleados e = (Empleados) os.next();
            System.out.println("SE ELIMINARA: " + e.toString());
            bd.delete(e);
        }

        bd.close();

        // vuelvo a leer el fichero y creo otra conexion para ver que el fichero se modifico
        ObjectContainer bd2 = Db4oEmbedded.openFile(fichero.getName());

        System.out.println("");
        System.out.println("6. Realiza una consulta que muestre todos los empleados.");
        Query query6 = bd2.query();
        query6.constrain(Empleados.class);
        os = query6.execute();
        while (os.hasNext()) {
            
            Empleados e = (Empleados) os.next();
            System.out.println(e.toString());
        }

        bd2.close();

    }

}
