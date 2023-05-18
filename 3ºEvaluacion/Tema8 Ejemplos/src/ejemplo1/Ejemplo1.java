package ejemplo1;

import com.db4o.*;

public class Ejemplo1 {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Pedro", 6);
        Estudiante e2 = new Estudiante("Nuria", 7);
        Estudiante e3 = new Estudiante("Luis", 4);
        Estudiante e4 = new Estudiante("Pedro", 6);

        ObjectContainer bd = Db4oEmbedded.openFile("Ejemplo");

        bd.store(e1);
        bd.store(e2);
        bd.store(e3);
        bd.store(e4);

        bd.close();

    }

}
