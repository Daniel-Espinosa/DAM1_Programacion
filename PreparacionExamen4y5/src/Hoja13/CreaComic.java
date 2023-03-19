/*En una clase principal llamada CreaComic crea un objeto comic c1 con los
siguientes datos: Título: Watchmen, Guionista: Alan Moore, Dibujante: Dave
Gibbons, número 3. Utiliza el método getTitulo para comprobar en ejecución si
está correctamente creado. */
package Hoja13;


public class CreaComic {


    public static void main(String[] args) {
        
        Comic c1 = new Comic( "Watchmen","Alan Moore", "Dave Gibbons",3);
        System.out.println(c1.getTitulo());
        
        Comic array[] = new Comic[12];
        
        /*En realidad, Watchmen fue una maxiserie de 12 números, cuyos elementos son
        todos los mismos, salvo por el número. Crea un array de 12 elementos del tipo
        Comic y almacena en él los 12 números de Watchmen con los datos anteriores.
        Después muéstralo en pantalla mediante el método mostrarInformación. */
        
        for (int i = 0; i < array.length; i++) {
            Comic cA = new Comic("Watchmen","Alan Moore", "Dave Gibbons",(i+1));
            array[i] = cA; 
        }
        
        for (Comic comic : array) {
            comic.mostrar_informacion();
        }
        
        /*Creamos una novela gráfica con los siguientes
        datos: Título: Los Campbell: El Oro de San Brandamo, Dibujante: José Luis
        Munuera, Guionista: José Luis Munuera, Número 4, número de páginas 56.
        Mostrarlo en pantalla.*/
        
        NovelaGrafica ng = new NovelaGrafica(56, "Los Campbell: El Oro de San Brandamo", "José Luis Munuera", "José Luis Munuera", 4);
        ng.mostrar_informacion();
        
        
        
    }
    
}
