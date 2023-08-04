
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
        File fichero = new File("Colegio");
        //Borramos el fichero para no duplicar la informacion con cada inicio del programa
        fichero.delete();

        //Preparamos el Contenedor donde almacenaremos la informacion de nuestra BBDD
        ObjectContainer bd = Db4oEmbedded.openFile(fichero.getName());

        // Cargamos los datos de los estudiantes en la DB
        String[] nombre = {"Albano", "Carmen", "Ramiro", "Daniel", "Javier", "Marco", "Jose", "Borja", "Hector", "Francisco"};
        int[] edad = {6, 7, 8, 9, 10, 11, 12, 6, 7, 8};
        for (int i = 0; i < 10; i++) {
            int curso = (int) ((Math.random() * 6) + 1);
            Colegio estu = new Colegio(nombre[i], edad[i], curso);
            bd.store(estu);
        }

        System.out.println("1. Muestra todos los Estudiantes. (QBE)");
        ObjectSet os = bd.queryByExample(new Colegio(null, 0, 0));
        while (os.hasNext()) {
            Colegio e = (Colegio) os.next();
            System.out.println(e.toString());
        }

        System.out.println("");
        System.out.println("1. Muestra todos los Estudiantes. (SODA)");
        Query query1 = bd.query();
        query1.constrain(Colegio.class);
        os = query1.execute();
        while (os.hasNext()) {
            Colegio e = (Colegio) os.next();
            System.out.println(e.toString());
        }

        System.out.println("2. Muestra todos los Estudiantes menores de 7 años (QBE)");
        ObjectSet os2 = bd.queryByExample(new Colegio(null, 0, 0));
        while (os2.hasNext()) {
            Colegio e = (Colegio) os2.next();
            if (e.getEdad() < 7) {
                System.out.println(e.toString());
            }
        }

        System.out.println("");
        System.out.println("3. Muestra todos los Estudiantes mayores de 8 años (SODA)");
        Query query2 = bd.query();
        query2.constrain(Colegio.class);
        query2.descend("edad").constrain(8).greater();
        os = query2.execute();
        while (os.hasNext()) {
            Colegio e = (Colegio) os.next();
            System.out.println(e.toString());
        }

        System.out.println("");
        System.out.println("4. Muestra todos los Estudiantes de los cursos 1,3,5 (SODA)");
        Query query3 = bd.query();
        query3.constrain(Colegio.class);
        os = query3.execute();
        while (os.hasNext()) {

            Colegio e = (Colegio) os.next();
            if (e.getCurso() == 1 || e.getCurso() == 3 || e.getCurso() == 5) {
                System.out.println(e.toString());
            }

        }

        System.out.println("");
        System.out.println("5. Borra todos los estudiantes con mas de 10 años (SODA)");
        Query query4 = bd.query();
        query4.constrain(Colegio.class);
        query4.descend("edad").constrain(10).greater();
        os = query4.execute();
        while (os.hasNext()) {
            Colegio e = (Colegio) os.next();
            System.out.println("BORRANDO A : " + e.toString());
            bd.delete(e);
        }

        System.out.println("");
        System.out.println("6. Modifico la edad del primer estudiante de las lista (SODA)");
        Query query5 = bd.query();
        query5.constrain(Colegio.class);
        os = query5.execute();
        boolean primero = false;
        while (os.hasNext()) {
            Colegio e = (Colegio) os.next();
            if (primero == false) {
                System.out.println("Estudiante Edad sin modificar: " + e.getNombre() + " Edad: " + e.getEdad());
                e.setEdad(e.getEdad() + 1);
                System.out.println("Estudiante Edad modificada: " + e.getNombre() + " Edad: " + e.getEdad());
                primero = true;
            }

        }

        System.out.println("");
        System.out.println("7. Muestro todos los estudiantes (SODA)");
        Query query6 = bd.query();
        query6.constrain(Colegio.class);
        os = query6.execute();
        while (os.hasNext()) {
            Colegio e = (Colegio) os.next();
            System.out.println(e.toString());

        }

        bd.close();
    }

}
