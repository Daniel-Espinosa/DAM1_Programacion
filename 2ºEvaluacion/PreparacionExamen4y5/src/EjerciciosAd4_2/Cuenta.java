/*Ejercicio 2. Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de
la cuenta son: nombre del cliente (String), número de cuenta (String), tipo de interés
(double) y saldo (double).*/
package EjerciciosAd4_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuenta {
    public String cliente,cuent;
    public double tipoInt, saldo;

    public Cuenta() {
    }

    public Cuenta(String cliente, String cuent, double tipoInt, double saldo) {
        this.cliente = cliente;
        this.cuent = cuent;
        this.tipoInt = tipoInt;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCuent() {
        return cuent;
    }

    public void setCuent(String cuent) {
        this.cuent = cuent;
    }

    public double getTipoInt() {
        return tipoInt;
    }

    public void setTipoInt(double tipoInt) {
        this.tipoInt = tipoInt;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /*Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la
    cantidad que se indique. Esa cantidad no puede ser negativa. Un reintegro
    consiste en disminuir el saldo en una cantidad, pero antes se debe comprobar
    que hay saldo suficiente. La cantidad no puede ser negativa. Los métodos ingreso
    y reintegro devuelven true si la operación se ha podido realizar o false en caso
    contrario. */
    
    public boolean ingreso(){
        try {
            System.out.println("importe a ingresar:");
            Scanner scN = new Scanner (System.in);
            double ingreso = scN.nextDouble();
            if (ingreso<=0) {
                System.out.println("el importe a ingresar tiene que se mayor 0"); 
                return false;
            } else {
                saldo += ingreso;
                System.out.println("ingreso realizado");
                return true;
            }

        } catch (InputMismatchException e) {
            System.err.println("ingresa una cantidad valida");
        } catch (Exception e) {
            System.err.println("Exception");
        }
            // me obliga aunque nunca llegara ;)
        return false;
    }
    
    public boolean reintegro(){
        try {
            System.out.println("importe a retirar");
            Scanner scN = new Scanner (System.in);
            double reintegro = scN.nextDouble();
            if (reintegro<=0) {
                System.out.println("el importe que desa retirar tiene que se mayor 0"); 
                return false;
            } else if (reintegro>saldo) {
                System.out.println("saldo insuficiente");
                return false;
            } else {
                saldo -= reintegro;
                System.out.println("reintegro realizado");
                return true;
            }

        } catch (InputMismatchException e) {
            System.err.println("ingresa una cantidad valida");
        } catch (Exception e) {
            System.err.println("Exception");
        }
        // me obliga aunque nunca llegara ;)
        return false;
    }
    
    /*Método transferencia que permita pasar dinero de una cuenta a otra siempre
que en la cuenta de origen haya dinero suficiente para poder hacerla. Ejemplo
de uso del método transferencia: cuentaOrigen.transferencia(cuentaDestino,
importe); que indica que queremos hacer una transferencia desde cuentaOrigen
a cuentaDestino del importe indicado*/
    
    public boolean transferencia (Cuenta destino, double importe){
        if (saldo < importe) {
            System.out.println("Saldo insuficiente para realizar la transferencia");
            return false;
        } else if (importe <=0) {
            System.out.println("el importe a transferir tiene que ser > 0");
            return false;
        } else {
            saldo -= importe;
            destino.setSaldo(destino.getSaldo()+importe);
            return true;
        }
 
    }
       
    
}
