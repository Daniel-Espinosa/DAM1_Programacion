/*
Crear un proyecto Punto, que almacene las 3 coordenadas (enteras) x,y,z, por
separado, que contenga 3 constructores y un método para imprimir el punto en
pantalla con el formato : (x,y,z)
Además otra clase en el mismo paquete deberá contener un método main( ) para la
prueba del programa.
Atributos
x , y , z : coordenadas enteras del punto
Constructores
Punto(x,y,z) : asigna las tres coordenadas
Punto(c): asigna el mismo valor c a las tres coordenadas
Punto( ): asigna 0 a las tres coordenadas
Métodos
imprimir( ): imprime el punto en pantalla con formato : (x,y,z)
pedirCoordenadas(): pide al usuario por teclado los valores de los atributos.
main( ): Realiza las pruebas de la clase creando al menos tres objetos,
punto1,punto2,punto3,creados cada uno de ellos con un constructor.
Crea otro punto con valores pedidos por teclado.
Aplica sobre todos ellos el método imprimir.
*/
package Ejercicio1;

import java.util.Scanner;


public class Punto {
    
    private int x,y,z;
    
    
    //Punto( ): asigna 0 a las tres coordenadas
    public  Punto(){
        x = 0;
        y = 0;
        z = 0;
        
    }
    
    
    //Punto(c): asigna el mismo valor c a las tres coordenadas
    public Punto (int c){
        x = c;
        y = c;
        z = c;
        
    }
    
    public Punto(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;       
        
    }
    
    public void imprimir(){
        System.out.println("(" +x+ "," +y+ "," +z+")");
                
    }
    
    public void pedirCoordenadas(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce la coordenada x:");
        x = lectura.nextInt();
        System.out.println("Introduce la coordenada y:");
        y = lectura.nextInt();
        System.out.println("Introduce la coordenada z:");
        z = lectura.nextInt();
        
    }
    
    
    
    
    
}
