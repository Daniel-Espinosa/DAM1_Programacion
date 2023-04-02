
package electrodomesticos;

import java.util.Scanner;


public class ClasePrincipal {


    public static void main(String[] args) {
        
        
    //Objetos:
        //Creamos el objeto Lectura de la clase escaner para poder introducir datos
        Scanner lectura = new Scanner(System.in);
        //Creamos el objeto electrodomestico1 con el constructor por defeto
        Electrodomestico electrodomestico1 = new Electrodomestico();
        //Creamos el objeto electrodomestico2 con el constructor  con argumentos
        Electrodomestico electrodomestico2 = new Electrodomestico("BS4321","Bosch",57.35);
        
        
    //Electrodomestico 1
        // Sacamos por pantalla los atributos del electrodomestico1
        System.out.println("Los atrigbutos del electrodomestico 1 son:");
        System.out.println("Numero de Serie: " + electrodomestico1.getNumSerie());
        System.out.println("Marca: " + electrodomestico1.getMarca());
        System.out.println("El precio es: " + electrodomestico1.getPrecio() + " €");
        System.out.println("");
        
        //utilizamos el metodo Set para modificar los atributos del objeto electrodomestico1
        electrodomestico1.setNumSerie("NS1234");
        electrodomestico1.setMarca("Siemenes");
        
        // Sacamos por pantalla los atributos del electrodomestico1
        System.out.println("Los atrigbutos del electrodomestico 1 ahora son :");
        System.out.println("Numero de Serie: " + electrodomestico1.getNumSerie());
        System.out.println("Marca: " + electrodomestico1.getMarca());
        System.out.println("El precio es: " + electrodomestico1.getPrecio() + " €");
        System.out.println("");
    
    //Electrodomestico 2
        //Aplicamos el metodo aplicarIva sobre el objeto electrodomestico2 y sacamos por pantalla el nuevo precio:
        System.out.println("Electrodomestico 2");
        System.out.println("Numero de Serie: " + electrodomestico2.getNumSerie());
        System.out.println("Marca: " + electrodomestico2.getMarca());
        System.out.println("El precio es: " + electrodomestico2.getPrecio() + " €");
        electrodomestico2.aplicarIva();
        System.out.println("El precio del electrodomestico2 con el IVA del 21% es: " + electrodomestico2.getPrecio() + " €");
        System.out.println("");
        double rebaja;
        
        //Rebaja de percio del electrodomestico2 aplicamos el metodo rebajar Precio
        do {
            System.out.println("Introduce el porcentaje que deceas rebajar al precio (Para salir el % sera <= 0) ");
            rebaja = lectura.nextDouble();
            
            if (rebaja >0) {
                electrodomestico2.rebajarPrecio(rebaja);
                System.out.println("El precio con la rebaja es de: " + electrodomestico2.getPrecio() + " €");
            }
            
        } while (rebaja >0 );
        
    }
    
}
