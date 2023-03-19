/*Clase Principal
En la clase Principal se creará un objeto Taller y se interactuará con un usuario al
que se le presentará el siguiente menú:
1. Añadir coche
2. Eliminar coche
3. Salir
Al salir se llamará a los métodos visualizaMatriculas, visualizaCoches, visualizaTaller.
El menú se resolverá utilizando los métodos creados. El menú será repetitivo en
todos los casos incluidos los casos de opción no válida o dato de formato incorrecto,
hasta que el usuario seleccione la opción 3.*/
package hoja15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Taller listado = new Taller();
        boolean contr = true;
        
        do {
            
            try {
                System.out.println("1 añadir coche");
                System.out.println("2 eleminar coche");
                System.out.println("3 salir");
                Scanner sc =new Scanner (System.in);
                int linea = sc.nextInt();
            
            
                switch (linea) {
                    case 1:
                        listado.anadeElemento();
                        break;
                    case 2:
                        listado.eliminaElemento();
                        break;
                    case 3:
                        contr =false;
                        listado.visualizaMatriculas();
                        listado.visualizaCoches();
                        listado.visualizaTaller();
                        break;
                    default:
                        throw new InputMismatchException ();
                }
            } catch (InputMismatchException e) {
                System.err.println("introdocuce una opcion valida");
                
            } catch (Exception e) {
                
                
            }
 
        } while (contr);




    }
    
}
