
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.File;

/*
Añade 20 coches distintos al concesionario y realiza las siguientes consultas:

1.      Coches de la marca Seat.
2.      Coches con un precio de 15000 €.
3.      Coches que valen más de 20000 €.
4.      Coches con más de 3000 km.
5.      Coches con 0 km (usando QBE).
6.      Coches con 0 km (usando SODA).
7.      Coches de la marca Audi.
8.      Coches que valen menos de 18000 € (usando QBE).
9.      Coches que valen menos de 18000 € (usando SODA).

*/

/**
 *
 * @author Daniel Espinosa Garcia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Asignamos el fichero donde almacenaremos la informacion.
        File fichero = new File("Concesionario");
        //Borramos el fichero para no duplicar la informacion con cada inicio del programa
        fichero.delete();
        
        //Preparamos el Contenedor donde almacenaremos la informacion de nuestra BBDD
        ObjectContainer bd = Db4oEmbedded.openFile(fichero.getName());
        
        /*
        String marca;
    String modelo;
    double precio;
    int kilometros;
        */
        //Añadimos 20 coches
        String[] marca = {"Seat","Ford","Toyota","Kia","Mercedes","Audi","Opel","Seat","Ford","Toyota","Kia","Mercedes","Audi","Opel","Seat","Ford","Toyota","Kia","Mercedes","Audi"};
        String[] modelo = {"Ibiza","Mustang","Yaris","Sorento","Clase E","Audi A3","Astra","Ateca","Focus","Corolla","Rio","Clase C","Audi A4","Corsa","Arona","Fiesta","Aygo","Picanto","Clase S","Audi A5"};
        int[] precio = {15000,10000,25000,20000,17000,14000,28000,30000,19000,15800,17900,26700,17000,9000,16000,26000,24200,16000,17400,18900};
        int[] kilometros = {0,6000,32500,0,155000,9000,75826,65494,158360,0,161867,6519,19879,61640,0,216486,12050,6321,65848,17645};
        
        for (int i = 0; i < marca.length; i++) {
            Concesionario coche = new Concesionario(marca[i], modelo[i], precio[i],kilometros[i]);
            bd.store(coche);
            //System.out.println(coche.toString());
        }
        
        // Muestro por pantalla la informacion requerida
        
        System.out.println("1. Coches de la marca Seat. (QBE)");
        ObjectSet os = bd.queryByExample(new Concesionario("Seat",null,0,0));
        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("1. Coches de la marca Seat. (SODA)");
        Query query1=bd.query();
        query1.constrain(Concesionario.class);
        query1.descend("marca").constrain("Seat");
        os = query1.execute();
        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("2. Coches con un precio de 15000 € (SODA)");
        
        Query query2=bd.query();
        query2.constrain(Concesionario.class);
        query2.descend("precio").constrain(15000);
        os = query2.execute();

        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("3. Coches que valen más de 20000 € (SODA)");
        
        Query query3=bd.query();
        query3.constrain(Concesionario.class);
        query3.descend("precio").constrain(20000).greater();
        os = query3.execute();

        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("4. Coches con más de 3000 km (SODA)");
        
        Query query4=bd.query();
        query4.constrain(Concesionario.class);
        query4.descend("kilometros").constrain(3000).greater();
        os = query4.execute();

        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("5. Coches con 0 km (usando QBE)");
        
        os = bd.queryByExample(new Concesionario(null,null,0,0));
        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            if (c.getKilometros()==0) {
                System.out.println(c.toString());
            }  
        }
        
        
        System.out.println("");
        System.out.println("6. Coches con 0 km (usando SODA)");
        
        Query query5=bd.query();
        query5.constrain(Concesionario.class);
        query5.descend("kilometros").constrain(0);
        os = query5.execute();

        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("7. Coches de la marca Audi (SODA)");
        
        Query query6=bd.query();
        query6.constrain(Concesionario.class);
        query6.descend("marca").constrain("Audi");
        os = query6.execute();

        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        System.out.println("");
        System.out.println("8. Coches que valen menos de 18000 € (usando QBE)");
        
        os = bd.queryByExample(new Concesionario(null,null,0,0));
        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            if (c.getPrecio()<18000) {
                System.out.println(c.toString());
            }  
        }
        
        System.out.println("");
        System.out.println("9. Coches que valen menos de 18000 € (usando SODA)");

        Query query7=bd.query();
        query7.constrain(Concesionario.class);
        query7.descend("precio").constrain(18000).smaller();
        os = query7.execute();

        while(os.hasNext()){
            Concesionario c =(Concesionario) os.next();
            System.out.println(c.toString());
        }
        
        
        bd.close();
    }
    
}
