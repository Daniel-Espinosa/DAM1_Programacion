package Ejercicio1;

import java.io.Serializable;

public class Personal implements Serializable{

    private String dni;
    private int salario;

    public Personal() {
    }

    public Personal(String dni, int salario) {
        this.dni = dni;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public static boolean validarDni(String dni) {
        // esto tiene mas sentido como dni utilizar un matches aunque no comparemos
        //dni.matches("[0-9]{8}[A-Z]")
        //como no especificas formato y solo quieres que tenga 8 coracteres lo mido con un lengt....
        if (dni.length() == 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarSalario(int salario) {
        if (salario <= 2100 && salario >= 1400) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Salario: " + salario + " €";
    }
    
    

}
