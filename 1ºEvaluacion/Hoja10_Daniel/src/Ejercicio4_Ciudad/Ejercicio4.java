/*
Crea un proyecto llamado Apellido1_ Ciudad. En él crea un paquete llamado ciudad y diseña una clase llamada Ciudad, con los atributos nombre, símbolo y temperatura, y los métodos siguientes:
• Los métodos necesarios para consultar y modificar los atributos de la clase(métodos get y set)
• Dos métodos estáticos “public static double” celsiusAFarenheit y farenheitACelsius que conviertan grados Celsius, introducidos como argumento, a Farenheit y viceversa.
En la elaboración ten en cuenta las siguientes fórmulas:
Farenheit a Celsius: C=(F-32)/1,8
Celsius a Farenheit: F= (1,8)*C +32
Además la clase tiene que tener
• Un constructor Ciudad por defecto y un constructor Ciudad que permita crear objetos de tres argumentos (utilizar el operador this.)
Prueba que dicha clase funciona correctamente, utilizando TODOS los métodos descritos anteriormente, sobre dos objetos que has de crear(uno con cada constructor) cuya información es la siguiente:
• Ciudad1: Un símbolo de la ciudad de París es la Torre Eiffel.
La temperatura media en la ciudad es de 20 ºC
• Ciudad2: Un símbolo de la ciudad de Honolulu es Waikiki Beach.
La temperatura media en la ciudad es de 88 ºF
de modo que el programa devuelva la temperatura media de la ciudad de París en grados Farenheit, y la temperatura media de la ciudad de Honolulu en grados Centígrados.
Salida del programa:
La temperatura media de la ciudad de París en grados Farenheit es 68.0
La temperatura media de la ciudad de Honolulu en grados Celsius es 31.11
*/
package Ejercicio4_Ciudad;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        
        Ciudad ciudad1 = new Ciudad ();
        Ciudad ciudad2 = new Ciudad ("Honolulu","Waikiki Beach",88);
        
        ciudad1.setNombre("Paris");
        ciudad1.setSimb("Torre Eiffel");
        ciudad1.setTemp(20);
        
        System.out.println("Un simbolo de la ciudad de " + ciudad1.getNombre() + " es " + ciudad1.getSimb());
        System.out.println("La temperatura media de " + ciudad1.getNombre() + " en grados es " + Ciudad.celsiusAFarenheit((int) ciudad1.getTemp()));
        
    }
    
}
