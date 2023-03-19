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


public class Ciudad {
    
    String nombre, simb;
    int temp;
    
    //constructores
    public Ciudad(){
        
    }
            
    public Ciudad(String nombre, String simb, int temp){
        this.nombre = nombre;
        this.simb = simb;
        this.temp = temp;
    }
    
    
    //metodos

    public String getNombre() {
        return nombre;
    }

    public float getTemp() {
        return temp;
    }

    public String getSimb() {
        return simb;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setSimb(String simb) {
        this.simb = simb;
    }
    
    public static double celsiusAFarenheit(int tempC){
        //Celsius a Farenheit: F= (1,8)*C +32
        return (1.8*tempC)+32;
    }
    
    public static double farenheitACelsius(int tempF){
        //Farenheit a Celsius: C=(F-32)/1,8
        return (tempF-32)/1.8;
    }
    
}
