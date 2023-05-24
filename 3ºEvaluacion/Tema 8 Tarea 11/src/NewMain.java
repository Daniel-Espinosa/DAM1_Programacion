
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.File;

/*
Implementa la clase Producto, cuyos atributos serán el nombre, categoría, precio y stock (booleano) del producto.
Incluye un constructor con parámetros, los métodos set y get, y un método que muestre por pantalla el valor de los atributos.

Añade 20 productos distintos al inventario y realiza las siguientes consultas:

Productos de la categoría "Electrodomésticos".
Productos con un precio de 100 €.
Productos que cuestan más de 200 €.
Productos con más de 50 unidades en stock.
Productos con 0 unidades en stock (usando QBE).
Productos con 0 unidades en stock (usando SODA).
Productos que cuestan menos de 150 € (usando QBE).
Productos que cuestan menos de 150 € (usando SODA).
Productos en stock (usando QBE).
Productos con el nombre "ordenador".
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
        // TODO code application logic here

        // Asignamos el fichero donde almacenaremos la informacion.
        File fichero = new File("Almacen");
        //Borramos el fichero para no duplicar la informacion con cada inicio del programa
        fichero.delete();

        //Preparamos el Contenedor donde almacenaremos la informacion de nuestra BBDD
        ObjectContainer bd = Db4oEmbedded.openFile(fichero.getName());

        // Creo los productos
        Producto p1 = new Producto("ordenador", "Informatica", 255, 15);
        Producto p2 = new Producto("Raton", "Informatica", 255, 100);
        Producto p3 = new Producto("Tablet", "Informatica", 100, 5);
        Producto p4 = new Producto("Impresora", "Informatica", 150, 20);
        Producto p5 = new Producto("Monitor", "Informatica", 200, 50);
        Producto p6 = new Producto("Frigorifico", "Electrodomésticos", 1000, 60);
        Producto p7 = new Producto("Congelador", "Electrodomésticos", 950, 30);
        Producto p8 = new Producto("Lavadora", "Electrodomésticos", 700, 17);
        Producto p9 = new Producto("Lavavajillas", "Electrodomésticos", 500, 28);
        Producto p10 = new Producto("Secadora", "Electrodomésticos", 425, 37);
        Producto p11 = new Producto("Horno", "Electrodomésticos", 398, 51);
        Producto p12 = new Producto("Xiaomi 13", "Movil", 300, 80);
        Producto p13 = new Producto("Galaxy S2", "Movil", 150, 0);
        Producto p14 = new Producto("One Plus 11", "Movil", 500, 30);
        Producto p15 = new Producto("Oppo Reno", "Movil", 450, 50);
        Producto p16 = new Producto("Xiaomi 7 Lite", "Movil", 200, 15);
        Producto p17 = new Producto("GBA", "Consola", 229, 400);
        Producto p18 = new Producto("PS5", "Consola", 459, 100);
        Producto p19 = new Producto("Xbox", "Consola", 399, 67);
        Producto p20 = new Producto("Sega Saturn", "Consola", 300, 0);

        // Añado los 20 productos
        bd.store(p1);
        bd.store(p2);
        bd.store(p3);
        bd.store(p4);
        bd.store(p5);
        bd.store(p6);
        bd.store(p7);
        bd.store(p8);
        bd.store(p9);
        bd.store(p10);
        bd.store(p11);
        bd.store(p12);
        bd.store(p13);
        bd.store(p14);
        bd.store(p15);
        bd.store(p16);
        bd.store(p17);
        bd.store(p18);
        bd.store(p19);
        bd.store(p20);

        // Muestro por pantalla la informacion requerida
        System.out.println("Productos de la categoría Electrodomésticos");
        Query query1 = bd.query();
        query1.constrain(Producto.class);
        query1.descend("categoria").constrain("Electrodomésticos");
        ObjectSet os = query1.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }

        System.out.println("");
        System.out.println("Productos con un precio de 100 €");
        Query query2 = bd.query();
        query2.constrain(Producto.class);
        query2.descend("precio").constrain(100);
        os = query2.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }

        System.out.println("");
        System.out.println("Productos que cuestan más de 200 €");
        Query query3 = bd.query();
        query3.constrain(Producto.class);
        query3.descend("precio").constrain(200).greater();
        os = query3.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }

        System.out.println("");
        System.out.println("Productos con más de 50 unidades en stock.");
        Query query4 = bd.query();
        query4.constrain(Producto.class);
        query4.descend("stock").constrain(50).greater();
        os = query4.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }

        System.out.println("");
        System.out.println("Productos con 0 unidades en stock (usando QBE)");
        os = bd.queryByExample(new Producto(null, null, 0, 0));
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            if (p.getStock() == 0) {
                System.out.println(p.toString());
            }
        }

        System.out.println("");
        System.out.println("Productos con 0 unidades en stock (usando SODA)");
        Query query5 = bd.query();
        query5.constrain(Producto.class);
        query5.descend("stock").constrain(0);
        os = query5.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }

        System.out.println("");
        System.out.println("Productos que cuestan menos de 150 € (usando QBE)");
        os = bd.queryByExample(new Producto(null, null, 0, 0));
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            if (p.getPrecio() < 150) {
                System.out.println(p.toString());
            }
        }

        System.out.println("");
        System.out.println("Productos que cuestan menos de 150 € (usando SODA)");
        Query query6 = bd.query();
        query6.constrain(Producto.class);
        query6.descend("precio").constrain(150).smaller();
        os = query6.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }

        System.out.println("");
        System.out.println("Productos en stock (usando QBE)");
        os = bd.queryByExample(new Producto(null, null, 0, 0));
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            if (p.getStock() > 0) {
                System.out.println(p.toString());
            }
        }
        
        System.out.println("");
        System.out.println("Productos con el nombre ordenador");
        Query query7 = bd.query();
        query7.constrain(Producto.class);
        query7.descend("nombre").constrain("ordenador");
        os = query7.execute();
        while (os.hasNext()) {
            Producto p = (Producto) os.next();
            System.out.println(p.toString());
        }
        
        bd.close();
    }

}
