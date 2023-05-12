
public class Personal {

    //atributos
    private String dni;
    private int salario;
    
    // constructor

    public Personal() {
    }

    public Personal(String dni, int salario) {
        this.dni = dni;
        this.salario = salario;
    }
    
    //metodos set y get

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return ("Dni: " + dni + " Salario: " + salario);
    }
    
    
    
}
