/*
Crea un nuevo proyecto en Netbeans. Debes diseñar una aplicación en la cual incluyas:

Al menos una herencia entre clases.
Al menos cuatro atributos en total.
Los métodos set y get de una clase no abstracta.
El constructor por defecto y con parámetros de una clase no abstracta.
Una clase abstracta (con al menos un método abstracto).
Un método mostrarInformación() que permita ver por pantalla todos los atributos de un objeto.
Un método que devuelva un cálculo realizado con los atributos del objeto.
Prueba desde una clase principal a crear un objeto con cada constructor y mostrar por pantalla lo que devuelven los métodos de los dos puntos anteriores.
La temática es libre.
 */
package tarea4;


public class Tarea4 {
    
    //Trabajaremos con numeros Short
    //en el objeto suma1 pedira por teclado los valores de Para realizar una suma.
    //en el objeto suma2 los valores vendran por defecto Para realizar la suma.
    //Se sumaran los resultados de Suma1 y Suma2 en el Objeto Suma3
    
    public static void main(String[] args) {

        Sumatoria suma1 = new Sumatoria();
        Sumatoria suma2 = new Sumatoria(55,20);
        Sumatoria suma3 = new Sumatoria();
        
        //pedimos los datos por teclado;
        suma1.sumando1 = suma1.pedirDatos();
        //System.out.println(suma1.sumando1);
        
        suma1.sumando2 = suma1.pedirDatos();
        //System.out.println(suma1.sumando2);
        
        //realizamos la suma1
        suma1.suma();
        
        //mostramos por pantalla suma1
        System.out.println("\nSuma 1");
        suma1.mostrarInformacion();
        
        //realizamos la suma2
        suma2.suma();
        
        //mostramos por pantalla suma2
        System.out.println("\nSuma 2");
        suma2.mostrarInformacion();
        
        //damos los valores del resultado de las primeras sumas a suma3
        suma3.setSumando1(suma1.getResultado());
        suma3.setSumando2(suma2.getResultado());

        //realizamos la suma3
        suma3.suma();
        
        //mostramos por pantalla la suma.
        System.out.println("\nSuma3");
        System.out.println("Sumando1: " + suma3.getSumando1());
        System.out.println("Sumando2: " + suma3.getSumando2());
        System.out.println("Resultado: " + suma3.getResultado());

        

    }
    
}
