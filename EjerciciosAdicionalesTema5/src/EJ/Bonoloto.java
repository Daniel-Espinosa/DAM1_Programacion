/*6.- Diseñar una clase llamada Bonoloto que tiene como atributo privado un array
numérico entero de 6 elementos y los siguientes métodos:
• Un constructor que inicializa el array con 6 números aleatorios distintos
comprendidos entre 1 y 49.
• Un método llamado mostrar que devuelva una cadena de texto que muestre el
contenido del array.
Nota: No se pueden repetir los números*/
package EJ;

public class Bonoloto {

    //atributo privado un array numérico entero de 6 elementos
    private int array[] = new int[6];

    //Un constructor que inicializa el array con 6 números aleatorios distintos comprendidos entre 1 y 49.
    public Bonoloto(){
        int cont=0;

        do {
            boolean control= false;
            int valor = (int) (Math.random() * 49 + 1);
            for (int i : array) {
                if (i==valor) {
                    control=true;
                }
            }
            if (control!=true) {
                array[cont]=valor;
                cont++;
            }

        } while (cont<array.length);

    }   

    //• Un método llamado mostrar que devuelva una cadena de texto que muestre el contenido del array.
    public void mostrar(){
        System.out.println("resultados de la bonoloto");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }




}
