
public class Alumno {
    
    private String nombre;
    private double calificacion;

    public Alumno() {
    }

    public Alumno(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Nota: " + calificacion);
    }


    
    
}
