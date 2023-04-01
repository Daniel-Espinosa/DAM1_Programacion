package hoja18_almacen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal_Almacen {
    
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader (isr);
        Almacen almacen = new Almacen();
        almacen.cambiarAlmacen();
        int opcion=0;
        do{
            try{
                System.out.println("\nMenú:");
                System.out.println("\t1. Añadir un nuevo artículo en el almacén.");
                System.out.println("\t2. Visualizar el contenido del almacén.");
                System.out.println("\t3. Pedidos necesarios de realizar.");
                System.out.println("\t4. Cantidad de artículos distintos en el almacén.");
                System.out.println("\t5. Total de existencias.");
                System.out.println("\t6. Modificar el número de existencias de un artículo del almacén.");
                System.out.println("\t7. Borrar un artículo del almacén.");
                System.out.println("\t8. Cantidad de artículos distintos que ha habido en el almacén.");
                System.out.println("\t9. Cambiar de almacén.");
                System.out.println("\t10. Salir.");

                opcion=Integer.parseInt(teclado.readLine());
                switch (opcion) {
                    case 1:
                        almacen.annadirArticulo();
                        break;
                    case 2:
                        almacen.visualizarAlmacen();
                        break;
                    case 3:
                        almacen.mostrarPedidos();
                        break;
                    case 4:
                        almacen.cantidadDistintos();
                        break;
                    case 5:
                        almacen.totalExistencias();
                        break;
                    case 6:
                        almacen.modificarExistencias();
                        break;
                    case 7:
                        almacen.borrarArticulo();
                        break;
                    case 8:
                        System.out.println("El número de artículos diferentes que han pasado por todos nuestros almacenes es: "+almacen.getHistorial().size());
                        break;
                    case 9:
                        almacen.cambiarAlmacen();
                        break;
                    case 10:
                        almacen.guardarFichero();
                        System.out.println("Saliendo.");
                        break;
                    default:
                        System.out.println("Has escogido una opción incorrecta.");
                }
            }catch (NumberFormatException e){
                System.err.println("Tipo de dato inválido.");
            }catch (IOException e){
                System.err.println("IOException");
            }
        }while(opcion!=10);
        
    }
    
}
