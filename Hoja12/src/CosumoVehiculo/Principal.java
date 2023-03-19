/*
 En una clase Principal
• Pon a prueba los métodos creando un objeto con los datos pasados por
teclado.
Se pueden diseñar para ello los métodos pedirDatos(), imprimirDatos, validar,..
• Crea un menú a disposición del usuario. Se aplicarán los métodos
implementados para resolver la petición del usuario.
INFORMACIÓN DEL TRAYECTO
1-Consultar datos del trayecto del vehículo
2-Consultar la velocidad media
3-Consultar consumo medio, en litros a los 100Km
4-Consultar consumo medio, en Euros a los 100Km
5-Salir
• Controla las excepciones y las repeticiones de menú,…
 */
package CosumoVehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        Scanner snNum =new Scanner(System.in);
        //Scanner snTxt = new Scanner(System.in);
        int var;
        
        Automovil au1 = new Automovil(10, 5, 50, 3);
        
        
        HashMap <Integer,String> mapa = new HashMap<>();
        LinkedList <Integer> pepe = new LinkedList<>();
        ArrayList <String> alist = new ArrayList<>();
        
        Iterator it =pepe.iterator();
        while (it.hasNext()) {
            Object next = it.next();
        }
        
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
        }
        
        
        
        
        do {
            System.out.println("Opciones");
            System.out.println("1-Consultar datos del trayecto del vehículo");
            System.out.println("2-Consultar la velocidad media");
            System.out.println("3-Consultar consumo medio, en litros a los 100Km");
            System.out.println("4-Consultar consumo medio, en Euros a los 100Km");
            System.out.println("5-Salir");
            var = snNum.nextInt();
            
            switch (var) {
                case 1:
                    //1-Consultar datos del trayecto del vehículo
                    System.out.println("Los datos del trayecto del Vehiculo Son:");
                    System.out.println("kilometros recorrridos: "+au1.kms);
                    System.out.println("tiempo empleado en h: " +au1.tiempo);
                    System.out.println("Litros consumidos en el trayecto: " +au1.litros);
                    System.out.println("Precio del combustible (en Euros/litro): " +au1.precGas );
                    break;
                    
                case 2:
                    //2-Consultar la velocidad media
                    System.out.println("velocidad Media: " +au1.calcularVelocidad());
                    break;
                    
                case 3:
                    //3-Consultar consumo medio, en litros a los 100Km
                    System.out.println("Consumo medio Litros/100km: " + au1.consumoMedio());                    
                    break;

                case 4:
                    //4-Consultar consumo medio, en Euros a los 100Km 
                    System.out.println("Consumo medio Euros/100km: " + au1.consumoEuros());
                    break;
                    
                case 5:
                    //5-Salir
                    System.out.println("Adios!");
                    break;
                    
                default:
                    System.out.println("introduce una opcion valida");
            }
            
        } while (var != 5);
        
        
    }
    
}
