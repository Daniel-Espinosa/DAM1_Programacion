package ejercicio14;

public class Agenda{

    private Persona[] array_personas;
    private int contador_personas;


    public Agenda(int tamano) {
        contador_personas = 0;
        array_personas = new Persona[tamano];
    }

    public void anadir(Persona persona) {
        if (array_personas.length >= contador_personas) {
            array_personas[contador_personas] = persona;
            contador_personas++;
            System.out.println("El contacto se ha añadido a la agenda.");
        } else {
            System.out.println("El contacto no se ha podido añadir a la agenda porque no hay espacio.");
        }

    }

    public void mostrar() {
        for (int i = 0; i < contador_personas; i++) {
            System.out.println("El nombre del contacto es " + array_personas[i].getNombre() + " y su teléfono es " + array_personas[i].getTelefono());
        }
    }

    public void buscar(String nombre) {
        for (int i = 0; i < contador_personas; i++) {
            if (array_personas[i].getNombre().equals(nombre)) {
                System.out.println("Los datos del contacto son: " + array_personas[i].getNombre() + " y " + array_personas[i].getTelefono());
            }
        }
    }

    public void modificar(String nombre, int telefono) {
        for (int i = 0; i < contador_personas; i++) {
            if (array_personas[i].getNombre().equals(nombre)) {
                array_personas[i] = new Persona(nombre, telefono);
                System.out.println("El contacto ha sido modificado.");
            }
        }
    }
    
    public int getContador_personas() {
        return contador_personas;
    }

    
    
}
