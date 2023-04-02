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


public class Ejercicio1 {


    public static void main(String[] args) {
        
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(2);
        Punto punto3 = new Punto(1,2,3);
        
        Punto punto4 = new Punto();
        punto4.pedirCoordenadas();
     
        punto1.imprimir();
        punto2.imprimir();
        punto3.imprimir();
        punto4.imprimir();
        
        
    }
    
}
