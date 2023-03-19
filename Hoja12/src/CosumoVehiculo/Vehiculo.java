/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CosumoVehiculo;

/**
 *
 * @author produccion
 */
public abstract class Vehiculo {
    protected int kms; //Kilómetros recorridos en el trayecto
    protected int tiempo; //tiempo empleado en el trayecto en horas
    
    

    //metodo
    //devuelve la velocidad media empleada en el viaje en km/hora
    public abstract double calcularVelocidad();

    public Vehiculo(int kms, int tiempo) {
        this.kms = kms;
        this.tiempo = tiempo;
    }

}
