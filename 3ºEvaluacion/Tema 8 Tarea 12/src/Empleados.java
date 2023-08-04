/*
A partir de la clase Empleados, cuyos atributos son el nombre, estudios, edad y antigüedad:

 */

/**
 *
 * @author damt108
 */
public class Empleados {

    private String nombre;
    private String estudios;
    private int edad;
    private int antiguedad;

    public Empleados(String nombre, String estudios, int edad, int antiguedad) {
        this.nombre = nombre;
        this.estudios = estudios;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Estudios: " + estudios + ", Edad: " + edad + ", Antiguedad: " + antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
