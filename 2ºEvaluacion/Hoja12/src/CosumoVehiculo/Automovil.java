/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CosumoVehiculo;

/**
 *
 * @author produccion
 */
public class Automovil extends Vehiculo{
    protected int litros; //Litros de combustible consumido en el trayecto
    protected int precGas; //Precio del combustible (en Euros/litro)
    
    
    
    /*
    public Automovil (int litros, int precGas, int kms, int tiempo){
        this.litros = litros;
        this.precGas = precGas;
        this.kms = kms;
        this.tiempo = tiempo;
    }
    */



    public Automovil(int litros, int precGas, int kms, int tiempo){
        super(kms, tiempo);
        this.litros = litros;
        this.precGas = precGas;
    }

    @Override
    public double calcularVelocidad() {
        return kms/tiempo;
    }
    
    @Override
    public String toString(){
        return "hola";
    }
    
    
    
    /**
     * lo que sea
     * @return  bla bla
     */
    
    public double consumoMedio (){
    /*Consumo medio del vehículo (en litros cada 100 kilómetros).
Los cálculos se realizarán teniendo en cuenta los Km recorridos y los litros
consumidos*/  
    return litros*100/kms;
    } 

    public double consumoEuros (){
/*Consumo medio del vehículo (en euros cada 100 Kilómetros).
Los cálculos se realizarán teniendo en cuenta los Km recorridos, los litros
consumidos y el precio del combustible*/
    return this.consumoMedio()*litros;
    }
            
    
    
    
    
    
    
}
